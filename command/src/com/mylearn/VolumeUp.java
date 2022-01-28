package com.mylearn;

public class VolumeUp implements Command{
    private final Speaker speaker;
    public VolumeUp(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public void execute(){
        speaker.volumeUp();
    }
}
