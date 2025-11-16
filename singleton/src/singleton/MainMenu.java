package singleton;

import maneger.AudioManeger;
import maneger.ConfigurationManeger;
import screen.Screen;

public class MainMenu extends Screen{
	private static MainMenu instance = null;
	private AudioManeger audioManeger;
	private ConfigurationManeger configurationManeger;
	
	private MainMenu() {
		super("Main Menu", 200, 200);
		this.audioManeger = new AudioManeger();
		this.configurationManeger = new ConfigurationManeger();
	}
	
	public static MainMenu getInstace() {
		if(instance == null) {
			instance = new MainMenu();
		}
		return instance;
	}

	public AudioManeger getAudioManeger() {
		return audioManeger;
	}

	public void setAudioManeger(AudioManeger audioManeger) {
		this.audioManeger = audioManeger;
	}

	public ConfigurationManeger getConfigurationManeger() {
		return configurationManeger;
	}

	public void setConfigurationManeger(ConfigurationManeger configurationManeger) {
		this.configurationManeger = configurationManeger;
	}
	
}