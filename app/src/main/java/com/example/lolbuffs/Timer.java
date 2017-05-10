package com.example.lolbuffs;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Timer extends CountDownTimer {
	
	private TextView text;
	private String newTime;
	private long startTime;
	private boolean finished;
	private NumberFormat secondsFormatter = new DecimalFormat("#00");

	public Timer(long millisInFuture, long countDownInterval, TextView t) {
		super(millisInFuture, countDownInterval);
		startTime = millisInFuture;
		text = t;
		finished = false;
	}

	@Override
	public void onFinish() {
		text.setText(this.createTime(startTime));
		//button.setText("Start");
		finished = true;
	}

	@Override
	public void onTick(long millisUntilFinished) {
		finished = false;
		newTime = this.createTime(millisUntilFinished);
		text.setText(newTime);
	}

	public String createTime(long millisUntilFinished) {
		String result = null;
		
		long seconds = millisUntilFinished/1000;
		long minutes = seconds/60;
		seconds -= minutes * 60;
		
		result = minutes + ":" + secondsFormatter.format(seconds);
		
		return result;
	}
	
	public boolean getFinished() {
		return finished;
	}
}
