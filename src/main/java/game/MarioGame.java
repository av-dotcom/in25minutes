package game;

public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Duck");
    }

    public void left() {
        System.out.println("Move left");
    }

    public void right() {
        System.out.println("Move right");
    }
}
