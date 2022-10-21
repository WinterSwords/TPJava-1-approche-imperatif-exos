package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="SommeDeTableaux")
public class Ex09_SommeDeTableaux {

	int[] tab1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	int[] tab2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };

	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero = 1)
	public void calculSomme() {

		// TODO Créer un tableau somme de même taille que les tableaux précédents et
		// dont chaque case d’index i contient la somme arithmétique des cases d’index i
		// des tableaux 1 et 2.
		// Exemple : somme[i]=tab1[i]+tab2[i]
		int [] somme = new int [tab1.length];
		for(int i=0;i<tab1.length;i++) {
			somme[i]=tab1[i]+tab2[i];
			Resultat.log(somme[i]);
		}
	}
}