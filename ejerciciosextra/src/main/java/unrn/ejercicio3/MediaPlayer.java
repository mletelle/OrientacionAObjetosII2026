package unrn.ejercicio3;

public class MediaPlayer implements Media {
    private VideoStream vs;
public MediaPlayer(VideoStream vs) {
    this.vs = vs;
}
    @Override
    public void play() {
        vs.reproduce();
    }
}
