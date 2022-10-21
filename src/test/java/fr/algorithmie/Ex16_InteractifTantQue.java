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
@Exercice(nom = "InteractifTantQue")
public class Ex16_InteractifTantQue {

	/**
	 * Ne pas modifier les informations portées par l'annotation.
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {

		Scanner scanner = new Scanner(System.in);

		// TODO Tant que le nombre saisi par l'utilisateur n'est pas compris
		// entre 1 et 10 inclus l'application continue à demander un nombre à
		// l'utilisateur.
		// Si ce nombre est compris entre 1 et 10, l'application LOGUE le résultat
		// et s'arrête.
		int nb = 0;
		do {
			System.out.println("Entrez un nombre entre 1 et 10 :");
			nb = scanner.nextInt();
		} while (nb < 1 || nb > 10);
		Resultat.log(nb);
		scanner.close();
	}
}