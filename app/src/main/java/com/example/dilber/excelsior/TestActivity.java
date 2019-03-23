package com.example.dilber.excelsior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    CardView cevap1;
    CardView cevap2;
    CardView cevap3;
    CardView cevap4;
    CardView cevap5;

    Sorular soru1 = new Sorular("Hediye alacağınız kişinin cinciyeti nedir?" ,
            "Kadın" , "Erkek",null,null,null);
    Sorular soru2 = new Sorular("Hediye alacağınız kişi ile nasıl bir ilişkiniz var?",
            "Sevgili/Eş","Arkadaş","Akraba","Öğretmen","Anne/Baba");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        textView = findViewById(R.id.soru);
        cevap1 = findViewById(R.id.cevap1);
        cevap2 = findViewById(R.id.cevap2);
        cevap3 = findViewById(R.id.cevap3);
        cevap4 = findViewById(R.id.cevap4);
        cevap5 = findViewById(R.id.cevap5);



    }

    @Override
    public void onClick(View v) {
        textView.setText("");
        cevap1.setText("");
        cevap2.setText("");
        cevap3.setText("");
        cevap4.setText("");
        cevap5.setText("");

    }
}
