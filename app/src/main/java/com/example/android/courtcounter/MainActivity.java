package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreOfTeamA = 0;
    int scoreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreOfTeamA);
        displayForTeamB(scoreOfTeamB);
    }

    public void score3A(View view) {
        scoreOfTeamA = scoreOfTeamA + 3;
        displayForTeamA(scoreOfTeamA);
    }

    public void score2A(View view) {
        scoreOfTeamA = scoreOfTeamA + 2;
        displayForTeamA(scoreOfTeamA);
    }

    public void freeThrowA(View view) {
        scoreOfTeamA = scoreOfTeamA + 1;
        displayForTeamA(scoreOfTeamA);
    }


    public void score3B(View view) {
        scoreOfTeamB = scoreOfTeamB + 3;
        displayForTeamB(scoreOfTeamB);
    }

    public void score2B(View view) {
        scoreOfTeamB = scoreOfTeamB + 2;
        displayForTeamB(scoreOfTeamB);
    }

    public void freeThrowB(View view) {
        scoreOfTeamB = scoreOfTeamB + 1;
        displayForTeamB(scoreOfTeamB);
    }

    public void reset(View view) {
        scoreOfTeamB = 0;
        scoreOfTeamA = 0;
        displayForTeamB(scoreOfTeamB);
        displayForTeamA(scoreOfTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

}
