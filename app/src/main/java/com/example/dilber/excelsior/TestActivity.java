package com.example.dilber.excelsior;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textView;
    TextView cevap1;
    TextView cevap2;
    TextView cevap3;
    TextView cevap4;
    TextView cevap5;

    CardView card1;
    CardView card2;
    CardView card3;
    CardView card4;
    CardView card5;

    int counter=0;
    int result=0;
    String alici="Hediye alacağınız kişi";
    Sorular soru1 = new Sorular(alici+"nin cinciyeti nedir?" ,
            "Kadın" , "Erkek",null,null,null);
    Sorular soru2 = new Sorular(alici+" ile nasıl bir ilişkiniz var?",

            "Sevgili/Eş","Arkadaş","Akraba","Öğretmen","Anne/Baba");
    Sorular soru3 = new Sorular(alici+"nin yaş aralığı",
            "14/18","18/24","35/44","45/65","65+");
    Sorular soru4=new Sorular("Özel bir gün için mi alıyorsunuz",
            "Evet","Hayır",null,null,null);

    ArrayList<Sorular> soruList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        soruList.add(soru1);
        soruList.add(soru2);
        soruList.add(soru3);
        soruList.add(soru4);
        textView=findViewById(R.id.soru);
        cevap1=findViewById(R.id.cevap1);
        cevap2=findViewById(R.id.cevap2);
        cevap3=findViewById(R.id.cevap3);
        cevap4=findViewById(R.id.cevap4);
        cevap5=findViewById(R.id.cevap5);

        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);

        cevap1.setOnClickListener(this);
        cevap2.setOnClickListener(this);
        cevap3.setOnClickListener(this);
        cevap4.setOnClickListener(this);
        cevap5.setOnClickListener(this);

        setQuestion();





    }

void setQuestion(){
    textView.setText(soruList.get(counter).soru);
    cevap1.setText(soruList.get(counter).cevap1);
    cevap2.setText(soruList.get(counter).cevap2);
    cevap3.setText(soruList.get(counter).cevap3);
    cevap4.setText(soruList.get(counter).cevap4);
    cevap5.setText(soruList.get(counter).cevap5);

    card1.setVisibility(cevap1.getText()==""?View.INVISIBLE:View.VISIBLE);
    card2.setVisibility(cevap2.getText()==""?View.INVISIBLE:View.VISIBLE);
    card3.setVisibility(cevap3.getText()==""?View.INVISIBLE:View.VISIBLE);
    card4.setVisibility(cevap4.getText()==""?View.INVISIBLE:View.VISIBLE);
    card5.setVisibility(cevap5.getText()==""?View.INVISIBLE:View.VISIBLE);
}
    @Override
    public void onClick(View v) {
            counter++;
            if(counter>soruList.size())
                showResult();
           setQuestion();
    }
    void showResult()
    {

    }
}
