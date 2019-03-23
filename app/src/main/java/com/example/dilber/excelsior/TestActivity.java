package com.example.dilber.excelsior;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {


    static Product oneri;
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
    Sorular soru1 = new Sorular(alici+"nin cinsiyeti nedir?" ,
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
        counter=0;
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
        TextView t=(TextView) v;
        if(soruList.get(counter).cevap1==t.getText())     {result+=counter;}
        else if(soruList.get(counter).cevap2==t.getText()){result+=counter*2;}
        else if(soruList.get(counter).cevap3==t.getText()){result+=counter*3;}
        else if(soruList.get(counter).cevap4==t.getText()){result+=counter*4;}
        else if(soruList.get(counter).cevap5==t.getText()){result+=counter*5;}

            counter++;
            if(counter>=soruList.size())
                showResult();
            else
           setQuestion();
    }
    void showResult()
    {
        switch (result%5)
        {
            case 0:
                oneri=UrunListe.productList.get(0);
                break;
            case 1:
                oneri=UrunListe.productList.get(1);
                break;
            case 2:
                oneri=UrunListe.productList.get(2);
                break;
            case 3:
                oneri=UrunListe.productList.get(3);
                break;
            case 4:
                oneri=UrunListe.productList.get(4);
                break;
        }
        Intent i=new Intent(TestActivity.this,Oneri.class);
        startActivity(i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i=new Intent(TestActivity.this,SepetActivity.class);
        startActivity(i);
        return super.onOptionsItemSelected(item);

    }
}
