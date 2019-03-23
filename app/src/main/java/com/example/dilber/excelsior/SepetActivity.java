package com.example.dilber.excelsior;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SepetActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    static Button odeme;
    static ArrayList<Product> sepetlist = new ArrayList<>();
    static TextView toplam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepet);
        recyclerView = findViewById(R.id.rwListSepet);
        odeme=findViewById(R.id.odeme);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayout.VERTICAL);
        SepetAdapter adapter = new SepetAdapter(sepetlist);

        toplam = findViewById(R.id.toplam);
        toplam.setText("Toplam :"+adapter.toplamfiyat+"₺");
        if(adapter.toplamfiyat==0)
            odeme.setVisibility(View.GONE);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        odeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SepetActivity.sepetlist.clear();
                Toast.makeText(v.getContext(), "Ödeme Gerçekleşti", Toast.LENGTH_LONG).show();
                Intent i = new Intent(SepetActivity.this,UrunListe.class);
                startActivity(i);


            }
        });

    }
}


