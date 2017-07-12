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

        // We have to state that are intention is to open another Activity. We do so
        // by passing a Context and the Activity that we want to open

        Intent jogar = new Intent(this, Jogo.class);
        //jogar.putExtra("callingActivity", "MainActivity");

        // We ask for the Activity to start and don't expect a result to be sent back
        startActivity(jogar);

        // We use startActivityForResult when we expect a result to be sent back
        /*
        final int result = 1;

        // To send data use putExtra with a String name followed by its value
        getNameScreenIntent.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getNameScreenIntent, result);
        */
    }
}

