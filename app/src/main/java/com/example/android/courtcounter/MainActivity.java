package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addFifteenForTeamA(View v) {

        scoreTeamA = scoreTeamA + 15;
        displayForTeamA(scoreTeamA);

    }

    public void addFifteenForTeamB(View v) {

        scoreTeamB = scoreTeamB + 15;
        displayForTeamB(scoreTeamB);

    }

    public void addTenForTeamA(View v) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    public void addTenForTeamB(View v) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void clear(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
