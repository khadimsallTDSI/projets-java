package repertoire;

import java.util.*;
import java.util.List;

import com.mysql.jdbc.Connection;
import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Repertoire extends JFrame implements ActionListener, MouseListener {
	private ArrayList tableau;
	Scanner sc = new Scanner(System.in);
	String texte;// age du contact
	// static String nom,prenom,adresse,telephone,email;
	// static int age;
	static int compt = 0;

	public Repertoire(String titre) {
		super(titre);
		// tableau=new ArrayList ();
	}

	Container c = this.getContentPane();
	public JPanel panelSud;
	public JPanel panelNord;
	public JLabel lnom, lprenom, ltelephone, lemail, ladresse;
	JTextField txtNom;
	JTextField txtPrenom;
	JTextField txtAdresse;
	JTextField txtEmail;
	JTextField txtTelephone;
	JButton bAjouter, bAnnuler, bFermer;

	// Fonction Ajouter,qui nous permet d'entrer les infos sur l'individu saisies au
	// clavier
	public void ajouter() {
		// instanciation du Scanner
		JFrame f = new JFrame();
		panelNord = new JPanel();
		panelNord.setBackground(Color.ORANGE);
		panelNord.setLayout(new GridLayout(5, 2));
		lnom = new JLabel("Nom:");
		Toolkit kit = Toolkit.getDefaultToolkit();

		// Modifier l'ic�ne de JFrame
		Image img = kit.getImage("image//rep2.jpg");
		f.setIconImage(img);
		panelNord.add(lnom);
		txtNom = new JTextField(10);
		panelNord.add(txtNom);
		lprenom = new JLabel("Prenom:");
		panelNord.add(lprenom);
		txtPrenom = new JTextField(10);
		panelNord.add(txtPrenom);
		ladresse = new JLabel("Adresse:");
		panelNord.add(ladresse);
		txtAdresse = new JTextField(10);
		panelNord.add(txtAdresse);
		ltelephone = new JLabel("Telephone:");
		panelNord.add(ltelephone);
		txtTelephone = new JTextField(10);
		panelNord.add(txtTelephone);
		lemail = new JLabel("Email:");
		panelNord.add(lemail);
		txtEmail = new JTextField(10);
		panelNord.add(txtEmail);
		c.add(panelNord, BorderLayout.NORTH);
		panelSud = new JPanel();
		panelSud.setBackground(Color.orange);
		bAjouter = new JButton("Ajouter");
		panelSud.add(bAjouter);
		bAjouter.addActionListener(this);
		bAnnuler = new JButton("Annuler");
		panelSud.add(bAnnuler);
		bAnnuler.addActionListener(this);
		bFermer = new JButton("Fermer");
		bFermer.addActionListener(this);
		panelSud.add(bFermer);

		c.add(panelSud, BorderLayout.SOUTH);
		c.setSize(630, 600);
		f.add(c, BorderLayout.CENTER);
		f.setSize(330, 250);
		f.setLocation(400, 180);
		// f.pack();
		f.setVisible(true);

	}

	public void inserer() {
		String nom = txtNom.getText();
		String prenom = txtPrenom.getText();
		String adresse = txtAdresse.getText();
		String telephone = txtTelephone.getText();
		String email = txtEmail.getText();
		// String age = txtAge.getText();
		// Informations d'acces a la base de donnees
		String url = "jdbc:mysql://localhost/maBDjava";
		String login = "root";
		String passwd = "";
		// la classe Connexion R�alise la connexion et l'authentification � la base de
		// donn�es.
		Connection cn = null;
		Statement st = null;
		try {
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// la classe DriverManager Charge et configure le driver de la base de donn�es.
			// Etape2: REcuperation de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			// Etape3 :Creation d'un Statement
			// Contenir la requ�te SQL et la transmettre � la base de donn�es.
			st = (Statement) cn.createStatement();
			String sql = "INSERT INTO `reperoire` (`nom`,`prenom`,`adresse`,`telephone`,`email`) " + "VALUES ('" + nom
					+ "','" + prenom + "','" + adresse + "','" + telephone + "','" + email + "')";
			// Etape 4: Execution requete
			st.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

		}

	}

	public void visualiser() {
		// Informations d'acces a la base de donnees
		String url = "jdbc:mysql://localhost/maBDjava";
		String login = "root";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		String message = "Entrez l' email du contact dont  vous voulez rechercher: ";
		String email;
		email = JOptionPane.showInputDialog(null, message);
		try {
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape2: REcuperation de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			// Etape3 :Creation d'un Statement
			st = (Statement) cn.createStatement();
			String sql = "SELECT * FROM reperoire where email='" + email + "'";
			// Etape 4: Execution de la requete
			rs = st.executeQuery(sql);
			// Etape 5: Parcours Resultset

			while (rs.next()) {
				JFrame f = new JFrame();
				// Les donn�es du tableau
				Container c = this.getContentPane();
				c.setLayout(new GridLayout(5, 1));
				JLabel l1 = new JLabel("Prenom:");
				c.add(l1);
				JLabel l2 = new JLabel(rs.getString("prenom"));
				c.add(l2);
				JLabel l3 = new JLabel("Nom:");
				c.add(l3);
				JLabel l4 = new JLabel(rs.getString("nom"));
				c.add(l4);
				JLabel l5 = new JLabel("Adresse:");
				c.add(l5);
				JLabel l6 = new JLabel(rs.getString("adresse"));
				c.add(l6);
				JLabel l7 = new JLabel("Telephone:");
				c.add(l7);
				JLabel l = new JLabel(rs.getString("telephone"));
				c.add(l);
				JLabel l8 = new JLabel("Email:");
				c.add(l8);
				JLabel l9 = new JLabel(rs.getString("email"));
				c.add(l9);
				JPanel p = new JPanel();
				p.add(c, BorderLayout.CENTER);
				compt++;
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setTitle("IL ya " + compt + " contact(s) correspondant");
				f.setSize(300, 120);
				Toolkit kit = Toolkit.getDefaultToolkit();

				// Modifier l'ic�ne de JFrame
				Image img = kit.getImage("image\\rep2.jpg");
				f.setIconImage(img);
				// Nous ajoutons notre tableau � notre contentPane dans un scroll
				// Sinon les titres des colonnes ne s'afficheront pas !
				f.add(p);
				f.setVisible(true);
			}
			System.out.println("\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		// System.out.println("IL ya " + compt + " contact(s)");
	}

	public void modifier() {
		String message5 = "Entrez l'email du contact ";
		String email;
		email = JOptionPane.showInputDialog(null, message5);
		String message1 = "Entrez le prenom du contact ";
		String prenom;
		prenom = JOptionPane.showInputDialog(null, message1);
		String message2 = "Entrez le nom du contact ";
		String nom;
		nom = JOptionPane.showInputDialog(null, message2);
		String message3 = "Entrez l'adresse du contact ";
		String adresse;
		adresse = JOptionPane.showInputDialog(null, message3);
		String message4 = "Entrez le numero de telephone";
		String telephone;
		telephone = JOptionPane.showInputDialog(null, message4);
		// Informations d'acces a la base de donnees
		String url = "jdbc:mysql://localhost/maBDjava";
		String login = "root";
		String passwd = "";
		// la classe Connexion R�alise la connexion et l'authentification � la base de
		// donn�es.
		Connection cn = null;
		Statement st = null;
		int rs = 0;
		try {
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// la classe DriverManager Charge et configure le driver de la base de donn�es.
			// Etape2: REcuperation de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			// Etape3 :Creation d'un Statement
			// Contenir la requ�te SQL et la transmettre � la base de donn�es.
			st = (Statement) cn.createStatement();
			String sql = "UPDATE `reperoire` SET " + "nom='" + nom + "',prenom='" + prenom + "',adresse='" + adresse
					+ "',telephone='" + telephone + "'where email='" + email + "'";
			rs = st.executeUpdate(sql);
			if (rs != 0) {

				JOptionPane.showMessageDialog(null, "Modification reussie");
			} else {
				JOptionPane.showMessageDialog(null, "Pas de contact correspondant !");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

		}

	}

	public void supprimer() {
		// String email = txtAdresse.getText();
		String url = "jdbc:mysql://localhost/maBDjava";
		String login = "root";
		String passwd = "";

		// la classe Connexion R�alise la connexion et l'authentification � la base de
		// donn�es.
		Connection cn = null;
		Statement st = null;
		int rs = 0;
		String message = "Entrez l' email dont vous voulez supprimer le contact: ";
		String email;
		email = JOptionPane.showInputDialog(null, message);
		try {
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// la classe DriverManager Charge et configure le driver de la base de donn�es.
			// Etape2: REcuperation de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			// Etape3 :Creation d'un Statement
			// Contenir la requ�te SQL et la transmettre � la base de donn�es.
			st = (Statement) cn.createStatement();
			String sql = "DELETE  FROM `reperoire`  where email='" + email + "'";
			// Etape 4: Execution requete
			rs = st.executeUpdate(sql);
			if (rs != 0) {

				JOptionPane.showMessageDialog(null, "Suppression reussi");
			} else {
				JOptionPane.showMessageDialog(null, "Pas de contact correspondant !");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

		}

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

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

	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() == bAjouter) {

			// JButton bouton = new JButton("Voir la question");
			JLabel label = new JLabel(" ");

			// add(bAjouter, BorderLayout.NORTH);
			add(label, BorderLayout.SOUTH);
			bAjouter.addActionListener(this);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocation(100, 100);
			pack();
			setVisible(true);

			int reponse = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment ajouter ce contact ?", "???",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (reponse == JOptionPane.YES_OPTION) {
				label.setText("Insertion reussi !");
				inserer();
				JOptionPane.showMessageDialog(null, "Insertion reussi !");
			} else if (reponse == JOptionPane.NO_OPTION) {
				label.setText("Annuler!");
				JOptionPane.showMessageDialog(null, "Vous avez annul� l'insertion  !");
				this.dispose();
			} else {
				label.setText("ni l'un ni l'autre ?");
				System.exit(0);
			}

			// f.setVisible(true);
		} else if (ev.getSource() == bFermer) {
			// System.exit(0);
			// visualiser();
			System.exit(0);

		}

	}
}