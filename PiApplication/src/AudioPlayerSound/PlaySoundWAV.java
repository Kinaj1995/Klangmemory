/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AudioPlayerSound;

import Rfid.Interface;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author a_bir
 * Plays all WAV Audio Files
 */
public class PlaySoundWAV {

    public void playSound(String audioFileName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(Interface.getPlayPath() + audioFileName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            if(clip.isActive()){
                clip.close();
                clip.flush();
            }
            clip.start();
            //clip.close();
            clip.flush();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}
