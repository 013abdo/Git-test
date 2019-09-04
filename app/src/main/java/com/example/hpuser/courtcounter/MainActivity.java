package com.example.hpuser.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int Abasket,Bbasket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
  /*  public void setTeamAScore(View view){
  displayScore(2);
    }*/


    //A team
    public void displayTeamAScore(int score){
        TextView scoreview = (TextView) findViewById(R.id.scoreA);
        scoreview.setText(String.valueOf(score));
    }

    public void AddTeamAthreePoints(View view){
        Abasket = Abasket+3;
        displayTeamAScore(Abasket);
    }
    public void AddTeamAtwoPoints(View view){
        Abasket = Abasket+2;
        displayTeamAScore(Abasket);
    }
    public void AddTeamAfree(View view){
        Abasket = Abasket+1;
        displayTeamAScore(Abasket);
    }

    /*public void setTeamBScore(View view){
        displayTeamAScore(2);
    }*/


    //B team
    public void displayTeamBScore(int score){
        TextView scoreview = (TextView) findViewById(R.id.scoreB);
        scoreview.setText(String.valueOf(score));
    }

    public void AddTeamBthreePoints(View view){
        Bbasket = Bbasket+3;
        displayTeamBScore(Bbasket);
    }
    public void AddTeamBtwoPoints(View view){
        Bbasket = Bbasket+2;
        displayTeamBScore(Bbasket);
    }
    public void AddTeamBfree(View view){
       Bbasket = Bbasket+1;
        displayTeamBScore(Bbasket);
    }

    //reset the match points
    public void resetgame(View v){
        Abasket =0;
        Bbasket = 0;
        displayTeamAScore(Abasket);
        displayTeamBScore(Bbasket);
    }
}
