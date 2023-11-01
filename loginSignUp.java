package com.example.codex_thecodingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

public class loginSignUp extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";
    public static final String PREF_NAME = "MyPrefFile";
    MaterialEditText editUserEmail, editUserPassword,editUserName;

    MaterialEditText loginUserName, loginUserPassword;

    Button login_btn;
    TextView signUp_btn;
    FirebaseDatabase database;
    DatabaseReference users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);

        database = FirebaseDatabase.getInstance();
        users = database.getReference("Users");


        loginUserName = findViewById(R.id.loginUserName);

        loginUserPassword = findViewById(R.id.loginUserPassword);


        login_btn = findViewById(R.id.login_btn);
        signUp_btn = findViewById(R.id.signUp_btn);


        signUp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences(loginSignUp.PREFS_NAME,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putBoolean("hasRegistered",true);
                editor.apply();
                showSignUpDialog();
            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences(loginSignUp.PREF_NAME,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putBoolean("hasLoggedIn",true);
                editor.apply();
                login_user(loginUserName.getText().toString(), loginUserPassword.getText().toString());
            }
        });


    }

    private void login_user(String user, String password) {

        users.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.child(user).exists()){

                    if(!user.isEmpty()){
                        User loginUser = snapshot.child(user).getValue(User.class);
                        if(loginUser.getPassword().equals(password)){
                            Toast.makeText(loginSignUp.this, "Logged in successfully!", Toast.LENGTH_SHORT).show();
                            sendUserToNextActivity();
                        }
                        else{
                            loginUserPassword.setError("Please enter the correct password");
                            loginUserPassword.requestFocus();
                        }
                    }
                    else{
                        loginUserName.setError("Please enter username");
                        loginUserName.requestFocus();
                    }
                }
                else{
                    loginUserName.setError("User does not exists");
                    loginUserName.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void sendUserToNextActivity() {
        Intent intent = new Intent(loginSignUp.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }

    private void showSignUpDialog() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(loginSignUp.this);


        LayoutInflater inflater = this.getLayoutInflater();
        View signup = inflater.inflate(R.layout.signup,null);

        editUserName = signup.findViewById(R.id.editUserName);
        editUserEmail = signup.findViewById(R.id.editUserEmail);
        editUserPassword = signup.findViewById(R.id.editUserPassword);

        alertDialog.setView(signup);




        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                User user = new User(editUserName.getText().toString(),
                        editUserEmail.getText().toString(),
                        editUserPassword.getText().toString());


                users.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
        final String username = editUserName.getText().toString();
        final String useremail = editUserEmail.getText().toString();
        final String userpass = editUserPassword.getText().toString();

                        if(snapshot.child(user.getUserName()).exists()){
                            Toast.makeText(loginSignUp.this, "User already exists", Toast.LENGTH_SHORT).show();

                        }

                        else if(username.isEmpty()){
                            editUserName.setError("Username required");
                            editUserName.requestFocus();
                            Toast.makeText(loginSignUp.this, "User is required", Toast.LENGTH_SHORT).show();


                        }
                        else if(useremail.isEmpty()){
                            editUserEmail.setError("Username required");
                            editUserEmail.requestFocus();
                            Toast.makeText(loginSignUp.this, "Email is required", Toast.LENGTH_SHORT).show();


                        }
                        else if(userpass.isEmpty()){
                            editUserPassword.setError("Username required");
                            editUserPassword.requestFocus();
                            Toast.makeText(loginSignUp.this, "Password is required", Toast.LENGTH_SHORT).show();


                        }
                        else{
                            users.child(user.getUserName())
                                    .setValue(user);
                            Toast.makeText(loginSignUp.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                            sendUserToNextActivity();
                            dialog.dismiss();

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        alertDialog.show();
    }
}