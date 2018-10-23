package com.addepter;

/**
 * @Author:泡泡
 * @Date:14:17 2018/6/12
 * @Modified By:
 */
public class VlcPlayer implements  AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        //do nothing
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("playing vlc filename"+filename);
    }
}
