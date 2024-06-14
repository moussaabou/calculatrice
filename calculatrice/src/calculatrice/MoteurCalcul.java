package calculatrice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.text.ParsePosition;
import javax.swing.JButton;

public class MoteurCalcul implements ActionListener {
	calu parent; // une r�f�rence � la Calculatrice
	 char actionS�lectionn�e = ' '; // +, -, /, ou *

	 double r�sultatCourant = 0;
	 NumberFormat formatNombres = NumberFormat.getInstance();
	// un objet capable de lire et pr�senter les nombres

	 // Le constructeur stocke la r�f�rence � la fen�tre
	 // Calculatrice dans la variable membre parent
	 MoteurCalcul(calu parent) {
	 this.parent = parent;
	 }

	 public void actionPerformed(ActionEvent �v�nement) {

	 // Retrouve la source de l'action
	 JButton boutonCliqu� = (JButton) �v�nement.getSource();
	 String texteChampAffichage =
	 parent.champAffichage.getText();
	 double valeurAffich�e = 0;
	 // Retrouve le nombre pr�sent� dans le champ texte
	 // s'il n'est pas vide
	 if (!"".equals(texteChampAffichage)) {
	 valeurAffich�e =
	 // analyse la cha�ne de caract�res
	 formatNombres.parse(
	 texteChampAffichage,
	 new ParsePosition(0) /* ne sert pas */).
	 // puis donne sa valeur en tant que double
	 doubleValue();
	 }
	 Object sourceEv�nement = �v�nement.getSource();
	 // Pour chaque bouton d'action, m�morise l'action
	 // s�lectionn�e, +, -, /, ou *, stocke la valeur courante
	 // dans la variable r�sultatCourant et vide le champ
	 // Affichage avant l'entr�e du nombre suivant
	 if (sourceEv�nement == parent.boutonPlus) {
		 actionS�lectionn�e = '+';
		 r�sultatCourant = valeurAffich�e;
		 parent.champAffichage.setText("");
		 }
		 else if (sourceEv�nement == parent.boutonMoins) {
		 actionS�lectionn�e = '-';
		 r�sultatCourant = valeurAffich�e;
		 parent.champAffichage.setText("");
		 }
		 else if (sourceEv�nement == parent.boutonDiviser) {
		 actionS�lectionn�e = '/';
		 r�sultatCourant = valeurAffich�e;
		 parent.champAffichage.setText("");
		 }
		 else if (sourceEv�nement == parent.boutonMultiplier) {
		 actionS�lectionn�e = '*';
		 r�sultatCourant = valeurAffich�e;
		 parent.champAffichage.setText("");
		 }
		 else if (sourceEv�nement == parent.boutonEgale) {
		 // Effectue les calculs en fonction de actionS�lectionn�e
		 // Modifie la valeur de la variable r�sultatCourant
		 // et affiche le r�sultat
		 if (actionS�lectionn�e == '+') {
		 r�sultatCourant += valeurAffich�e;
		 // Convertit le r�sultat en le transformant en String
		 // � l'aide de formatNombres
		 parent.champAffichage.setText(
		 formatNombres.format(r�sultatCourant));
		 }
		 else if (actionS�lectionn�e == '-') {
		 r�sultatCourant -= valeurAffich�e;
		 parent.champAffichage.setText(
		 formatNombres.format(r�sultatCourant));
		 }
		 else if (actionS�lectionn�e == '/') {
		 r�sultatCourant /= valeurAffich�e;
		 parent.champAffichage.setText(
		 formatNombres.format(r�sultatCourant));
		 }
		 else if (actionS�lectionn�e == '*') {
		 r�sultatCourant *= valeurAffich�e;
		 parent.champAffichage.setText(
		 formatNombres.format(r�sultatCourant));
		 }
		 }
		 else {
		// Pour tous les boutons num�riques, ajoute le libell�
		// du bouton au champ texte
		 String libell�BoutonCliqu� = boutonCliqu�.getText();
		 parent.champAffichage.setText(texteChampAffichage +
		 libell�BoutonCliqu�);
		 }
		 }
}


