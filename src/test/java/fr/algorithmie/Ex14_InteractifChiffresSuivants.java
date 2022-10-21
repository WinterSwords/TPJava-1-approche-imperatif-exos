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
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifChiffresSuivants")
public class Ex14_InteractifChiffresSuivants {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		// Le scanner permet d'interroger l'utilisateur.
		// Sur Spring Tool Suite vous devez saisir directement dans la Console.
		Scanner scanner = new Scanner(System.in) ;
		
		// Affichage d'un message
		System.out.println("Veuillez saisir un nombre : ");
		
		// Attente d'une saisie par l'utilisateur
		int nb = scanner.nextInt();
		
		// TODO Ecrire un algo qui demande un nombre à l’utilisateur 
		// puis qui LOGUE les 10 nombres suivants. 
		// Par exemple si l’utilisateur saisit 5, le programme LOGUE 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.
		
		for(int i=nb+1;i<nb+11;i++) {
			Resultat.log(i);
		}
		
		scanner.close();
	}
}