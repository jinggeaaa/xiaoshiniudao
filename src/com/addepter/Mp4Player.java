package com.addepter;

/**
 * @Author:泡泡
 * @Date:14:15 2018/6/12
 * @Modified By:
 */
public class Mp4Player implements  AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        System.out.println("playing Mp4 file"+filename);
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("playing Vlc file"+filename);
    }
}
