package com.example.bruno.jogo_galo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by Bruno on 12/07/2017.
 */

public class Jogo extends Activity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    Button res, aiF;
    TextView tv;
    int i, ii;
    int mode;
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
        aiF = (Button) findViewById(R.id.aifirst);

        if(activityThatCalled.getIntExtra("main",0)==1){
            mode = 1;       //1 = pvp
            aiF.setVisibility(View.GONE);
        }
        else if(activityThatCalled.getIntExtra("main",0)==2) mode = 2;  //2 = pve

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

        aiF.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(mode==2) {
                   Random r = new Random();
                   int Low = 1;
                   int High = 5;
                   int Result = r.nextInt(High-Low) + Low;
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
                   i = 1;
                   config = new int[3][3];
                   tv.setText("");
                   if(Result==1) b1();
                   else if(Result==2) b3();
                   else if(Result==3) b7();
                   else b9();
               }
           }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9();
            }
        });
    }
    void b1(){
        if (ii < 9 && config[0][0] == 0) {
            ii++;
            if (i == 0) {
                bt1.setBackgroundResource(R.drawable.cross);
                i++;
                config[0][0] = 1;
            } else  {
                bt1.setBackgroundResource(R.drawable.circulo2);
                i--;
                config[0][0] = 2;
            }
        }
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b2(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b3(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b4(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b5(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b6(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b7(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b8(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }
    void b9(){
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
        if (isSolution(config) == 1) {
            tv.setText("X GANHOU");
            ii = 10;
        } else if (isSolution(config) == 2) {
            tv.setText("O GANHOU");
            ii = 10;
        } else if (isDraw(config)){
            tv.setText("EMPATE");
            ii = 10;
        } if(i==1 && mode==2 && ii < 9) playAi();
    }

    int isSolution(int[][] first){
        int o1=0, o2=0, o3=0, o4=0;
        int x1=0, x2=0, x3=0, x4=0;

        for(int j=0; j<3; j++){
            for(int jj=0; jj<3; jj++){
                if(first[j][jj] == 1){
                    x1++;
                    o1=0;
                }
                else if(first[j][jj] == 2){
                    o1++;
                    x1=0;
                }
                else{
                    x1=0; o1=0;
                    break;
                }
            }

            if(x1==3){ changeColor("x1", j); return 1;}
            else x1=0;
            if(o1==3){ changeColor("o1", j); return 2;}
            else o1=0;

            for(int jj=0; jj<3; jj++){
                if(first[jj][j] == 1){
                    x2++;
                    o2=0;
                }
                else if(first[jj][j] == 2){
                    o2++;
                    x2=0;
                }
                else{
                    x2=0; o2=0;
                    break;
                }
            }

            if(x2==3){ changeColor("x2", j); return 1;}
            else x2=0;
            if(o2==3){ changeColor("o2", j); return 2;}
            else o2=0;
        }

        for(int j=0; j<3; j++){
            if(first[j][j] == 1){
                x3++;
                o3=0;
            }
            else if(first[j][j] == 2){
                o3++;
                x3=0;
            }
            else{
                x3=0; o3=0;
                break;
            }
        }

        if(x3==3){ changeColor("x3", 0); return 1;}
        if(o3==3){ changeColor("o3", 0); return 2;}

        for(int j=2; j>=0; j--){
            if(first[j][2-j] == 1){
                x4++;
                o4=0;
            }
            else if(first[j][2-j] == 2){
                o4++;
                x4=0;
            }
            else{
                x4=0; o4=0;
                break;
            }
        }

        if(x4==3){ changeColor("x4", 0); return 1;}
        if(o4==3){ changeColor("o4", 0); return 2;}

        return 0;   // 1 =  X wins  2 =  O wins  0 = no win
    }

    int isSolution2(int[][] first){
        int o1=0, o2=0, o3=0, o4=0;
        int x1=0, x2=0, x3=0, x4=0;

        for(int j=0; j<3; j++){
            for(int jj=0; jj<3; jj++){
                if(first[j][jj] == 1){
                    x1++;
                    o1=0;
                }
                else if(first[j][jj] == 2){
                    o1++;
                    x1=0;
                }
                else{
                    x1=0; o1=0;
                    break;
                }
            }

            if(x1==3){ return 1;}
            else x1=0;
            if(o1==3){ return 2;}
            else o1=0;

            for(int jj=0; jj<3; jj++){
                if(first[jj][j] == 1){
                    x2++;
                    o2=0;
                }
                else if(first[jj][j] == 2){
                    o2++;
                    x2=0;
                }
                else{
                    x2=0; o2=0;
                    break;
                }
            }

            if(x2==3){ return 1;}
            else x2=0;
            if(o2==3){ return 2;}
            else o2=0;
        }

        for(int j=0; j<3; j++){
            if(first[j][j] == 1){
                x3++;
                o3=0;
            }
            else if(first[j][j] == 2){
                o3++;
                x3=0;
            }
            else{
                x3=0; o3=0;
                break;
            }
        }

        if(x3==3){return 1;}
        if(o3==3){return 2;}

        for(int j=2; j>=0; j--){
            if(first[j][2-j] == 1){
                x4++;
                o4=0;
            }
            else if(first[j][2-j] == 2){
                o4++;
                x4=0;
            }
            else{
                x4=0; o4=0;
                break;
            }
        }

        if(x4==3){ return 1;}
        if(o4==3){return 2;}

        return 0;   // 1 =  X wins  2 =  O wins  0 = no win
    }

    boolean isDraw(int[][] first){
        for(int j=0; j<3; j++) {
            for (int jj = 0; jj < 3; jj++) {
                if(first[j][jj] == 0) return false;
            }
        }
        return true;
    }

    void changeColor(String var, int num){
        if(var.equals("x1")){
            if(num == 0){
                bt1.setBackgroundResource(R.drawable.crossred);
                bt2.setBackgroundResource(R.drawable.crossred);
                bt3.setBackgroundResource(R.drawable.crossred);
            }
            else if(num == 1){
                bt4.setBackgroundResource(R.drawable.crossred);
                bt5.setBackgroundResource(R.drawable.crossred);
                bt6.setBackgroundResource(R.drawable.crossred);
            }
            else{
                bt7.setBackgroundResource(R.drawable.crossred);
                bt8.setBackgroundResource(R.drawable.crossred);
                bt9.setBackgroundResource(R.drawable.crossred);
            }
        }
        else if(var.equals("o1")){
            if(num == 0){
                bt1.setBackgroundResource(R.drawable.circulo2red);
                bt2.setBackgroundResource(R.drawable.circulo2red);
                bt3.setBackgroundResource(R.drawable.circulo2red);
            }
            else if(num == 1){
                bt4.setBackgroundResource(R.drawable.circulo2red);
                bt5.setBackgroundResource(R.drawable.circulo2red);
                bt6.setBackgroundResource(R.drawable.circulo2red);
            }
            else{
                bt7.setBackgroundResource(R.drawable.circulo2red);
                bt8.setBackgroundResource(R.drawable.circulo2red);
                bt9.setBackgroundResource(R.drawable.circulo2red);
            }
        }
        else if(var.equals("x2")){
            if(num == 0){
                bt1.setBackgroundResource(R.drawable.crossred);
                bt4.setBackgroundResource(R.drawable.crossred);
                bt7.setBackgroundResource(R.drawable.crossred);
            }
            else if(num == 1){
                bt2.setBackgroundResource(R.drawable.crossred);
                bt5.setBackgroundResource(R.drawable.crossred);
                bt8.setBackgroundResource(R.drawable.crossred);
            }
            else {
                bt3.setBackgroundResource(R.drawable.crossred);
                bt6.setBackgroundResource(R.drawable.crossred);
                bt9.setBackgroundResource(R.drawable.crossred);
            }
        }
        else if(var.equals("o2")){
            if(num == 0){
                bt1.setBackgroundResource(R.drawable.circulo2red);
                bt4.setBackgroundResource(R.drawable.circulo2red);
                bt7.setBackgroundResource(R.drawable.circulo2red);
            }
            else if(num == 1){
                bt2.setBackgroundResource(R.drawable.circulo2red);
                bt5.setBackgroundResource(R.drawable.circulo2red);
                bt8.setBackgroundResource(R.drawable.circulo2red);
            }
            else {
                bt3.setBackgroundResource(R.drawable.circulo2red);
                bt6.setBackgroundResource(R.drawable.circulo2red);
                bt9.setBackgroundResource(R.drawable.circulo2red);
            }
        }
        else if(var.equals("x3")){
            bt1.setBackgroundResource(R.drawable.crossred);
            bt5.setBackgroundResource(R.drawable.crossred);
            bt9.setBackgroundResource(R.drawable.crossred);
        }
        else if(var.equals("o3")){
            bt1.setBackgroundResource(R.drawable.circulo2red);
            bt5.setBackgroundResource(R.drawable.circulo2red);
            bt9.setBackgroundResource(R.drawable.circulo2red);
        }
        else if(var.equals("x4")){
            bt3.setBackgroundResource(R.drawable.crossred);
            bt5.setBackgroundResource(R.drawable.crossred);
            bt7.setBackgroundResource(R.drawable.crossred);
        }
        else if(var.equals("o4")){
            bt3.setBackgroundResource(R.drawable.circulo2red);
            bt5.setBackgroundResource(R.drawable.circulo2red);
            bt7.setBackgroundResource(R.drawable.circulo2red);
        }
    }

    void playAi(){
        int bestVal=Integer.MIN_VALUE, temp=bestVal;
        int[][] bestMove = new int[3][3];
        List<int[][]> desc = makeDesc(config, 1);

        for(int i=0; i<desc.size(); i++) {
            int u[][] = desc.get(i);
            bestVal= Math.max(bestVal, minimax(u, 0, Integer.MIN_VALUE, Integer.MAX_VALUE));
            if(temp<bestVal){
                for(int j=0; j<u.length; j++){
                    for(int ii=0; ii<u[j].length; ii++)
                        bestMove[j][ii]=u[j][ii];
                }
                temp=bestVal;
            }
        }
        for(int j=0; j<3; j++) {
            for (int jj = 0; jj < 3; jj++) {
                if(config[j][jj] != bestMove[j][jj]) {
                    makePlay(jj, j);
                    j=5;
                    break;
                }
            }
        }
    }

    int minimax(int[][] first, int play, int alpha, int beta){
        int bestVal;
        if(isSolution2(first)==2){
            return 1;
        }
        else if(isSolution2(first)==1){
            return -1;
        }
        else if(isDraw(first)){
            return 0;
        }

        if(play == 1){
            bestVal=Integer.MIN_VALUE;
            List<int[][]> desc = makeDesc(first,1);
            for(int i=0; i<desc.size(); i++) {
                int u[][] = desc.get(i);
                bestVal= Math.max(bestVal, minimax(u,0, alpha, beta));
                if(bestVal >= beta){
                    return bestVal;
                }
                alpha = Math.max(alpha, bestVal);
            }
            return bestVal;
        }

        else{
            bestVal=Integer.MAX_VALUE;
            List<int[][]> desc = makeDesc(first,0);
            for(int i=0; i<desc.size(); i++) {
                int u[][] = desc.get(i);
                bestVal= Math.min(bestVal, minimax(u,1, alpha, beta));
                if(bestVal <= alpha){
                    return bestVal;
                }
                beta = Math.min(beta, bestVal);
            }
            return bestVal;
        }
    }

    List<int[][]> makeDesc(int[][] first, int play){
        List<int[][]> desc = new ArrayList<int[][]>();

        for(int j=0; j<3; j++) {
            for (int jj = 0; jj < 3; jj++) {
                int[][] temp = new int[3][3];
                for(int i=0; i<first.length; i++){
                    for(int ii=0; ii<first[i].length; ii++)
                        temp[i][ii]=first[i][ii];
                }
                if(first[j][jj]==0 && play==0){         //0 for X
                    temp[j][jj] = 1;
                    desc.add(temp);
                }
                else if(first[j][jj]==0 && play==1){    //1 for O
                    temp[j][jj] = 2;
                    desc.add(temp);
                }
            }
        }
        return desc;
    }

    void makePlay(int x, int y){

        if(x==0 && y==0){
            b1();
        }
        else if(x==1 && y==0){
            b2();
        }
        else if(x==2 && y==0){
            b3();
        }
        else if(x==0 && y==1){
            b4();
        }
        else if(x==1 && y==1){
            b5();
        }
        else if(x==2 && y==1){
            b6();
        }
        else if(x==0 && y==2){
            b7();
        }
        else if(x==1 && y==2){
            b8();
        }
        else if(x==2 && y==2){
            b9();
        }
    }
}
