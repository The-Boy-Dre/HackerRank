
import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Dimension;

public class window extends Canvas {

  private static final long serialVersionUID = 1642574543L;
  
  public window(int width, int height, String title){
      JFrame frame = new JFrame(title);

      Game game = new Game();

      frame.setPreferredSize(new Dimension(width,height));
      frame.setMaximumSize(new Dimension(width,height));
      frame.setMinimumSize(new Dimension(width,height));

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      frame.setLocation(null);
      frame.add(game);
      frame.setVisible(true);
      Game.start();

  } 

}
