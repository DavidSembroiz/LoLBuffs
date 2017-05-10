package com.example.lolbuffs;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main extends Activity {
	
	private boolean startedob, startedor, startedeb, starteder, startedd, startedb;
	private TextView tob, tor, teb, ter, td, tb;
	private ImageButton ourBlueI, ourRedI, eBlueI, eRedI, dragonI, baronI;
	private Timer timerob, timeror, timereb, timerer, timerd, timerb;
	private final long lowBuffsTime = 300000;
	private final long dragonTime = 360000;
	private final long baronTime = 420000;
	private final long interval = 1000;
    private int DEBUG = 1;
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Our Blue
		
		startedob = false;
		tob = (TextView) findViewById(R.id.textView1);
		tob.setVisibility(View.INVISIBLE);
		ourBlueI = (ImageButton) findViewById(R.id.imageButton1);
		ourBlueI.setBackgroundColor(Color.TRANSPARENT);
		timerob = new Timer(lowBuffsTime, interval, tob);
		ourBlueI.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				initOurBlue(null);
			}
		});
		tob.setText(timerob.createTime(lowBuffsTime));
		
		
		// Our Red
		
		startedor = false;
		tor = (TextView) findViewById(R.id.textView2);
		tor.setVisibility(View.INVISIBLE);
		ourRedI = (ImageButton) findViewById(R.id.imageButton2);
		ourRedI.setBackgroundColor(Color.TRANSPARENT);
		timeror = new Timer(lowBuffsTime, interval, tor);
		ourRedI.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				initOurRed(null);
			}
		});
		tor.setText(timeror.createTime(lowBuffsTime));
		
		// Enemy Blue
		
		startedeb = false;
		teb = (TextView) findViewById(R.id.textView3);
		teb.setVisibility(View.INVISIBLE);
		eBlueI = (ImageButton) findViewById(R.id.imageButton3);
		eBlueI.setBackgroundColor(Color.TRANSPARENT);
		timereb = new Timer(lowBuffsTime, interval, teb);
		eBlueI.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				initEnemyBlue(null);
			}
		});
		teb.setText(timereb.createTime(lowBuffsTime));
		
		
		// Enemy Red
		
		starteder = false;
		ter = (TextView) findViewById(R.id.textView4);
		ter.setVisibility(View.INVISIBLE);
		eRedI = (ImageButton) findViewById(R.id.imageButton4);
		eRedI.setBackgroundColor(Color.TRANSPARENT);
		timerer = new Timer(lowBuffsTime, interval, ter);
		eRedI.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				initEnemyRed(null);
			}
		});
		ter.setText(timerer.createTime(lowBuffsTime));
		
		
		// Dragon
		
		startedd = false;
		td = (TextView) findViewById(R.id.textView5);
		td.setVisibility(View.INVISIBLE);
		dragonI = (ImageButton) findViewById(R.id.imageButton5);
		dragonI.setBackgroundColor(Color.TRANSPARENT);
		timerd = new Timer(dragonTime, interval, td);
		dragonI.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				initDragon(null);
			}
		});
		td.setText(timerd.createTime(dragonTime));
		
		// Baron
		
		startedb = false;
		tb = (TextView) findViewById(R.id.textView6);
		tb.setVisibility(View.INVISIBLE);
		baronI = (ImageButton) findViewById(R.id.imageButton6);
		baronI.setBackgroundColor(Color.TRANSPARENT);
		timerb = new Timer(baronTime, interval, tb);
		baronI.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				initBaron(null);
			}
		});
		tb.setText(timerb.createTime(baronTime));
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void initOurBlue(View view) {
		if (timerob.getFinished()) startedob = false;
		if (!startedob) {
			timerob.start();
			tob.setVisibility(View.VISIBLE);
			startedob = true;
			ourBlueI.setImageResource(R.drawable.obp);
		}
		else {
			startedob = false;
			timerob.cancel();
			tob.setVisibility(View.INVISIBLE);
			tob.setText(timerob.createTime(lowBuffsTime));
			ourBlueI.setImageResource(R.drawable.ob);
			
		}
	}
	
	private void initOurRed(View view) {
		if (timeror.getFinished()) startedor = false;
		if (!startedor) {
			timeror.start();
			tor.setVisibility(View.VISIBLE);
			startedor = true;
			ourRedI.setImageResource(R.drawable.or);
		}
		else {
			startedor = false;
			timeror.cancel();
			tor.setVisibility(View.INVISIBLE);
			tor.setText(timeror.createTime(lowBuffsTime));
			ourRedI.setImageResource(R.drawable.or);
		}
	}
	
	private void initEnemyBlue(View view) {
		if (timereb.getFinished()) startedeb = false;
		if (!startedeb) {
			timereb.start();
			teb.setVisibility(View.VISIBLE);
			startedeb = true;
			eBlueI.setImageResource(R.drawable.eb);
		}
		else {
			startedeb = false;
			timereb.cancel();
			teb.setVisibility(View.INVISIBLE);
			teb.setText(timereb.createTime(lowBuffsTime));
			eBlueI.setImageResource(R.drawable.eb);
		}
	}
	
	private void initEnemyRed(View view) {
		if (timerer.getFinished()) starteder = false;
		if (!starteder) {
			timerer.start();
			ter.setVisibility(View.VISIBLE);
			starteder = true;
			eRedI.setImageResource(R.drawable.er);
		}
		else {
			starteder = false;
			timerer.cancel();
			ter.setVisibility(View.INVISIBLE);
			ter.setText(timerer.createTime(lowBuffsTime));
			eRedI.setImageResource(R.drawable.er);
			
		}
	}
	
	private void initDragon(View view) {
		if (timerd.getFinished()) startedd = false;
		if (!startedd) {
			timerd.start();
			td.setVisibility(View.VISIBLE);
			startedd = true;
			dragonI.setImageResource(R.drawable.dragon);
		}
		else {
			startedd = false;
			timerd.cancel();
			td.setVisibility(View.INVISIBLE);
			td.setText(timerd.createTime(dragonTime));
			dragonI.setImageResource(R.drawable.dragon);
			
		}
	}
	
	private void initBaron(View view) {
		if (timerb.getFinished()) startedb = false;
		if (!startedb) {
			timerb.start();
			tb.setVisibility(View.VISIBLE);
			startedb = true;
			baronI.setImageResource(R.drawable.baron);
		}
		else {
			startedb = false;
			timerb.cancel();
			tb.setVisibility(View.INVISIBLE);
			tb.setText(timerb.createTime(baronTime));
			baronI.setImageResource(R.drawable.baron);
		}
	}
}
