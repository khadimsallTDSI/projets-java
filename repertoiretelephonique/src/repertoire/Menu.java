package repertoire;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener {
	JButton bRechercher;
	JButton bAjouter;
	JButton bModifier;
	JButton bQuitter;
	JButton bSupprimer;
	Repertoire rep = new Repertoire("Repertoire");

	public Menu() {
		JFrame f = new JFrame("Repertoire");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();

		// Modifier l'ic�ne de JFrame
		Image img = kit.getImage("image//rep2.jpg");
		f.setIconImage(img);
		f.setSize(630, 400);
		f.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		f.setContentPane(panel);
		panel.setLayout(null);
		String url = "image//rep2.jpg";
		ImageIcon icone = new ImageIcon(url);
		JLabel background = new JLabel("", icone, JLabel.CENTER);
		background.setBounds(0, 0, 600, 640);
		panel.add(background);

		JMenuBar menu = new JMenuBar();
		panel.add(menu);
		menu.setBounds(0, 0, 630, 80);
		bAjouter = new JButton("Ajouter Contact");
		bAjouter.setForeground(Color.white);
		bAjouter.setBackground(Color.green);
		//bAjouter.setSize(100,50);
		menu.add(bAjouter);
		bAjouter.addActionListener((ActionListener) this);
		bRechercher = new JButton("Rechercher Contact");
		menu.add(bRechercher);
		bRechercher.setForeground(Color.white);
		bRechercher.setBackground(Color.orange);
		bRechercher.addActionListener((ActionListener) this);
		bModifier = new JButton("Modifier Contact");
		menu.add(bModifier);
		bModifier.setForeground(Color.white);
		bModifier.setBackground(Color.orange);
		bModifier.addActionListener((ActionListener) this);
		bSupprimer = new JButton("Supprimer Contact");
		menu.add(bSupprimer);
		bSupprimer.addActionListener((ActionListener) this);
		bSupprimer.setForeground(Color.white);
		bSupprimer.setBackground(Color.red);
		bQuitter = new JButton("Quitter");
		menu.add(bQuitter);
		bQuitter.setForeground(Color.white);
		bQuitter.setBackground(Color.orange);
		bQuitter.addActionListener((ActionListener) this);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bAjouter) {
			rep.ajouter();
		}
		if (e.getSource() == bSupprimer) {
			rep.supprimer();
		}
		if (e.getSource() == bRechercher) {
			rep.visualiser();
		}
		if (e.getSource() == bQuitter) {
			System.exit(0);
		}
		if (e.getSource() == bModifier) {
			rep.modifier();
		}

	}
}
