package com.mylearn;

public class Main {

    public static void main(String[] args) {
        Speaker speaker = new RealCoolSpeaker();
        App app = new App();
        app.add(new Play(speaker));
        app.add(new Pause(speaker));
        app.add(() -> speaker.volumeDown());
        app.add (speaker :: volumeUp);
        app.run();
    }
}
