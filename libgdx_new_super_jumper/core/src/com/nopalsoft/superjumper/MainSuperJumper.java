package com.nopalsoft.superjumper;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.I18NBundle;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.nopalsoft.superjumper.handlers.FacebookHandler;
import com.nopalsoft.superjumper.handlers.GameServicesHandler;
import com.nopalsoft.superjumper.handlers.RequestHandler;
import com.nopalsoft.superjumper.screens.MainMenuScreen;
import com.nopalsoft.superjumper.screens.Screens;

public class MainSuperJumper extends Game {
	// Các biến dịch vụ và xử lý yêu cầu cần thiết cho trò chơi
	public final GameServicesHandler gameServiceHandler;
	public final RequestHandler reqHandler;
	public final FacebookHandler facebookHandler;

	public I18NBundle idiomas; // Đối tượng cho việc đa ngôn ngữ

	// Constructor nhận các xử lý yêu cầu và dịch vụ trò chơi làm tham số
	public MainSuperJumper(RequestHandler reqHandler, GameServicesHandler gameServiceHandler, FacebookHandler facebookHandler) {
		this.reqHandler = reqHandler;
		this.gameServiceHandler = gameServiceHandler;
		this.facebookHandler = facebookHandler;
	}
	// Các biến thể hiện Stage và SpriteBatch
	public Stage stage;
	public SpriteBatch batcher;

	@Override
	public void create() {
		// idiomas = I18NBundle.createBundle(Gdx.files.internal("strings/strings"));

		// Khởi tạo Stage với kích thước tương thích với màn hình
		stage = new Stage(new StretchViewport(Screens.SCREEN_WIDTH, Screens.SCREEN_HEIGHT));


		// Khởi tạo SpriteBatch để vẽ đồ họa
		batcher = new SpriteBatch();
		// Tải cài đặt trò chơi
		Settings.load();

		// Tải tài nguyên của trò chơi
		Assets.load();
		// Achievements.init(this);

		// Đặt màn hình chính của trò chơi là MainMenuScreen
		setScreen(new MainMenuScreen(this));
	}
}
