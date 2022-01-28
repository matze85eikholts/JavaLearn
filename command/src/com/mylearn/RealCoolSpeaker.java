package com.mylearn;

public class RealCoolSpeaker implements Speaker{
    public void pause() {
        System.out.println("Pause");
    }
    public void play() {
        System.out.println("Play the Music!!!");
    }
    public void volumeDown() {
        System.out.println("Make sound one step down");
    }
    public void volumeUp() {
        System.out.println("Male sound one step up!!!");
    }
}
