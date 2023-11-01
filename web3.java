package com.example.codex_thecodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class web3 extends AppCompatActivity {


    TextView questionindex, accuracy, scoretxt;
    LottieAnimationView lottieGood, lottieWellDone, lottieCongrats;
    Button skip_btn;
    private String[] questions = {"Q.1 Who coined the term Web3?","Q.2 Which of these concepts are related to Web3?","Q.3 Web interaction and collaborative communities are example of?","Q.4 What does AI stand for?","Q.5 Who first coined the term 'semantic web'?","Q.6 Where is information stored in Web3 world?","Q.7 Which was the first crypto launched in 2009?","Q.8 What is full form of ICO?","Q.9 Which of following is a risk of crypto trading?","Q.10 When can you trade cryptocurrency?"};

    private String[] optionAans={"Mark Zuckerberg","IOT","Web 1.0","Artificial Intelligence","Fiona Martin","Data Centers","USDC","Initial coin offering","Market Volatility","Mon-Fri"};
    private String[] optionBans={"Elon Musk","Semantic Web","Web 2.0","Abstract Intelligence","Alex Hales","Hard-Disks","Bitcoin","Initial crypto offering","Largely Unregulated","10:00 am-05:30pm"};
    private String[] optionCans={"Nicholas Tesla","AI","Web 3.0","Access Input","Tim Berners","Virtual Digital Wallet","Litecoin","Instance Cyrpto Object","Funds on exchange at risk","Sunday"};
    private String[] optionDans={"Gavin Wood","None","All of the above","Application Index","Virat Kohli","None","Ethereum","Intermidiate Communication Optics","All of the above","Everyday"};

    private boolean[] validCheckA={false,false,false,true,false,false,false,true,false,false,};
    private boolean[] validCheckB={false,true,true,false,false,false,false,false,false,false};
    private boolean[] validCheckC={false,false,false,false,true,true,false,false,false,false};
    private boolean[] validCheckD={true,false,false,false,false,false,true,false,true,true};
    boolean[] validCheckSkipBtn = {false,false,false,false,false,false,false,false,false,false};

    private int index = 0;
    private int score = 0;


    private LinearLayout quiz_qna;
    private LinearLayout result_layout;

    Button optionA;
    Button optionB;
    Button optionC;
    Button optionD;
    Button replay;
    TextView questionWeb3;


    int accuracyper = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);

        lottieGood = findViewById(R.id.lottieGood);
        lottieWellDone = findViewById(R.id.lottieWellDone);
        lottieCongrats = findViewById(R.id.lottieCongrats);

        accuracy = (TextView) findViewById(R.id.accuracy);
        scoretxt =  (TextView) findViewById(R.id.scoretxt);
        questionindex = findViewById(R.id.questionindex);

        skip_btn = findViewById(R.id.skip_btn);
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

        questionWeb3 = findViewById(R.id.questionWeb3);
        questionWeb3.setText(questions[index]);

        optionA.setText(optionAans[index]);
        optionB.setText(optionBans[index]);
        optionC.setText(optionCans[index]);
        optionD.setText(optionDans[index]);
        questionindex.setText((index+1)+" out of 10");


        quiz_qna = findViewById(R.id.quiz_qna_layout);
        result_layout = findViewById(R.id.result_layout);


        replay = findViewById(R.id.replay);
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           moreQuizzes();
            }
        });
        scoretxt = findViewById(R.id.scoretxt);


        startQuiz();

    }


    public void moreQuizzes(){
        Intent intent = new Intent(web3.this,MainActivity.class);
        startActivity(intent);
    }

    public void startQuiz(){




        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index<=questions.length-1){

                    if(validCheckA[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                        questionindex.setText((index+1)+" out of 10");


                    }
                    else if(index == questions.length){


                        if(score <=4){
                            lottieGood.setVisibility(View.VISIBLE);
                        }
                        else if(score <= 7){
                            lottieWellDone.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            lottieCongrats.setVisibility(View.VISIBLE);
                        }
                        quiz_qna.setVisibility(View.GONE);
                        result_layout.setVisibility(View.VISIBLE);
                        accuracyper = (score*100)/10;
                        accuracy.setText(String.valueOf(accuracyper)+" %");
                        scoretxt.setText(String.valueOf(score));

                    }

                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            int score = 0;
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    if(validCheckB[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                        questionindex.setText((index+1)+" out of 10");

                    }
                    else if(index == questions.length){
                        if(score <=4){
                            lottieGood.setVisibility(View.VISIBLE);
                        }
                        else if(score <= 7){
                            lottieWellDone.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            lottieCongrats.setVisibility(View.VISIBLE);
                        }
                        quiz_qna.setVisibility(View.GONE);
                        result_layout.setVisibility(View.VISIBLE);
                        accuracyper = (score*100)/10;
                        accuracy.setText(String.valueOf(accuracyper)+" %");
                        scoretxt.setText(String.valueOf(score));

                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    if(validCheckC[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                        questionindex.setText((index+1)+" out of 10");

                    }
                    else if(index == questions.length){
                        if(score <=4){
                            lottieGood.setVisibility(View.VISIBLE);
                        }
                        else if(score <= 7){
                            lottieWellDone.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            lottieCongrats.setVisibility(View.VISIBLE);
                        }
                        quiz_qna.setVisibility(View.GONE);
                        result_layout.setVisibility(View.VISIBLE);
                        accuracyper = (score*100)/10;
                        accuracy.setText(String.valueOf(accuracyper)+" %");
                        scoretxt.setText(String.valueOf(score));


                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    if(validCheckD[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                        questionindex.setText((index+1)+" out of 10");

                    }

                    else if(index == questions.length){
                        if(score <=4){
                            lottieGood.setVisibility(View.VISIBLE);
                        }
                        else if(score <= 7){
                            lottieWellDone.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            lottieCongrats.setVisibility(View.VISIBLE);
                        }
                        quiz_qna.setVisibility(View.GONE);
                        result_layout.setVisibility(View.VISIBLE);
                        accuracyper = (score*100)/10;
                        accuracy.setText(String.valueOf(accuracyper)+" %");
                        scoretxt.setText(String.valueOf(score));

                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });


        skip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index<=questions.length-1){

                    if(validCheckSkipBtn[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                        questionindex.setText((index+1)+" out of 10");

                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}