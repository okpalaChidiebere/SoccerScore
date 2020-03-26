package com.example.android.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;
    int foulTeamA;
    int foulTeamB;
    String teamA_name;
    String teamB_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays Team A name.
     */
    public void displayTeamAName(String name) {
        TextView teamName = (TextView) findViewById(R.id.teamAText);
        teamName.setText(name);
    }

    /**
     * Displays Number of Goals for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Number of Fouls for Team A.
     */
    public void displayFoulTeamA(int foul) {
        TextView foulScoreView = (TextView) findViewById(R.id.team_a_foulA);
        foulScoreView.setText(String.valueOf(foul));
    }

    /**
     * Adds one goal to team A.
     */
    public void addOneGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Adds one foul to team A.
     */
    public void addOneFoulTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }

    /**
     * Set Team A abd Team B names
     */
    public void setTeams(View view) {
        EditText teamANAme = (EditText) findViewById(R.id.set_a_team);
        EditText teamBName = (EditText) findViewById(R.id.set_b_team);

        if (teamANAme.length() != 0 && teamBName.length() != 0) { /*error checking empty string before initializing text fields*/
            teamA_name = teamANAme.getText().toString();
            teamB_name = teamBName.getText().toString();

            displayTeamAName(teamA_name);
            displayTeamBName(teamB_name);
        }
    }

    /**
     * Displays Team B Name.
     */
    public void displayTeamBName(String name) {
        TextView teamName = (TextView) findViewById(R.id.teamBText);
        teamName.setText(name);
    }

    /**
     * Displays Number of Goals for Team B.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_scoreB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Number of Fouls for Team B.
     */
    public void displayFoulTeamB(int foul) {
        TextView foulScoreView = (TextView) findViewById(R.id.team_b_foulB);
        foulScoreView.setText(String.valueOf(foul));
    }

    /**
     * Adds one goal to team B.
     */
    public void addOneGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Adds one foul to team B.
     */
    public void addOneFoulTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }

    /*Sets edits texts for bthe teams empty*/
    public void setEditTextsEmpty() {
        EditText teamAName = (EditText) findViewById(R.id.set_a_team);
        EditText teamBName = (EditText) findViewById(R.id.set_b_team);
        teamAName.setText("");
        teamBName.setText("");
    }


    /**
     * Displays reset score and empty editTexts.
     */
    public void resetPoints(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        teamA_name = "Team A";
        teamB_name = "Team B";
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
        displayTeamAName(teamA_name);
        displayTeamBName(teamB_name);
        setEditTextsEmpty();
    }
}
