package projetJunitG5;

public class Calcul {
	public int calculerSum(int A, int B) {
		if (A > B) {
			throw new IllegalArgumentException("Erreur");
		}
		
	    //int n = B - A + 1;
	    //int sum = (n * (A + B)) / 2;
	    //return sum;
		int sum=0;
		for(int i=A;i<=B;i++) {
			sum+=i;
		}
		return sum;
	}
}
