package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="AffichageTableau")
public class Ex03_AffichageTableau {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageTableau() {
		//TODO LOGUER les éléments du tableau grâce à une boucle
		for(int i=0; i<array.length; i++) {
			Resultat.log(array[i]);
		}
	}
	
	@Test
	@Question(numero=2)
	public void affichageTableauOrdreInverse() {
		//TODO LOGUER les éléments du tableau dans l'ordre inverse
		for(int i=array.length-1; i>=0; i--) {
			Resultat.log(array[i]);
		}
	}
}
