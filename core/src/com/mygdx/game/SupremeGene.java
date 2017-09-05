package com.mygdx.game;


import com.badlogic.gdx.Game;

public class SupremeGene extends Game {
	private boolean paused;
	public static final String GAME_NAME = "SupremeGene";


	
	@Override
	public void create () {
		init();
		//this.setScreen(new SplashScreen(this));
	}

	private void init() {
		//TODO services initiation
	}

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
	

}
