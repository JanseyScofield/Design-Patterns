import maneger.AudioManeger;

import screen.Screen;
import singleton.MainMenu;
import singleton.audio.Music;

public class GameApp {
	
	public static void main(String[] args) {
		GameApp app = new GameApp();
		app.phase1();
		app.phase2();
	}
	
	public void phase1() {
		System.out.println("Phase 1");
		Screen mainScreen = new Screen("Main Screen", 1400, 1400);
		mainScreen.show();
		MainMenu mainMenu = MainMenu.getInstace();
		mainMenu.show();
		AudioManeger audioManeger = mainMenu.getAudioManeger();
		audioManeger.playMusic();
		audioManeger.addMusic(new Music("In the End"));
		audioManeger.playMusic();
	}
	
	public void phase2() {
		System.out.println("Phase 2");
		Screen mainScreen = new Screen("Main Screen", 1400, 1400);
		mainScreen.show();
		MainMenu mainMenu = MainMenu.getInstace();
		mainMenu.show();
		AudioManeger audioManeger = mainMenu.getAudioManeger();
		audioManeger.playMusic();
		audioManeger.addMusic(new Music("Numb"));
		audioManeger.nextMusic();
		audioManeger.previousMusic();
	}
}
