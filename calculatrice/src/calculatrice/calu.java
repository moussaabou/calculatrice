package calculatrice;


	import javax.swing.*;
	import java.awt.GridLayout;
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
	 public class calu {
		 JButton bouton0 = new JButton("0");
		 JButton bouton1 = new JButton("1");
		 JButton bouton2 = new JButton("2");
		 JButton bouton3 = new JButton("3");
		 JButton bouton4 = new JButton("4");
		 JButton bouton5 = new JButton("5");
		 JButton bouton6 = new JButton("6");
		 JButton bouton7 = new JButton("7");
		 JButton bouton8 = new JButton("8");
		 JButton bouton9 = new JButton("9");
		 JButton boutonVirgule = new JButton(",");
		 JButton boutonEgale = new JButton("=");
		 JButton boutonPlus = new JButton("+");
		 JButton boutonMoins = new JButton("-");
		 JButton boutonDiviser = new JButton("/");
		 JButton boutonMultiplier = new JButton("*");
		 JPanel contenuFen�tre = new JPanel();
		 JTextField champAffichage = new JTextField(30);
	 calu() {
		 BorderLayout disposition = new BorderLayout();
		 contenuFen�tre.setLayout(disposition);

		 // Ajoute le champ d'affichage en haut de la fen�tre
		 contenuFen�tre.add("North", champAffichage);

		 // Cr�e le panneau avec le quadrillage qui contient
		 // 12 boutons � les 10 boutons num�riques et ceux
		 // repr�sentant la virgule et le signe �gale

		 JPanel panneauChiffres = new JPanel();
		 GridLayout dispositionChiffres = new GridLayout(4, 3);
		 panneauChiffres.setLayout(dispositionChiffres);

		 panneauChiffres.add(bouton1);
		 panneauChiffres.add(bouton2);
		 panneauChiffres.add(bouton3);
		 panneauChiffres.add(bouton4);
		 panneauChiffres.add(bouton5);
		 panneauChiffres.add(bouton6);
		 panneauChiffres.add(bouton7);
		 panneauChiffres.add(bouton8);
		 panneauChiffres.add(bouton9);
		 panneauChiffres.add(bouton0);
		 panneauChiffres.add(boutonVirgule);
		 panneauChiffres.add(boutonEgale);
		 contenuFen�tre.add("Center", panneauChiffres);

		 // Cr�e le panneau avec le quadrillage qui contient 4
		 // boutons d'op�ration � Plus, Moins, Diviser, Multiplier
		 JPanel panneauOp�rations = new JPanel();
		 GridLayout dispositionOp�rations = new GridLayout(4, 1);
		 panneauOp�rations.setLayout(dispositionOp�rations);
		 panneauOp�rations.add(boutonPlus);
		 panneauOp�rations.add(boutonMoins);
		 panneauOp�rations.add(boutonMultiplier);
		 panneauOp�rations.add(boutonDiviser);
		// Ajoute le panneau des op�rations � la zone est
		 // de la fen�tre
		 contenuFen�tre.add("East", panneauOp�rations);

		 // Cr�e le cadre et lui affecte son contenu
		 JFrame frame = new JFrame("Calculatrice");
		 frame.setContentPane(contenuFen�tre);

		 // Affecte � la fen�tre des dimensions suffisantes pour
		 // prendre en compte tous les contr�les
		 frame.pack();

		 // Affiche la fen�tre
		 frame.setVisible(true);

		 // Instancie le r�cepteur d'�v�nements et l'enregistre
		 // aupr�s de chaque bouton
		 MoteurCalcul moteurCalcul = new MoteurCalcul(this);

		 bouton0.addActionListener(moteurCalcul);
		 bouton1.addActionListener(moteurCalcul);
		 bouton2.addActionListener(moteurCalcul);
		 bouton3.addActionListener(moteurCalcul);
		 bouton4.addActionListener(moteurCalcul);
		 bouton5.addActionListener(moteurCalcul);
		 bouton6.addActionListener(moteurCalcul);
		 bouton7.addActionListener(moteurCalcul);
		 bouton8.addActionListener(moteurCalcul);
		 bouton9.addActionListener(moteurCalcul);
		 boutonVirgule.addActionListener(moteurCalcul);
		 boutonPlus.addActionListener(moteurCalcul);
		 boutonMoins.addActionListener(moteurCalcul);
		 boutonDiviser.addActionListener(moteurCalcul);
		 boutonMultiplier.addActionListener(moteurCalcul);
		 boutonEgale.addActionListener(moteurCalcul);
		 
		 //style sur button
		 
		 bouton0.setBackground(Color.black);
		 bouton1.setBackground(Color.black);
		 bouton2.setBackground(Color.black);
		 bouton3.setBackground(Color.black);
		 bouton4.setBackground(Color.black);
		 bouton5.setBackground(Color.black);
		 bouton6.setBackground(Color.black);
		 bouton7.setBackground(Color.black);
		 bouton8.setBackground(Color.black);
		 bouton9.setBackground(Color.black);
		 
		 boutonVirgule.setBackground(Color.gray);
		 boutonPlus.setBackground(Color.gray);
		 boutonMoins.setBackground(Color.gray);
		 boutonDiviser.setBackground(Color.gray);
		 boutonMultiplier.setBackground(Color.gray);
		 boutonEgale.setBackground(Color.orange);
		 champAffichage.setBackground(Color.gray);
		 
		 //style sur later
		 bouton0.setForeground(Color.white);  
		 bouton1.setForeground(Color.white);  
		 bouton2.setForeground(Color.white);  
		 bouton3.setForeground(Color.white);  
		 bouton4.setForeground(Color.white);  
		 bouton5.setForeground(Color.white);  
		 bouton6.setForeground(Color.white);  
		 bouton7.setForeground(Color.white);  
		 bouton8.setForeground(Color.white);  
		 bouton9.setForeground(Color.white);  
		 champAffichage.setForeground(Color.white); 
}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calu a = new calu();
		

	}

}
