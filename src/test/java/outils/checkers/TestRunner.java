package outils.checkers;

import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import outils.Exercice;
import outils.Question;

public abstract class TestRunner extends Runner {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Override
    public Description getDescription() {
        return Description
          .createTestDescription(this.getClass(), "My runner description");
    }
	
	@Override
    public void run(RunNotifier notifier) {
		
		if (!this.getClass().isAnnotationPresent(Exercice.class)) {
			throw new RuntimeException("Cette classe n'est pas un exercice.");
		}
		
		Method[] methods = this.getClass().getDeclaredMethods();
		for (Method method: methods) {
			if (method.isAnnotationPresent(Question.class)) {
				Question question = method.getAnnotation(Question.class);
				try {
					notifier.fireTestStarted(Description
		                      .createTestDescription(this.getClass(), method.getName()));
					method.invoke(this);
					checkCode(this.getClass().getSimpleName(), question.numero());
					systemOutRule.clearLog();
				} catch (IllegalAccessException e) {
					fail(e.getMessage());
				} catch (IllegalArgumentException e) {
					fail(e.getMessage());
				} catch (InvocationTargetException e) {
					fail(e.getMessage());
				}
			}
		}
	}

	protected final void checkCode(String exerciceName, int question) {
		
		String className = "fr.algorithmie.outils.checkers."+this.getClass().getSimpleName()+"Checker";
		String methodName = "check"+question;
		try {
			Class<?> classe = Class.forName(className);
			Object instance = classe.getConstructor().newInstance();
			Method check = classe.getMethod(methodName, String.class);
			check.invoke(instance, systemOutRule.getLog());
		} catch (ClassNotFoundException e) {
			Assert.fail("Vous avez supprim?? la classe "+className+" ou r??organis?? les packages. Merci d'effectuer un retour arri??re afin de ne pas perturber le TP.");
		} catch (NoSuchMethodException e) {
			Assert.fail("Vous avez modifi?? le nom de la m??thode "+methodName+" dans la classe "+className+". Merci d'effectuer un retour arri??re afin de ne pas perturber le TP.");
		} catch (SecurityException | IllegalAccessException e) {
			Assert.fail("Vous avez modifi?? la visibilit?? de la m??thode "+methodName+" dans la classe "+className+". Merci d'effectuer un retour arri??re afin de ne pas perturber le TP.");
		} catch (IllegalArgumentException e) {
			Assert.fail("Vous avez modifi?? la signature de la m??thode "+methodName+" dans la classe "+className+". Merci d'effectuer un retour arri??re afin de ne pas perturber le TP.");
		} catch (InstantiationException e) {
			Assert.fail("Vous avez supprim?? le constructeur par d??faut de la classe "+className+". Merci d'effectuer un retour arri??re afin de ne pas perturber le TP.");
		} catch (InvocationTargetException e) {
			// Affiche l'exception g??n??r??e par l'assertion fausse.
			Assert.fail("Echec "+exerciceName+" - question n??"+question+" : "+e.getCause().getMessage());
		} 
	}
}
