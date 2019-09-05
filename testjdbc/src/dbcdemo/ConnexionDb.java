package dbcdemo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.*;

public class ConnexionDb {
	public static void inserer(String nom, String prenom, int age) {
		// Informations d'acces a la base de donnees
		String url = "jdbc:mysql://localhost/maBDjava";
		String login = "root";
		String passwd = "";
		//la classe Connexion Réalise la connexion et l'authentification à la base de données.
		Connection cn = null;
		Statement st = null;
		try {
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			//la classe DriverManager Charge et configure le driver de la base de données.
			// Etape2: REcuperation de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			// Etape3 :Creation d'un Statement
			//Contenir la requête SQL et la transmettre à la base de données.
			st = (Statement) cn.createStatement();
			String sql = "INSERT INTO `personne` (`nom`,`prenom`,`age`) VALUES ('" + nom + "','" + prenom + "','" + age
					+ "')";
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

	public static void visualiser() {
		// Informations d'acces a la base de donnees
		String url = "jdbc:mysql://localhost/maBDjava";
		String login = "root";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs=null;
		
		try {
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape2: REcuperation de la connexion
			cn = (Connection) DriverManager.getConnection(url, login, passwd);
			// Etape3 :Creation d'un Statement
			st = (Statement) cn.createStatement();
			String sql = "SELECT * FROM personne";
			// Etape 4: Execution de la  requete
			rs=st.executeQuery(sql);
			//Etape 5: Parcours Resultset
         while(rs.next()) {
        	 System.out.println("Prenom: "+rs.getString("prenom"));
        	 System.out.println("nom: "+rs.getString("nom"));
        	 System.out.println("Age: "+rs.getInt("age"));
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

	public static void main(String[] args) {
		inserer("sall", "khadim", 24);
		visualiser();

	}

}
