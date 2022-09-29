import java.applet.Applet;
import java.awt.*;

public class HelloDemo extends Applet{

public void paint(Graphics g){
g.drawString("Hello Java",250,150);
showStatus("Welcome page here");
}
}