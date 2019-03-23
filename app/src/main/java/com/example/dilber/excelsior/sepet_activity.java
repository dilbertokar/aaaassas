package com.example.dilber.excelsior;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class sepet_activity extends AppCompatActivity {

    RecyclerView recyclerView;
    static ArrayList<Product> sepetlist=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun_liste);
        recyclerView = findViewById(R.id.rwList);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayout.VERTICAL);
        SepetAdapter adapter = new SepetAdapter(sepetlist);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);

        /*
        switch (item.getItemId()) {
            case R.id.basket:
                //Intent i = new Intent(UrunListe.this,SepetActivity.class);
                return true;

        }*/
    }

}