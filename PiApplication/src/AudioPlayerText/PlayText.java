package AudioPlayerText;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
 * Plays the text when a pair is found or not. 
 */
public class PlayText {
    
public void playText(String content, Integer voiceType, Float speed) throws MaryConfigurationException, SynthesisException, InterruptedException, Exception {
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
        System.out.println("gestartet");
        maryTts.setAudioEffects("Rate(durScale:1.5)");
        playerContent.cancel();
        System.out.println("cancel durchlaufen");
    }

 //   public static void main(String[] args) throws InterruptedException, MaryConfigurationException, SynthesisException {
        //String content="Bravo, du hast die Katze gefunden";
   //     PlayText test =new PlayText();
   //     test.playAudio("Bravo",0,0.5f);
   // }

}
