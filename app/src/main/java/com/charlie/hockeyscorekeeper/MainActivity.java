package com.charlie.hockeyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamAinP1 = 0;
    int scoreTeamAinP2 = 0;
    int scoreTeamAinP3 = 0;
    int scoreTeamA = 0;

    int scoreTeamBinP1 = 0;
    int scoreTeamBinP2 = 0;
    int scoreTeamBinP3 = 0;
    int scoreTeamB = 0;

    /**
     * Team A Scoring
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAP1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p1team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAP2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p2team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAP3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p3team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addP1forTeamA(View view) {
        scoreTeamAinP1 = scoreTeamAinP1 + 1;
        scoreTeamA = scoreTeamA + 1;
        displayForTeamAP1(scoreTeamAinP1);
        displayForTeamA(scoreTeamA);

    }

    public void addP2forTeamA(View view) {
        scoreTeamAinP2 = scoreTeamAinP2 + 1;
        scoreTeamA = scoreTeamA + 1;
        displayForTeamAP2(scoreTeamAinP2);
        displayForTeamA(scoreTeamA);

    }

    public void addP3forTeamA(View view) {
        scoreTeamAinP3 = scoreTeamAinP3 + 1;
        scoreTeamA = scoreTeamA + 1;
        displayForTeamAP3(scoreTeamAinP3);
        displayForTeamA(scoreTeamA);

    }

    /**
     * Team B Scoring
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBP1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p1team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBP2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p2team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBP3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.p3team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addP1forTeamB(View view) {
        scoreTeamBinP1 = scoreTeamBinP1 + 1;
        scoreTeamB = scoreTeamB + 1;
        displayForTeamBP1(scoreTeamBinP1);
        displayForTeamB(scoreTeamB);

    }

    public void addP2forTeamB(View view) {
        scoreTeamBinP2 = scoreTeamBinP2 + 1;
        scoreTeamB = scoreTeamB + 1;
        displayForTeamBP2(scoreTeamBinP2);
        displayForTeamB(scoreTeamB);

    }

    public void addP3forTeamB(View view) {
        scoreTeamBinP3 = scoreTeamBinP3 + 1;
        scoreTeamB = scoreTeamB + 1;
        displayForTeamBP3(scoreTeamBinP3);
        displayForTeamB(scoreTeamB);

    }


    /**
     * Reset score
     */

    public void resetScore(View view) {
        scoreTeamAinP1 = 0;
        scoreTeamAinP2 = 0;
        scoreTeamAinP3 = 0;
        scoreTeamA = 0;
        scoreTeamBinP1 = 0;
        scoreTeamBinP2 = 0;
        scoreTeamBinP3 = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamAP1(scoreTeamAinP1);
        displayForTeamAP2(scoreTeamAinP2);
        displayForTeamAP3(scoreTeamAinP3);
        displayForTeamB(scoreTeamB);
        displayForTeamBP1(scoreTeamBinP1);
        displayForTeamBP2(scoreTeamBinP2);
        displayForTeamBP3(scoreTeamBinP3);
    }
}
