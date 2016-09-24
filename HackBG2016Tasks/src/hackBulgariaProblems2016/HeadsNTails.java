package hackBulgariaProblems2016;



public class HeadsNTails {

	public static void coinFlipResult(String input) {
		int counterH = 0;
		int counterT = 0;
		if (!input.isEmpty()) {
			for (int i = 0; i < input.trim().length(); i++) {
				if (input.charAt(i) == 'H' || input.charAt(i) == 'h') {
					counterH ++;
				} else if (input.charAt(i) == 'T' || input.charAt(i) == 't') {
					counterT ++;
				}
			}
			
			if(counterT > counterH){
				System.out.println("T wins!");
			} else if(counterT < counterH) {
				System.out.println("H wins!");
			} else {
				System.out.println("Draw!");
			}

		}

	}
	
	public static void main(String[] args){
		String test1 = "H, H, H, H, T, T, T";
		String test2 = "H, H, H, H, T, T, T, T";
		String test3 = "H, T, H, T, T, H, T";
		
		coinFlipResult(test1);
		coinFlipResult(test2);
		coinFlipResult(test3);
	}
}
