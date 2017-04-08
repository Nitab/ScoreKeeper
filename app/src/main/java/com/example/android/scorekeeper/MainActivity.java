package com.example.android.scorekeeper;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.scorekeeper.R.id.team_a_score;
import static com.example.android.scorekeeper.R.id.team_b_score;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * To keep the Counter.
         */

        SharedPreferences sp=getSharedPreferences("data", Context.MODE_PRIVATE);
        String value=sp.getString("counterf",null);
        if(value!=null){
            TextView team_a_score=(TextView)findViewById(R.id.team_a_score);
            team_a_score.setText(value);
        }

        SharedPreferences spB=getSharedPreferences("dataB", Context.MODE_PRIVATE);
        String valueB=spB.getString("counterBf",null);
        if(valueB!=null){
            TextView team_b_score=(TextView)findViewById(R.id.team_b_score);
            team_b_score.setText(valueB);
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView team_a_score=(TextView)findViewById(R.id.team_a_score);
        SharedPreferences sp=getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor e=sp.edit();
        e.putString("counterf",team_a_score.getText().toString());
        e.commit();


        TextView team_b_score=(TextView)findViewById(R.id.team_b_score);
        SharedPreferences spB=getSharedPreferences("dataB", Context.MODE_PRIVATE);
        e = spB.edit();
        e.putString("counterBf",team_b_score.getText().toString());
        e.commit();

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Caracolillo (View view){
        TextView team_a_score=(TextView)findViewById(R.id.team_a_score);
        String text=team_a_score.getText().toString();
        int scoreTeamA=Integer.parseInt(text);
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA (scoreTeamA);
    }

    public void Caracol (View view) {
        TextView team_a_score=(TextView)findViewById(R.id.team_a_score);
        String text=team_a_score.getText().toString();
        int scoreTeamA=Integer.parseInt(text);
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA (scoreTeamA);
    }

    public void Parranda (View view) {
        TextView team_a_score=(TextView)findViewById(R.id.team_a_score);
        String text=team_a_score.getText().toString();
        int scoreTeamA=Integer.parseInt(text);
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA (scoreTeamA);
    }

    public void Ronda (View view) {
        TextView team_a_score=(TextView)findViewById(R.id.team_a_score);
        String text=team_a_score.getText().toString();
        int scoreTeamA=Integer.parseInt(text);
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */

    public void CaracolilloB (View view) {
        TextView team_b_score=(TextView)findViewById(R.id.team_b_score);
        String text=team_b_score.getText().toString();
        int scoreTeamB=Integer.parseInt(text);
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB (scoreTeamB);
    }

    public void CaracolB (View view) {
        TextView team_b_score=(TextView)findViewById(R.id.team_b_score);
        String text=team_b_score.getText().toString();
        int scoreTeamB=Integer.parseInt(text);
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB (scoreTeamB);
    }

    public void ParrandaB (View view) {
        TextView team_b_score=(TextView)findViewById(R.id.team_b_score);
        String text=team_b_score.getText().toString();
        int scoreTeamB=Integer.parseInt(text);
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB (scoreTeamB);
    }

    public void RondaB (View view){
        TextView team_b_score=(TextView)findViewById(R.id.team_b_score);
        String text=team_b_score.getText().toString();
        int scoreTeamB=Integer.parseInt(text);
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    /**
     * Reset
     */

    public void Reset (View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB (scoreTeamB);
        displayForTeamA (scoreTeamA);
    }

}

