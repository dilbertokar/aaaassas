package com.example.dilber.excelsior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SepetActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    static ArrayList<Product> sepetlist = new ArrayList<>();
    TextView toplam;
    int toplamfiyat=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepet);
        recyclerView = findViewById(R.id.rwListSepet);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayout.VERTICAL);
        SepetAdapter adapter = new SepetAdapter(sepetlist);

        toplam = findViewById(R.id.toplam);

        for(int a=0;a<sepetlist.size() ;a++){

        }

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}


