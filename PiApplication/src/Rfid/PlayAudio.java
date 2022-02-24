/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import java.util.ArrayList;
import java.util.Set;
import javax.sound.sampled.AudioInputStream;
import marytts.LocalMaryInterface;
import marytts.MaryInterface;
import marytts.exceptions.MaryConfigurationException;
import marytts.exceptions.SynthesisException;

/**
 *
 * @author a_bir
 */
public class PlayAudio {
    
public void playAudio(String content, Integer voiceType, Float speed) throws MaryConfigurationException, SynthesisException, InterruptedException {
        MaryInterface maryTts = new LocalMaryInterface();
        Set<String> voices = maryTts.getAvailableVoices();
        ArrayList<String> voice=new ArrayList<>(voices);
        //voice 0:deutsch weibl. 1:englisch 2:robot 3:deutsch männl.
        if(voiceType==0||voiceType==1||voiceType==2||voiceType==3){
            maryTts.setVoice(voice.get(voiceType));
            maryTts.getAvailableVoices().stream().forEach(System.out::println);
        }
        else{
            maryTts.setVoice(voice.get(0));
            System.out.println("Wrong voice type number!");
        }
        //read content
        AudioInputStream audioContent = maryTts.generateAudio(content);
        AudioPlayer playerContent = new AudioPlayer(audioContent);
        playerContent.start();
        playerContent.join();
        maryTts.setAudioEffects("Rate(durScale:1.5)");
    }

 //   public static void main(String[] args) throws InterruptedException, MaryConfigurationException, SynthesisException {
        //String content="Bravo, du hast die Katze gefunden";
   //     PlayAudio test =new PlayAudio();
   //     test.playAudio("Bravo",0,0.5f);
   // }

}
