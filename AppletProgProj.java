import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletProgProj extends Applet{

   public void paint(Graphics g){
     
    Color c[]={Color.blue,Color.cyan,Color.orange,Color.gray};
  }

  String msg[] ={"Welcome","To","CSE","Department"};
  for(int i=0;i<c.length;i++){
   g.setColor(c[i]);
   g.drawString(msg[i],10,10 + (i*10));
   }
 }

} 