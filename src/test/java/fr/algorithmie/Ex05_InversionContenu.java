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
@Exercice(nom="InversionContenu")
public class Ex05_InversionContenu {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageTableauArrayCopy() {
		// TODO Créer un tableau nommé arrayCopy et qui contient les mêmes nombres
		// que dans le tableau array mais dans l'ordre inverse. 
		// Pour être plus précis, arrayCopy commence par les nombres suivants : -4, 14, 0, etc..
		
		int[] arrayCopy = new int[array.length];
		int j=0;
		for(int i=array.length-1; i>=0; i--) {
			arrayCopy[i]=array[j++];
		}
		
		// TODO LOGUER le contenu de ce tableau arrayCopy
		for(int i=0; i<arrayCopy.length; i++) {
			Resultat.log(arrayCopy[i]);
		}
	}
}
