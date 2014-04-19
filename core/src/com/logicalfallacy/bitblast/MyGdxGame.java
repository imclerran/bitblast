package com.logicalfallacy.bitblast;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import java.util.*;
import com.badlogic.gdx.Game;

import com.logicalfallacy.bitblast.screens.*;

public class MyGdxGame extends Game
{
	MainMenuScreen mainMenuScreen;
	GameScreen gameScreen;
	

	@Override
	public void create()
	{
		mainMenuScreen = new MainMenuScreen(this);
		gameScreen = new GameScreen(this);
		gameScreen.create();
		setScreen(gameScreen);
	}

	@Override
	public void render()
	{
		super.render();
	}

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
