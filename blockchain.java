package com.example.codex_thecodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class blockchain extends AppCompatActivity {
    private String[] blockchainQues = {"Q.1 What does P2P stand for?","Q.2 What is a node?","Q.3 Who created Bitcoin?","Q.4 Where do you store your cryptocurrency?",
            "Q.5 What are the different types of tokens?","Q.6 What is a dApp?"};

    private String[] blockchainOptA = {"Password to Password","A type of cryptocurrency","Satoshi Nakamoto","Bank account","Platform","A type of Cryptocurrency"};
    private String[] blockchainOptB = {"Peer to Peer","A Blockchain","Samsung","Floppy Disk","Privacy","A condiment"};
    private String[] blockchainOptC = {"Product to Product","A computer on Blockchain network","John Mcafee","Wallet","Currency","A type of blockchain"};
    private String[] blockchainOptD = {"Private Key to Public Key","An exchange","China","In your pocket","All of above","A decentralized application"};

    private boolean[] validblockOptA = {false,false,true,false,false,false};
    private boolean[] validblockOptB = {true,false,false,false,false,false};
    private boolean[] validblockOptC = {false,true,false,true,false,false};
    private boolean[] validblockOptD = {false,false,false,false,true,true};

    private int index = 0;
    private int score = 0;

    Button optA;
    Button optB;
    Button optC;
    Button optD;
    TextView questionsBlockchain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blockchain);

        questionsBlockchain = findViewById((R.id.questionsBlockchain));

        optA = findViewById(R.id.optA);
        optB = findViewById(R.id.optB);
        optC = findViewById(R.id.optC);
        optD = findViewById(R.id.optD);

        questionsBlockchain.setText(blockchainQues[index]);

        optA.setText(blockchainOptA[index]);
        optB.setText(blockchainOptB[index]);
        optC.setText(blockchainOptC[index]);
        optD.setText(blockchainOptD[index]);

        optA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=blockchainQues.length){

                    if(validblockOptA[index]){
                        score++;
                    }
                    index++;
                    if(index<=blockchainQues.length-1){
                        questionsBlockchain.setText(blockchainQues[index]);

                        optA.setText(blockchainOptA[index]);
                        optB.setText(blockchainOptB[index]);
                        optC.setText(blockchainOptC[index]);
                        optD.setText(blockchainOptD[index]);
                    }
                    else{
                        Toast.makeText(blockchain.this, "Your score is: "+score+"/"+blockchainQues.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(blockchain.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=blockchainQues.length){

                    if(validblockOptB[index]){
                        score++;
                    }
                    index++;
                    if(index<=blockchainQues.length-1){
                        questionsBlockchain.setText(blockchainQues[index]);

                        optA.setText(blockchainOptA[index]);
                        optB.setText(blockchainOptB[index]);
                        optC.setText(blockchainOptC[index]);
                        optD.setText(blockchainOptD[index]);
                    }
                    else{
                        Toast.makeText(blockchain.this, "Your score is: "+score+"/"+blockchainQues.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(blockchain.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }

        });

        optC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=blockchainQues.length){

                    if(validblockOptC[index]){
                        score++;
                    }
                    index++;
                    if(index<=blockchainQues.length-1){
                        questionsBlockchain.setText(blockchainQues[index]);

                        optA.setText(blockchainOptA[index]);
                        optB.setText(blockchainOptB[index]);
                        optC.setText(blockchainOptC[index]);
                        optD.setText(blockchainOptD[index]);
                    }
                    else{
                        Toast.makeText(blockchain.this, "Your score is: "+score+"/"+blockchainQues.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(blockchain.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=blockchainQues.length){

                    if(validblockOptD[index]){
                        score++;
                    }
                    index++;
                    if(index<=blockchainQues.length-1){
                        questionsBlockchain.setText(blockchainQues[index]);

                        optA.setText(blockchainOptA[index]);
                        optB.setText(blockchainOptB[index]);
                        optC.setText(blockchainOptC[index]);
                        optD.setText(blockchainOptD[index]);
                    }
                    else{
                        Toast.makeText(blockchain.this, "Your score is: "+score+"/"+blockchainQues.length, Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(blockchain.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}