package com.example.android.teamscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstTeamScore = 0;
    int secondTeamScore = 0;
    TextView firstTeamScoreView;
    TextView secondTeamScoreView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstTeamScoreView = (TextView) findViewById(R.id.firstTeamScoreView);
        secondTeamScoreView = (TextView) findViewById(R.id.secondTeamScoreView);
    }

    public void addThreePoints(View view){
        firstTeamScore = firstTeamScore + 3;
        displayScore(firstTeamScoreView, firstTeamScore);
    }
    public void addTwoPoints(View view){
        firstTeamScore = firstTeamScore + 2;
        displayScore(firstTeamScoreView, firstTeamScore);
    }
    public void addOnePoint(View view){
        firstTeamScore = firstTeamScore + 1;
        displayScore(firstTeamScoreView, firstTeamScore);
    }
    public void addThreePointsB(View view){
        secondTeamScore = secondTeamScore + 3;
        displayScore(secondTeamScoreView, secondTeamScore);
    }
    public void addTwoPointsB(View view){
        secondTeamScore = secondTeamScore + 2;
        displayScore(secondTeamScoreView, secondTeamScore);
    }
    public void addOnePointB(View view){
        secondTeamScore = secondTeamScore +1;
        displayScore(secondTeamScoreView, secondTeamScore);
    }

    public void resetScore(View view){
        firstTeamScore = 0;
        secondTeamScore = 0;
        displayScore(firstTeamScoreView, firstTeamScore);
        displayScore(secondTeamScoreView, firstTeamScore);
    }

    public void displayScore(TextView view, int score){
        view.setText(String.valueOf(score));
    }

}
