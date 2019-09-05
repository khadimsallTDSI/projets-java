package graphiaque;

import java.awt.*;
import javax.swing.*;


public class Fenetre0 {

	public static void main(String[] args) {
		//new JFrame().setVisible(true);
      JFrame f1=new  JFrame();
      f1.setTitle("Ma fenetre");
      f1.setLocation(300, 600);
     // f1.setSize(200, 400);
     // f1.setLayout(new BorderLayout());
      JButton bNord=new JButton("Nord");
      f1.add(bNord,BorderLayout.NORTH);
      f1.add(new JButton("Sud"),BorderLayout.SOUTH);
      JButton bOuest=new JButton("Ouest");
      f1.add(bOuest,BorderLayout.WEST);
      JButton bEst=new JButton("Est");
      f1.add(bEst,BorderLayout.EAST);
      JPanel panelSud=new JPanel();
     // panelSud.setBackground(new Color(100,200,110));
      panelSud.setBackground(Color.CYAN);
     // panelSud.setLayout(new BorderLayout());
      JButton bCentre=new JButton("Centre");
      panelSud.add(bCentre,BorderLayout.EAST);
      
      JButton bCentre2=new JButton("Centre2");
      panelSud.add(bCentre2,BorderLayout.WEST);
      f1.add(panelSud);
      
      
      
      
      
      
      
      f1.pack();
      f1.setVisible(true);
     
//      JFrame f2=new  JFrame();
//      f2.setVisible(true);
     ;
	}

}
