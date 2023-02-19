package pattern;

public class P29 {
	public static void main(String[] args) {

		char i, j;

		for (i = 'A'; i <= 'E'; i++) {
			for (j = 'E'; j >= 'A'; j--) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}


/*


AAAAA 
BBBBB 
CCCCC 
DDDDD 
EEEEE 


*/