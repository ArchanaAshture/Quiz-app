package com.example.codex_thecodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class aiml extends AppCompatActivity {
    private String[] aimlQues = {"1. The “Father of Artificial Intelligence” is:","2. Which of the following is the common language for Artificial Intelligence?","3. The process of breaking an image into parts is called?","4. Which is the following is most straightforward approach for planning algorithm?","5. The conference launches the revolution of AI in 1956 was held at"};

    private String[] aiOptA = {"Alan Turing","Python","Smoothing","Best-first search","Dartmouth"};
    private String[] aiOptB = {"Charles Babbage","Java","Segmentation","Depth First Search","Harvard"};
    private String[] aiOptC = {"John McCarthy","Lisp","Processing","State space search","New York"};
    private String[] aiOptD = {"None","Php","Break Down","Binary Search","Stanford"};

    private boolean[] validCheckA = {false,true,false,false,true};
    private boolean[] validCheckB = {false,false,true,false,false};
    private boolean[] validCheckC = {true,false,false,true,false};
    private boolean[] validCheckD = {false,false,false,false,false};

    private int index = 0;
    private int score = 0;

    Button optAimlA;
    Button optAimlB;
    Button optAimlC;
    Button optAimlD;
    TextView questionsAI;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiml);

        questionsAI = findViewById(R.id.questionsAI);

        optAimlA = findViewById(R.id.optAimlA);
        optAimlB = findViewById(R.id.optAimlB);
        optAimlC = findViewById(R.id.optAimlC);
        optAimlD = findViewById(R.id.optAimlD);

        questionsAI.setText(aimlQues[index]);

        optAimlA.setText(aiOptA[index]);
        optAimlB.setText(aiOptB[index]);
        optAimlC.setText(aiOptC[index]);
        optAimlD.setText(aiOptD[index]);

        optAimlA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<= aimlQues.length-1){

                    if(validCheckA[index]){
                        score++;
                    }
                    index++;

                    if(index<= aimlQues.length-1){
                        questionsAI.setText(aimlQues[index]);

                        optAimlA.setText(aiOptA[index]);
                        optAimlB.setText(aiOptB[index]);
                        optAimlC.setText(aiOptC[index]);
                        optAimlD.setText(aiOptD[index]);
                    }
                    else{
                        Toast.makeText(aiml.this, "Your score is: "+score+"/"+aimlQues.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(aiml.this, "Restart the app", Toast.LENGTH_SHORT).show();

                }
            }
        });

        optAimlD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<= aimlQues.length-1){

                    if(validCheckD[index]){
                        score++;
                    }
                    index++;

                    if(index<= aimlQues.length-1){
                        questionsAI.setText(aimlQues[index]);

                        optAimlA.setText(aiOptA[index]);
                        optAimlB.setText(aiOptB[index]);
                        optAimlC.setText(aiOptC[index]);
                        optAimlD.setText(aiOptD[index]);
                    }
                    else{
                        Toast.makeText(aiml.this, "Your score is: "+score+"/"+aimlQues.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(aiml.this, "Restart the app", Toast.LENGTH_SHORT).show();

                }
            }
        });

        optAimlB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<= aimlQues.length-1){

                    if(validCheckB[index]){
                        score++;
                    }
                    index++;

                    if(index<= aimlQues.length-1){
                        questionsAI.setText(aimlQues[index]);

                        optAimlA.setText(aiOptA[index]);
                        optAimlB.setText(aiOptB[index]);
                        optAimlC.setText(aiOptC[index]);
                        optAimlD.setText(aiOptD[index]);
                    }
                    else{
                        Toast.makeText(aiml.this, "Your score is: "+score+"/"+aimlQues.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(aiml.this, "Restart the app", Toast.LENGTH_SHORT).show();

                }
            }
        });

        optAimlC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<= aimlQues.length-1){

                    if(validCheckC[index]){
                        score++;
                    }
                    index++;

                    if(index<= aimlQues.length-1){
                        questionsAI.setText(aimlQues[index]);

                        optAimlA.setText(aiOptA[index]);
                        optAimlB.setText(aiOptB[index]);
                        optAimlC.setText(aiOptC[index]);
                        optAimlD.setText(aiOptD[index]);
                    }
                    else{
                        Toast.makeText(aiml.this, "Your score is: "+score+"/"+aimlQues.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(aiml.this, "Restart the app", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}