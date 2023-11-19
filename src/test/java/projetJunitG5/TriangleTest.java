package projetJunitG5;

import org.junit.Test;

import org.junit.Assert;

public class TriangleTest {

	// Cas de test avec un triangle scalène
	@Test
	public void testTriangleScalene() {

		Triangle triangle = new Triangle(3.0, 4.0, 5.0);
		int Type = 1;
		int actualType = triangle.type();
		Assert.assertEquals(Type, actualType);
	}

	// Cas de test avec un triangle isocèle
	@Test
	public void testTriangleIsosceles() {
		Triangle triangle = new Triangle(5.0, 5.0, 3.0);
		int Type = 3;
		int actual = triangle.type();
		Assert.assertEquals(Type, actual);
	}
	// Cas de test avec un triangle équilatéral
	@Test
	public void testTriangleEquilateral() {
		Triangle triangle = new Triangle(2.0, 2.0, 2.0);
		int Type = 3;
		int actualType = triangle.type();
		Assert.assertEquals(Type, actualType);
	}


}
