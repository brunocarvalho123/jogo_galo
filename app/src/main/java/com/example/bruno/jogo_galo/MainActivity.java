package com.example.bruno.jogo_galo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goJogo(View view) {
        Intent jogar = new Intent(this, Jogo.class);
        jogar.putExtra("main", 3);
        startActivity(jogar);
    }
}

