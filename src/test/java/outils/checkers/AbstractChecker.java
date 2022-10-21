package outils.checkers;

import static org.junit.Assert.fail;

import java.util.List;

import outils.Resultat;

public class AbstractChecker {

	protected final List<String> commonChecks() {
		if (Resultat.getLogs().size()==0) {
			fail("Votre méthode n'affiche pas de résultat. Vauillez utiliser Resultat.log(value) pour afficher value.");
		}
		return Resultat.getLogs();
	}

	public String getJeuTest() {
		return null;
	}
}
