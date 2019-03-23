package com.example.dilber.excelsior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class UrunListe extends AppCompatActivity {

    RecyclerView recyclerView;
    static ArrayList<Product> productList;

    ImageView sepeteekle;
    Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun_liste);
        recyclerView = findViewById(R.id.rwList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);

        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        gridLayoutManager.scrollToPosition(0);

        sepeteekle = findViewById(R.id.basket);

        productList = new ArrayList<>();
        productList.add(new Product(1, "Ayıcık", "5" , R.drawable.ayicik));
        productList.add(new Product(2, "Çiçek", "78", R.drawable.cicek));
        productList.add(new Product(3, "Yastık", "78", R.drawable.yastik));
        productList.add(new Product(14, "Şeker", "78", R.drawable.seker));
        productList.add(new Product(15, "Çikolata", "78", R.drawable.cikolata));
        productList.add(new Product(16, "Bardak", "56", R.drawable.bardak));
        productList.add(new Product(17, "Tshirt", "78", R.drawable.tshirt));
        productList.add(new Product(18, "Ayakkabı", "45", R.drawable.ayakkabi));
        productList.add(new Product(19, "Kolye", "78", R.drawable.kolye));
        productList.add(new Product(11, "Kalem", "78", R.drawable.kalem));

        TestActivity.oneri=productList.get(0);
        ListAdapter adapter = new ListAdapter(productList);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

        test = findViewById(R.id.btntest);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UrunListe.this,TestActivity.class);
                startActivity(i);
            }
        });

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

        Intent i=new Intent(UrunListe.this,SepetActivity.class);
        startActivity(i);
        return super.onOptionsItemSelected(item);

    }

}
