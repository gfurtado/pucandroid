package com.example.pucpr.votacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    String candidato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.candidato1);
    }

    public void rb1Click(View v){

        imageView.setImageResource(R.drawable.candidato1);
        candidato =  "Candidato 1";
    }

    public void rb2Click(View v){

        imageView.setImageResource(R.drawable.candidato2);
        candidato =  "Candidato 2";
    }

    public void rb3Click(View v){

        imageView.setImageResource(R.drawable.candidato3);
        candidato =  "Candidato 3";
    }

    public void votarClick(View v){
        Toast.makeText(this,"Seu candidato escolhido foi: " + candidato,Toast.LENGTH_SHORT).show();

    }
}
