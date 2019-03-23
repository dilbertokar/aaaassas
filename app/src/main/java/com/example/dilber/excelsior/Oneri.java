package com.example.dilber.excelsior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Oneri extends AppCompatActivity {

    ImageView resim;
    TextView name,fiyat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneri);
        resim=findViewById(R.id.resim);
        name=findViewById(R.id.oname);
        fiyat=findViewById(R.id.fiyat);
        Product p=TestActivity.oneri;
        if(p!=null)
        {
            resim.setImageResource(p.getResimId());
            name.setText(p.getIsim());
            fiyat.setText(p.getFiyat());
        }
    }

}
