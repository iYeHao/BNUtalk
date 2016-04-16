package com.example.fragment;

import com.bnutalk.activitytest.R;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FourFragment  extends LauncherBaseFragment{
	private boolean started;//閺勵垰鎯佸锟介崥顖氬З閻拷(ViewPage濠婃垵濮╅弮璺猴拷娆戠舶鏉╂瑤閲滈崣姗�鍣虹挧瀣拷锟�)
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rooView=inflater.inflate(R.layout.four_ui, null);
		startAnimation();
		return rooView;
	}
	
	public void startAnimation(){
		
	}
	
	@Override
	public void stopAnimation(){
	
	}
}


