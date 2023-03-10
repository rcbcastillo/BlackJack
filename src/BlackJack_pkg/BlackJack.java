package BlackJack_pkg;

public class BlackJack {
	static void play(int a, int b) {

		if (a > 0 && b > 0) {
			int result;

			if (a > 21 && b > 21) {
				result = 0;
				System.out.println(result);
			} else if (a < b && a <= 21 && b <= 21) {
				result = b;
				System.out.println(result);
			} else if (a > b && a <= 21 && b <= 21) {
				result = a;
				System.out.println(result);
			} else if (a > 21 && b <= 21) {
				result = b;
				System.out.println(result);
			} else if (a <= 21 && b > 21) {
				result = a;
				System.out.println(result);
			}

		}
	}

	public static void main(String[] args) {
		play(10, 21);
		play(20, 18);
		play(1, 22);
		play(22, 23);
	}

}
