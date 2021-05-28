import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class Sounds {
	
	private static AudioInputStream gameAudio;

	public static void playSoundTrack()
	{
		try
		{
			gameAudio = AudioSystem.getAudioInputStream(new File("Super Mario Bros. Soundtrack.mp3"));
			Clip clip = AudioSystem.getClip();
			clip.open(gameAudio);
			clip.start();
	    } 
		catch(Exception e) {
	        System.out.println("Error with playing start.");
	        e.printStackTrace();
	    }
	}
	
	public void stopSoundTrack()
	{
		//gameAudio
	}
	
	
	public static void playStart()
	{
		try
		{
			Clip clip = AudioSystem.getClip();
		    clip.open(AudioSystem.getAudioInputStream(new File("smb_1-up.wav")));
		    clip.start();
		    
	    } 
		catch(Exception e) {
	        System.out.println("Error with playing start.");
	        e.printStackTrace();
	    }
	}
	
	public static void playJump()
	{
		try
		{
			Clip clip = AudioSystem.getClip();
		    clip.open(AudioSystem.getAudioInputStream(new File("src/smb_jump-small.wav")));
		    clip.start();
		    
	    } 
		catch(Exception e) {
	        System.out.println("Error with playing jump.");
	        e.printStackTrace();
	    }
	}

	public static void playLevelCleared()
	{
		try
		{
			Clip clip = AudioSystem.getClip();
		    clip.open(AudioSystem.getAudioInputStream(new File("src/smb_stage_clear.wav")));
		    clip.start();
		    
	    } 
		catch(Exception e) {
	        System.out.println("Error with playing level cleared.");
	        e.printStackTrace();
	    }
	}
	
	public static void playGameOver()
	{
		try
		{
			Clip clip = AudioSystem.getClip();
		    clip.open(AudioSystem.getAudioInputStream(new File("src/smb_gameover.wav")));
		    clip.start();
		    
	    } 
		catch(Exception e) {
	        System.out.println("Error with playing game over.");
	        e.printStackTrace();
	    }
	}
}