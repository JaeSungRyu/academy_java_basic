package control.loop;

public class NineNine2 {
	public static void main(String[] args) {
		for (int stage = 1; stage <= 9; stage++) {
			for (int times = 2; times <= 4; times++) {
				System.out.print(times + "*" + stage + "=" + (stage * times) + '\t');
			}
			System.out.println();
		}
		System.out.println();

		for (int stage = 1; stage <= 9; stage++) {
			for (int times = 5; times <= 7; times++) {

				System.out.print(times + "*" + stage + "=" + (stage * times) + '\t');
			}
			System.out.println();
		}
		System.out.println();

		for (int stage = 1; stage <= 9; stage++) {
			for (int times = 8; times <= 9; times++) {
				System.out.print(times + "*" + stage + "=" + (stage * times) + '\t');
			}
			System.out.println();
		}
	}

}
