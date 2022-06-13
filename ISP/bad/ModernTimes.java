package ISP.bad;

public class ModernTimes implements Movie {

    public void play() {
    }

    public void increaseVolume() {
        // this movie has not audio
        throw new NullPointerException();
    }
    
}
