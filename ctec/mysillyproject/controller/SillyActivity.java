package ctec.mysillyproject.controller;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * The Activity class of the app
 *@author Zack Moss
 *@version 1.0 10-14-14
 */
public class SillyActivity extends Activity implements View.OnClickListener
{
	private Button appButton;
	private TextView appText;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorList;
	private Random myRandom;
	
	
	/**
	 * Defines the objects and their values
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		//Gives you access to a button or any view object.
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.title);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		myRandom = new Random();
		
		//List of Colors in the ArrayList
		colorList = new ArrayList<Integer>();
		colorList.add(R.color.Red);
		colorList.add(R.color.White);
		colorList.add(R.color.Black);
		colorList.add(R.color.Blue);
		colorList.add(R.color.Gray);
		colorList.add(R.color.Lime);
		colorList.add(R.color.Cyan);
		colorList.add(R.color.Olive);
		colorList.add(R.color.Yellow);
		colorList.add(R.color.Purple);
		
		//Initiate the app's listeners.
		setupListeners();
	}
	
	/**
	 * Sets up the listeners in the app (doh)
	 */
	private void setupListeners()
	{
		appText.setOnClickListener(this);
		appButton.setOnClickListener(this);
	}
	
	/**
	 * Listens for the user's click on the different objects.
	 */
	@Override
	public void onClick(View v)
	{
		switch (v.getId()){
		case R.id.firstButton:
			appLayout.setBackgroundResource(colorList.get(myRandom.nextInt(colorList.size() - 1)));
			break;
		case R.id.title:
			appText.setTextColor(colorList.get(myRandom.nextInt(colorList.size() - 1)));
			break;
		}
	}
}
