package Engine;

import javax.sound.sampled.*;
import java.io.IOException;

public class SoundEngine extends Thread {

    Clip clip;
    AudioInputStream audio;

    float currDB = 0F;
    float targetDB = 0F;
    float fadePerStep = .1F;   // .1 works for applets, 1 is okay for apps
    boolean fading = false;
    FloatControl gainControl;


    public void playCurrentBGM() throws LineUnavailableException, IOException {
        clip = AudioSystem.getClip();
        clip.open(audio);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.start();
    }

    public void setCurrentBGM(String path) throws UnsupportedAudioFileException, IOException {
        AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream(path));
    }

    public void swapCurrentBGM() {

    }

    private void fadeOutBeforeSwap() {

    }

    private void fadeInAfterSwap() {

    }

    private void stopCurrentBGM() {

    }

    public void setVolume(double value) {
        // Value must be set between 0 and 1.
        value = (value<=0.0)? 0.0001 : ((value>1.0)? 1.0 : value);
        try {
            float dB = (float)(Math.log(value)/Math.log(10.0)*20.0);
            gainControl.setValue(dB);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void shiftVolumeTo(double value) {
        // value is between 0 and 1
        value = (value<=0.0)? 0.0001 : ((value>1.0)? 1.0 : value);
        targetDB = (float)(Math.log(value)/Math.log(10.0)*20.0);
        if (!fading) {
            Thread t = new Thread(this);  // start a thread to fade volume
            t.start();  // calls run() below
        }
    }

    public void run()
    {
        fading = true;   // prevent running twice on same sound
        if (currDB > targetDB) {
            while (currDB > targetDB) {
                currDB -= fadePerStep;
                gainControl.setValue(currDB);
                try {Thread.sleep(10);} catch (Exception e) {}
            }
        }
        else if (currDB < targetDB) {
            while (currDB < targetDB) {
                currDB += fadePerStep;
                gainControl.setValue(currDB);
                try {Thread.sleep(10);} catch (Exception e) {}
            }
        }
        fading = false;
        currDB = targetDB;  // now sound is at this volume level
    }





}
