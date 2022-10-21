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
@Exercice(nom="CalculMoyenne")
public class Ex08_CalculMoyenne {
	
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void calculMoyenne() {
		//TODO Calculez et LOGUEZ la moyenne des valeurs du tableau (la moyenne doit être une valeur décimale).
		double cumul=0;
		int i;
		for(i=0;i<array.length;i++) {
			cumul+=array[i];
		}
		Resultat.log(cumul/i);
		
	}
	
	@Test
	@Question(numero=2)
	public void calculMoyenneValeursPositives() {
		//TODO Calculez et LOGUEZ la moyenne des valeurs POSITIVES du tableau
		double cumul=0;
		int i, a=0;
		for(i=0;i<array.length;i++) {
			if(array[i]>=0) {
				cumul+=array[i];
				a++;
				System.out.println(a);
			}
		}
		Resultat.log(cumul/a);
	}
}