package outils.checkers;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RechercheMaxChecker extends AbstractChecker {

	public void check1(Map<String, Object> fieldValues) {
		List<String> lignes = commonChecks();
		
		int[] array = (int[])fieldValues.get("array");
		
		List<Integer> result = new ArrayList<>();
		int max=array[0];
		for (int i=0; i<array.length;i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		result.add(max);
	
		assertTrue("Vous devez afficher une seule valeur. Vous affichez"+lignes.size()+" valeurs au lieu de "+result.size(), lignes.size()==result.size());
		
		assertTrue("Vous avez trouvé "+lignes.get(0)+" au lieu de "+max, lignes.get(0).equals(Integer.toString(max)));
	}
}
