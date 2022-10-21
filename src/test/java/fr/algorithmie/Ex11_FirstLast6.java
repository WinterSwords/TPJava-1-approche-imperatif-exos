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
@Exercice(nom="FirstLast6")
public class Ex11_FirstLast6 {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {
		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		//  o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		//  o elle vaut false dans les autres cas
		
		// TODO LOGUEZ la valeur obtenue pour chacun des 6 tableaux tab1 à tab6
		Resultat.log(test(tab1));
		Resultat.log(test(tab2));
		Resultat.log(test(tab3));
		Resultat.log(test(tab4));
		Resultat.log(test(tab5));
		Resultat.log(test(tab6));
	}
	boolean test(int[] tab) {
		if(tab.length>0 && (tab[0]==6||tab[tab.length-1]==6)) {
			return true;
		}
        return false;
    }
}