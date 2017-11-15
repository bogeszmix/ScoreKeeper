package hu.bognaroliver.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

	private final int ONE_POINT = 1;
	private final int RESET = 0;

	private int overallScoreTeamA = 0;
	private int overallFoulTeamA = 0;
	private int overallThrowTeamA = 0;
	private int overallPenaltyTeamA = 0;

	private int overallScoreTeamB = 0;
	private int overallFoulTeamB = 0;
	private int overallThrowTeamB = 0;
	private int overallPenaltyTeamB = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		displayScoresForTeamA(overallScoreTeamA, overallFoulTeamA, overallThrowTeamA, overallPenaltyTeamA);
		displayScoresForTeamB(overallScoreTeamB, overallFoulTeamB, overallThrowTeamB, overallPenaltyTeamB);
	}

	/*
		*Display Team A score
	 */
	private void displayScoresForTeamA(int score, int foul, int scorethrow, int penalty)
	{
		TextView scoreView = (TextView) findViewById(R.id.score_A);
		TextView scoreFouls = (TextView) findViewById(R.id.score_foul_A);
		TextView scoreThrows = (TextView) findViewById(R.id.score_throw_A);
		TextView scorePenalty = (TextView) findViewById(R.id.score_penalty_A);

		scoreView.setText(String.valueOf(score));
		scoreFouls.setText(String.valueOf(foul));
		scoreThrows.setText(String.valueOf(scorethrow));
		scorePenalty.setText(String.valueOf(penalty));
	}

	/*
		*Display Team B score
 	*/
	private void displayScoresForTeamB(int score, int foul, int scorethrow, int penalty)
	{
		TextView scoreView = (TextView) findViewById(R.id.score_B);
		TextView scoreFouls = (TextView) findViewById(R.id.score_foul_B);
		TextView scoreThrows = (TextView) findViewById(R.id.score_throw_B);
		TextView scorePenalty = (TextView) findViewById(R.id.score_penalty_B);

		scoreView.setText(String.valueOf(score));
		scoreFouls.setText(String.valueOf(foul));
		scoreThrows.setText(String.valueOf(scorethrow));
		scorePenalty.setText(String.valueOf(penalty));
	}
	//Team A buttons
	public void addOneScore_A(View view)
	{
		overallScoreTeamA += ONE_POINT;
		displayScoresForTeamA(overallScoreTeamA,overallFoulTeamA,overallThrowTeamA,overallPenaltyTeamA);
	}

	public void addOneFoul_A(View view)
	{
		overallFoulTeamA += ONE_POINT;
		displayScoresForTeamA(overallScoreTeamA,overallFoulTeamA,overallThrowTeamA,overallPenaltyTeamA);
	}

	public void addOneThrow_A(View view)
	{
		overallThrowTeamA += ONE_POINT;
		displayScoresForTeamA(overallScoreTeamA,overallFoulTeamA,overallThrowTeamA,overallPenaltyTeamA);
	}

	public void addOnePenalty_A(View view)
	{
		overallPenaltyTeamA += ONE_POINT;
		displayScoresForTeamA(overallScoreTeamA,overallFoulTeamA,overallThrowTeamA,overallPenaltyTeamA);
	}

	//Team B buttons
	public void addOneScore_B(View view)
	{
		overallScoreTeamB += ONE_POINT;
		displayScoresForTeamB(overallScoreTeamB,overallFoulTeamB,overallThrowTeamB,overallPenaltyTeamB);
	}

	public void addOneFoul_B(View view)
	{
		overallFoulTeamB += ONE_POINT;
		displayScoresForTeamB(overallScoreTeamB,overallFoulTeamB,overallThrowTeamB,overallPenaltyTeamB);
	}

	public void addOneThrow_B(View view)
	{
		overallThrowTeamB += ONE_POINT;
		displayScoresForTeamB(overallScoreTeamB,overallFoulTeamB,overallThrowTeamB,overallPenaltyTeamB);
	}

	public void addOnePenalty_B(View view)
	{
		overallPenaltyTeamB += ONE_POINT;
		displayScoresForTeamB(overallScoreTeamB,overallFoulTeamB,overallThrowTeamB,overallPenaltyTeamB);
	}

	//Reset both team points
	public void resetPoint(View view)
	{
		overallScoreTeamA = RESET;
		overallPenaltyTeamA = RESET;
		overallThrowTeamA = RESET;
		overallFoulTeamA = RESET;

		overallScoreTeamB = RESET;
		overallPenaltyTeamB = RESET;
		overallThrowTeamB = RESET;
		overallFoulTeamB = RESET;

		displayScoresForTeamA(overallScoreTeamA, overallFoulTeamA, overallThrowTeamA, overallPenaltyTeamA);
		displayScoresForTeamB(overallScoreTeamB, overallFoulTeamB, overallThrowTeamB, overallPenaltyTeamB);
	}
}
