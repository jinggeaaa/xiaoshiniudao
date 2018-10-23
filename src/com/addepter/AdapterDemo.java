package com.addepter;

/**
 * @Author:泡泡
 * @Date:14:35 2018/6/12
 * @Modified By:
 */
public class AdapterDemo {

    public static void main(String[] args) {
        MediaPlayer audioPlayer=new AudioPlayer();

        audioPlayer.play("mp3","only you.mp3");
        audioPlayer.play("mp4","only you.mp4");
        audioPlayer.play("vlc","only you.vlc");
        audioPlayer.play("bhd","only you.bhd");
        System.out.println(" git ti jiao hou de di yi ci ti  jiao ");
    }
}
