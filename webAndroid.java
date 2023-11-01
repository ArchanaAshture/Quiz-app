package com.example.codex_thecodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class webAndroid extends AppCompatActivity {
    private String[] questions= {"Q.1 Which company developed android?", "Q.2 Which company bought android?", "Q.3 Web browser available in android is based on",
        "Q.4 Android is based on which kernel?"};
    //private String[] answers= {"Google", "Google", "Open-source webkit", "Linux Kernel"};
    private boolean[] rightAnsBA = {false, false,false,true};
    private boolean[] rightAnsBB = {true, true,false,false};
    private boolean[] rightAnsBC = {false, false,true,false};
    private boolean[] rightAnsBD = {false, false,false,false};

    private String[] buttonA = {"Google", "Amazon", "Chrome", "Linux"};
    private String[] buttonB = {"Android", "Google", "Opera", "MAC"};
    private String[] buttonC = {"TCS", "HCL", "Open-source Webkit", "Hybrid"};
    private String[] buttonD = {"Info sys", "Cognizant", "Firefox", "Windows"};

    Button button;
    Button button2;
    Button button11;
    Button button12;
    TextView question;
    private int index = 0;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_android);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);

        question = findViewById(R.id.question);
        question.setText(questions[index]);

        button.setText(buttonA[index]);
        button2.setText(buttonB[index]);
        button11.setText(buttonC[index]);
        button12.setText(buttonD[index]);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(rightAnsBA[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1) {

                        question.setText(questions[index]);
                        button.setText(buttonA[index]);
                        button2.setText(buttonB[index]);
                        button11.setText(buttonC[index]);
                        button12.setText(buttonD[index]);
                    }
                    else{
                        Toast.makeText(webAndroid.this, "Your score is: " +score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(webAndroid.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(rightAnsBB[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){

                        question.setText(questions[index]);
                        button.setText(buttonA[index]);
                        button2.setText(buttonB[index]);
                        button11.setText(buttonC[index]);
                        button12.setText(buttonD[index]);
                    }
                    else{
                        Toast.makeText(webAndroid.this, "Your score is: " +score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(webAndroid.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(rightAnsBC[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){

                        question.setText(questions[index]);
                        button.setText(buttonA[index]);
                        button2.setText(buttonB[index]);
                        button11.setText(buttonC[index]);
                        button12.setText(buttonD[index]);
                    }
                    else{
                        Toast.makeText(webAndroid.this, "Your score is: " +score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(webAndroid.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index<=questions.length-1){
                    if(rightAnsBD[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){

                        question.setText(questions[index]);
                        button.setText(buttonA[index]);
                        button2.setText(buttonB[index]);
                        button11.setText(buttonC[index]);
                        button12.setText(buttonD[index]);
                    }
                    else{
                        Toast.makeText(webAndroid.this, "Your score is: " +score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(webAndroid.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}