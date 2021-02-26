


import java.awt.Canvas;
public class Game extends Canvas implements Runnable{
  
  private static final long serialVersionUID = 2134142134L;
  public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

  public Game(){
    new Window(WIDTH, HEIGHT, "Let's Build a Game!", this);
  }

  public synchronized static void start(){

  }

  public synchronized void run(){

  }

  public static void main(String[] args) {
    
    new Game();

  }
}
