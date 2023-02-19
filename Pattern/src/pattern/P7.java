package pattern;

public class P7 {
	public static void main(String[] args) {

		int i, j;
		int n = 5;
		int k = 1;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= n; j++) {

				System.out.printf("%2d ", k);
				k += 2;
			}
			System.out.println(" ");
		}
	}
}


/*


 1  3  5  7  9  
11 13 15 17 19  
21 23 25 27 29  
31 33 35 37 39  
41 43 45 47 49  




*/