
class car {
    private engine eng;
    public car(engine eng) {
        this.eng = eng;
    }
    public void start() {
        eng.start();
    }
}

class engine{  //dependacy injection
    public void start() {
        System.out.println("Engine starts");
    }
}

public class oops1 {

    public static void main(String[] args) {
        
        engine e = new engine();
        car c = new car(e);
        c.start();
    }
}
