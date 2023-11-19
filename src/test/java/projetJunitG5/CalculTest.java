package projetJunitG5;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.Assert;

public class CalculTest {
	private Calcul c1;

	//class initialize est annotée avec  @Before et est executée avant chaque test  
	@Before
	public void initialize() {
		c1 = new Calcul();
	}
	
	//vérifie que la somme est correctement calculée pour des valeurs valides de A et B.
	@Test
	public void testSomme() {
		int A = 2;
		int B = 6;
		int expected = 20;
		int actual = c1.calculerSum(A, B);
		Assert.assertEquals(expected, actual);
	}
	
	//vérifie que l'exception IllegalArgumentException est levée lorsque des paramètres invalides 
	@Test(expected = IllegalArgumentException.class)
	public void testSommeInvalidParameters() {
		int A = 10;
		int B = 1;
		c1.calculerSum(A, B);
	}
	//vérifie que la boucle de calcul de la somme s'exécute dans un temps raisonnable 
	@Test(timeout = 1000)
	public void testTime() {
		int A=3;
		int B=200000;
		c1.calculerSum(A, B);
	}
	
	//sera ignore lors de l'execution
	@Ignore
	@Test
	public void IgnoreTest() {
		
	}
}
