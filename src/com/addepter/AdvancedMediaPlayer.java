package com.addepter;

/**
 * @Author:泡泡
 * @Date:11:16 2018/6/12
 * @Modified By:
 * 超级播放器  既能放 vlc  也能放 MP4
 */
public interface AdvancedMediaPlayer {

    void playMp4(String filename);
    void playVlc(String filename);
}
