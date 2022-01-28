package com.mylearn;

public class VolumeDown implements Command{
    private final Speaker speaker;
    public VolumeDown(Speaker speaker){
        this.speaker = speaker;
    }
    @Override
    public void execute() {
        speaker.volumeDown();
    }
}
