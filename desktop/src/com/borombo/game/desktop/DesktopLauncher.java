package com.borombo.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.borombo.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MyGdxGame.WHIDTH;
		config.height = MyGdxGame.HEIGHT;
		config.title = MyGdxGame.TITLE;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
