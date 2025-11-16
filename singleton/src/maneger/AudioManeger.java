package maneger;

import java.util.ArrayList;
import java.util.List;

import singleton.audio.Music;

public class AudioManeger {
	private Integer volume;
	private List<Music> musics;
	private int actualMusic;
	
	public AudioManeger() {
		this.volume = 100;
		this.musics = new ArrayList<Music>();
		this.actualMusic = 0;
	}
	
	public void upVolume(Integer value) {
		this.volume += value;
		if(this.volume > 100) {
			this.volume = 100;
		}
	}
	
	public void downVolume(Integer value) {
		this.volume -= value;
		if(this.volume < 0){
			this.volume = 0;
		}
	}
	
	public void addMusic(Music music) {
		this.musics.add(music);
	}
	
	public void removeMusic(Music music) {
		this.musics.remove(music);
	}
	
	public void playMusic() {
		if(this.musics.size() == 0) {
			System.out.println("The playlist is empty");
			return;
		}
		System.out.println("Playing " + this.musics.get(this.actualMusic).getName());
	}
	
	public void pauseMusic() {
		System.out.println("Music paused");
	}
	
	public void nextMusic() {
		this.actualMusic++;
		if(this.actualMusic >= this.musics.size()) {
			this.actualMusic = 0;
		}
		this.playMusic();
	}
	
	public void previousMusic() {
		this.actualMusic--;
		if(this.actualMusic == 0) {
			this.actualMusic = this.musics.size() - 1;
		}
		this.playMusic();
	}
}