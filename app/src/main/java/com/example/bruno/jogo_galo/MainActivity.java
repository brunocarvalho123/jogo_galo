package com.example.bruno.jogo_galo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    Button res;
    int i, ii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = 0;
        ii = 0;

        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);
        bt3 = (Button) findViewById(R.id.b3);
        bt4 = (Button) findViewById(R.id.b4);
        bt5 = (Button) findViewById(R.id.b5);
        bt6 = (Button) findViewById(R.id.b6);
        bt7 = (Button) findViewById(R.id.b7);
        bt8 = (Button) findViewById(R.id.b8);
        bt9 = (Button) findViewById(R.id.b9);
        res = (Button) findViewById(R.id.reset);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.setBackgroundResource(R.drawable.square);
                bt2.setBackgroundResource(R.drawable.square);
                bt3.setBackgroundResource(R.drawable.square);
                bt4.setBackgroundResource(R.drawable.square);
                bt5.setBackgroundResource(R.drawable.square);
                bt6.setBackgroundResource(R.drawable.square);
                bt7.setBackgroundResource(R.drawable.square);
                bt8.setBackgroundResource(R.drawable.square);
                bt9.setBackgroundResource(R.drawable.square);
                ii = 0; i = 0;
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt1.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt1.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt2.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt2.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt3.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt3.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt4.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt4.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt5.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt5.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt6.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt6.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt7.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt7.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt8.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt8.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ii < 9) {
                    ii++;
                    if (i == 0) {
                        bt9.setBackgroundResource(R.drawable.circulo2);
                        i++;
                    } else {
                        bt9.setBackgroundResource(R.drawable.cross);
                        i--;
                    }
                }
            }
        });
    }
}
