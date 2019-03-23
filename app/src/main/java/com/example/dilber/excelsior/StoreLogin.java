package com.example.dilber.excelsior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;

public class StoreLogin extends AppCompatActivity {

    CardView girisButton;
    EditText subekodu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_login);

        girisButton = findViewById(R.id.btnGiriş);
        subekodu = findViewById(R.id.etxtKod);

        girisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StoreLogin.this,UrunListe.class);
                startActivity(i);
            }
        });
    }
}
