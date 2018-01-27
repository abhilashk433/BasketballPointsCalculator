package midas.com.basketballpointscalculator;

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
    int teamscore = 0;
    public void point3(View view){
        teamscore = teamscore +3;
        displayForTeamA(teamscore);
    }
    public void point2(View view){
        teamscore = teamscore +2;
        displayForTeamA(teamscore);
    }
    public void point1(View view){
        teamscore = teamscore +1;
        displayForTeamA(teamscore);
    }
    public void reset(View view){
        teamscore = 0;
        displayForTeamA(teamscore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score1);
        scoreView.setText(String.valueOf(score));
    }
}
