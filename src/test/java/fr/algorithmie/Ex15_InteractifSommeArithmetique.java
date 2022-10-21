package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifSommeArithmetique")
public class Ex15_InteractifSommeArithmetique {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demandez un nombre à l'utilisateur puis LOGUEZ ce nombre 
		// avec Resultat.log
		
		System.out.println("Veuillez saisir un nombre : ");
		int nb = scanner.nextInt();
		
		// TODO LOGUEZ avec Resultat.log la somme de 1 à ce nombre inclus
		Resultat.log(nb);
		Resultat.log((nb+1)*nb/2);
		
		scanner.close();
	}
}