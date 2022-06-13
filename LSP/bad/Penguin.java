package LSP.bad;

public class Penguin extends Bird {
    
    @Override
    public void fly() {
        throw new NullPointerException();
    }
}
