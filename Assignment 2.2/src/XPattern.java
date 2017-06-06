
public class XPattern {

	public static void main(String[] args) {

		int x = 1;

		for (x = 1; x <= 12; x++) {

			if (x == 1) {
				System.out.println("*           *");
				continue;
			}

			else if (x == 2) {
				System.out.println(" -----------");
				continue;
			}

			else if (x == 3) {
				System.out.println("   *     *   ");
				continue;
			} else if (x == 4) {
				System.out.println("--- ----");
			} else if (x == 5) {
				System.out.println("      *   ");
			} else if (x == 6) {
				System.out.println("------   ");
			} else if (x == 7) {
				System.out.println("   *     *   ");
			} else if (x == 8) {
				System.out.println("--- ----");
			} else if (x == 9) {
				System.out.println("*           *");
			} else if (x == 10) {
				System.out.println(" -----------");
			}

		}

	}
}
