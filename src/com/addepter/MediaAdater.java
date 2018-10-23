package com.addepter;

/**
 * @Author:泡泡
 * @Date:14:18 2018/6/12
 * @Modified By:
 * 适配器 适配播放器 完善它所不能完成的功能
 */
public class MediaAdater implements  MediaPlayer
{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdater(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }else{
            advancedMediaPlayer=new Mp4Player();
        }
    }
    @Override
    public void play(String autoType, String name) {
        if(autoType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(name);
        }else{
            advancedMediaPlayer.playMp4(name);
        }
    }
}
