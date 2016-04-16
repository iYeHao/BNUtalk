package com.example.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.bnutalk.activitytest.R;

public class FirstFragment extends LauncherBaseFragment{

	private boolean started;//閺勵垰鎯佸锟介崥顖氬З閻拷(ViewPage濠婃垵濮╅弮璺猴拷娆戠舶鏉╂瑤閲滈崣姗�鍣虹挧瀣拷锟�)
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rooView=inflater.inflate(R.layout.first_ui, null);
	
		startAnimation();
		return rooView;
	}
	
	public void startAnimation(){
		
	}
	
	@Override
	public void stopAnimation(){
		
	}
}
