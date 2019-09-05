package graphiaque;

import javax.swing.*;
import java.awt.*;
public class TestGridLayout {

	public static void main(String[] args) {
		JFrame f=new JFrame("GridLayout");
		JMenuBar jmb =new JMenuBar();
		f.setJMenuBar(jmb);
		//f.add(jmb);
		JMenu mFile=new JMenu("File");
		JMenu mNew=new JMenu("New");
		mFile.add(mNew);
		
		JMenuItem mProject=new JMenuItem("Project");
		mNew.add(mProject);
		JMenuItem mPackage=new JMenuItem("Package");
		mNew.add(mPackage);
		
		
		JMenuItem mOpenFile=new JMenuItem("Open File");
		mFile.add( mOpenFile);
		JMenuItem mExit=new JMenuItem("Exit");
		mFile.add(mExit);
		jmb.add(mFile);
		JMenu mEdit=new JMenu("Edit");
		jmb.add(mEdit);
		jmb.add(new JMenu("Source"));
		Container c =f.getContentPane();
		c.setLayout(new GridLayout(2, 3));
		JLabel l1=new JLabel("1");
		c.add(l1);
		JLabel l2=new JLabel("2");
		c.add(l2);
		JLabel l3=new JLabel("3");
		c.add(l3);
		JLabel l4=new JLabel("4");
		c.add(l4);
		JLabel l5=new JLabel("5");
		c.add(l5);
		JLabel l7=new JLabel("7");
		c.add(l7);
		
		
		
		
		
		
		
		f.pack();
		f.setVisible(true);

	}

}
