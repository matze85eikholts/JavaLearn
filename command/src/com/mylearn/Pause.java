package com.mylearn;

public class Pause implements Command{
    private final Speaker speaker;
    public Pause(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public void execute() {
        speaker.pause();
    }
}
