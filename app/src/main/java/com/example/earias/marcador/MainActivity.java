package com.example.earias.marcador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ScoreTeamA;
    int ScoreTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreTeamA=0;
        ScoreTeamB=0;
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void tresPuntosA( View view){
        ScoreTeamA= ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);
    }

    public void dosPuntosA( View view){
        ScoreTeamA= ScoreTeamA + 2;
        displayForTeamA(ScoreTeamA);
    }

    public void unPuntoA( View view){
        ScoreTeamA= ScoreTeamA + 1;
        displayForTeamA(ScoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void tresPuntosB( View view){
        ScoreTeamB= ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);
    }

    public void dosPuntosB( View view){
        ScoreTeamB= ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
    }

    public void unPuntoB( View view){
        ScoreTeamB= ScoreTeamB + 1;
        displayForTeamB(ScoreTeamB);
    }

    public void reset( View view){
        ScoreTeamA= 0;
        ScoreTeamB= 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }

}
