package com.example.bruno.jogo_galo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Bruno on 12/07/2017.
 */

public class Jogo extends Activity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    Button res;
    TextView tv;
    int i, ii;
    int[][] config = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.jogo);
        Intent activityThatCalled = getIntent();

        i = 0;
        ii = 0;

        tv = (TextView) findViewById(R.id.tv1);
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
                ii = 0;
                i = 0;
                config = new int[3][3];
                tv.setText("");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[0][0] == 0) {
                    ii++;
                    if (i == 0) {
                        bt1.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[0][0] = 1;
                    } else {
                        bt1.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[0][0] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[0][1] == 0) {
                    ii++;
                    if (i == 0) {
                        bt2.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[0][1] = 1;
                    } else {
                        bt2.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[0][1] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[0][2] == 0) {
                    ii++;
                    if (i == 0) {
                        bt3.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[0][2] = 1;
                    } else {
                        bt3.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[0][2] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[1][0] == 0) {
                    ii++;
                    if (i == 0) {
                        bt4.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[1][0] = 1;
                    } else {
                        bt4.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[1][0] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[1][1] == 0) {
                    ii++;
                    if (i == 0) {
                        bt5.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[1][1] = 1;
                    } else {
                        bt5.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[1][1] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[1][2] == 0) {
                    ii++;
                    if (i == 0) {
                        bt6.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[1][2] = 1;
                    } else {
                        bt6.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[1][2] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[2][0] == 0) {
                    ii++;
                    if (i == 0) {
                        bt7.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[2][0] = 1;
                    } else {
                        bt7.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[2][0] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[2][1] == 0) {
                    ii++;
                    if (i == 0) {
                        bt8.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[2][1] = 1;
                    } else {
                        bt8.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[2][1] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ii < 9 && config[2][2] == 0) {
                    ii++;
                    if (i == 0) {
                        bt9.setBackgroundResource(R.drawable.cross);
                        i++;
                        config[2][2] = 1;
                    } else {
                        bt9.setBackgroundResource(R.drawable.circulo2);
                        i--;
                        config[2][2] = 2;
                    }
                }
                if (isSolution() == 1) {
                    tv.setText("X WINS");
                    ii = 10;
                } else if (isSolution() == 2) {
                    tv.setText("O WINS");
                    ii = 10;
                }
            }
        });
    }

    int isSolution(){
        int o1=0, o2=0, o3=0, o4=0;
        int x1=0, x2=0, x3=0, x4=0;
        //int[][] config = {{0,0,2},{0,2,0},{2,0,0}};

        for(int j=0; j<3; j++){
            for(int jj=0; jj<3; jj++){
                if(config[j][jj] == 1){
                    x1++;
                    o1=0;
                }
                else if(config[j][jj] == 2){
                    o1++;
                    x1=0;
                }
                else{
                    x1=0; o1=0;
                    break;
                }
            }
            for(int jj=0; jj<3; jj++){
                if(config[jj][j] == 1){
                    x2++;
                    o2=0;
                }
                else if(config[jj][j] == 2){
                    o2++;
                    x2=0;
                }
                else{
                    x2=0; o2=0;
                    break;
                }
            }
            if(x1 == 3 || o1 == 3 || x2 == 3 || o2 == 3) break;
        }
        for(int j=0; j<3; j++){
            if(config[j][j] == 1){
                x3++;
                o3=0;
            }
            else if(config[j][j] == 2){
                o3++;
                x3=0;
            }
            else{
                x3=0; o3=0;
                break;
            }
        }
        for(int j=2; j>=0; j--){
            if(config[j][2-j] == 1){
                x4++;
                o4=0;
            }
            else if(config[j][2-j] == 2){
                o4++;
                x4=0;
            }
            else{
                x4=0; o4=0;
                break;
            }
        }

        if ((x1==3 || x2==3) || (x3==3 || x4==3)) return 1;         // 1 =  X wins
        else if ((o1==3 || o2==3) || (o3==3 || o4==3)) return 2;    // 2 =  O wins
        else return 0;	                                            // 0 = no win
    }
}
