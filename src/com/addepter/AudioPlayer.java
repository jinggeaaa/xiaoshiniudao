package com.addepter;

/**
 * @Author:泡泡
 * @Date:14:21 2018/6/12
 * @Modified By:
 *
 * 创建MediaPlayer接口的实体类
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdater mediaAdater;
    @Override
    public void play(String autoType, String name) {
        if (autoType.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 filename:"+name);
        }else if (autoType.equalsIgnoreCase("mp4")||autoType.equalsIgnoreCase("vlc")){
            mediaAdater=new MediaAdater(autoType);
            mediaAdater.play(autoType,name);
        }else{
            System.out.println("invalid media."+autoType+"format not supported");
        }
    }
}
