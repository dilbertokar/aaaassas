package com.example.dilber.excelsior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Oneri extends AppCompatActivity {

    ImageView resim;
    TextView name,fiyat,anasayfa,test;
    CardView sepeteekle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneri);
        resim=findViewById(R.id.resim);
        name=findViewById(R.id.oname);
        fiyat=findViewById(R.id.fiyat);
        anasayfa=findViewById(R.id.anasayfa);
        test = findViewById(R.id.test);
        Product p=TestActivity.oneri;
        if(p!=null)
        {
            resim.setImageResource(p.getResimId());
            name.setText(p.getIsim());
            fiyat.setText(p.getFiyat());
            anasayfa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Oneri.this,UrunListe.class);
                    startActivity(i);
                }
            });

            test.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Oneri.this,TestActivity.class);
                    startActivity(i);
                }
            });

            sepeteekle = findViewById(R.id.btnGiriş);
            sepeteekle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SepetActivity.sepetlist.add(TestActivity.oneri);
                    Toast.makeText(v.getContext(), "Sepete Eklendi", Toast.LENGTH_LONG).show();


                }
            });


        }


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

        Intent i=new Intent(Oneri.this,SepetActivity.class);
        startActivity(i);
        return super.onOptionsItemSelected(item);

    }

}
