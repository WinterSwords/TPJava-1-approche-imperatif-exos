package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Resultat;
import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="AffichageIdentite")
public class Ex01_AffichageIdentite {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero=1)
	public void main() {
		//TODO Utiliser une boucle pour afficher (avec Resultat.log) 10 fois un texte quelconque
		
		// TODO Exemple : 
		for (int i=1; i<=10; i++) {
			Resultat.log("Coucou");
		}
	}
}