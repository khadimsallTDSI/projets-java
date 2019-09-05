package graphiaque;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class FenetreProject extends JFrame implements ActionListener,MouseListener{
	JButton bFermer;
	JPanel panelSud;
	JPanel panelNord;
	Container c;
	private JButton bOk;
	private JButton bAnnuler;
	public FenetreProject(String titre) {
		this.setTitle(titre);
		 c=this.getContentPane();
		 panelNord=new JPanel();
		panelNord.setBackground(Color.ORANGE);
		panelNord.setLayout(new GridLayout(5,2));
		JLabel lNom=new JLabel("Nom:");
		panelNord.add(lNom);
		JTextField txtNom=new JTextField(10);
		panelNord.add(txtNom);
		JLabel lLogin=new JLabel("Login:");
		panelNord.add(lLogin);
		JTextField txtLogin=new JTextField(10);
		panelNord.add(txtLogin);
		JLabel lPasword=new JLabel("Password:");
		panelNord.add(lPasword);
		JPasswordField txtPassword=new JPasswordField(10);
		panelNord.add(txtPassword);
		JLabel lSexe=new JLabel("Sexe:");
		panelNord.add(lSexe);
		JPanel panelSexe=new JPanel();
		JRadioButton rbM=new JRadioButton("M");
		JRadioButton rbF=new JRadioButton("F");
		panelSexe.add(rbF);
		panelSexe.add(rbM);
		panelNord.add(panelSexe);
		JLabel lNationalite=new JLabel("Nationalite:");
		panelNord.add(lNationalite);
		String[] nationalite= {"Sen","Gamb","Guin","Mal","Nig"};
		JComboBox cbNationalite=new JComboBox(nationalite);
		panelNord.add(cbNationalite);
		panelNord.addMouseListener(this);
		
		c.add(panelNord,BorderLayout.NORTH);
		
       panelSud=new JPanel();
       panelSud.setBackground(Color.orange);
       bOk=new JButton("OK");
       panelSud.add(bOk);
       bOk.addActionListener(this);
       bAnnuler=new JButton("Annuler");
       panelSud.add(bAnnuler);
       bFermer=new JButton("Fermer");
       bFermer.addActionListener(this);
       panelSud.add(bFermer);
       
	   c.add(panelSud,BorderLayout.SOUTH);
	   
	   this.pack();
	   this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		//if(ev.getSource()==bFer)
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if(ev.getSource()==bOk) {
			this.dispose();
			JFrame f=new JFrame("Nouveau");
			f.setSize(200,300);
			f.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					System.out.println(arg0.getX()+" "+arg0.getY());
					
				}
			});
			f.setVisible(true);
		}
		else if(ev.getSource()==bFermer) {
			System.exit(0);
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("clic sur Panel nord "+arg0.getX()+" "+arg0.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
