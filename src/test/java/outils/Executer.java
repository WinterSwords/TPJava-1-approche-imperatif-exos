package outils;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import fr.algorithmie.Ex01_AffichageIdentite;
import fr.algorithmie.Ex02_AffichagePartiel;
import fr.algorithmie.Ex03_AffichageTableau;
import fr.algorithmie.Ex05_InversionContenu;

public class Executer {
	
	private static List<Class<?>> classes = Arrays.asList(Ex01_AffichageIdentite.class, 
			Ex03_AffichageTableau.class, Ex05_InversionContenu.class, Ex02_AffichagePartiel.class);

	public static void main(String[] args) {
		Computer computer = new Computer();

		int runCount = 0;
		int goodAnswers = 0;
		
		JUnitCore jUnitCore = new JUnitCore();
		
		for (Class<?> classe: classes) {
			Result res = jUnitCore.run(computer, classe);
			System.out.println("Exercice : "+classe.getSimpleName());
			System.out.println("\tNombre de questions :"+res.getRunCount());
			
			runCount+=res.getRunCount();
			goodAnswers+=res.getRunCount()-res.getFailureCount();
			System.out.println("\tNombre de bonnes réponses :"+goodAnswers);
		}
		System.out.println("-----------------------------------");
		System.out.println("Note:"+(((double)goodAnswers)/((double)runCount)*20.0));
	}
}
