package com.Inheritance_association;

public class Honda extends Car{
	public void hondaEngine()
	{
		CarEngine carEngine=new CarEngine();
		carEngine.engineStart();
	}
	public void hondaMusic()
	{
		CarMusicPlayer carMusic=new CarMusicPlayer();
		carMusic.musicPlayerStart();;
	}
}
