
import java.net.URL;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class safeCracker {
	
	public static void main(String[] args) {
		/* Your mission: use the tryCode method to crack the safe by trying all possible combinations */
for (int i = 0; i <= 999; i++) {
	
}
		tryCode(secretCode);
		
	}
	
	static void tryCode(int guess) {
		System.out.println("trying " + guess);
		
		if (guess == secretCode) {
			playSoundFromInternet("http://school.wintrisstech.org/sounds/me%20gusta.wav");
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			System.exit(0);
		} 
	}

	public static void playSoundFromInternet(String soundURL) {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new URL(soundURL));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        ex.printStackTrace();
	    }
	}

	static int secretCode = 9999999 - new Random().nextInt(100);

}
