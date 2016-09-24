package hackBulgariaProblems2016;

public class Lakes {

	public static void calculateAmoutofWater(String input){
		int diagonalCounter =0;
		int waterSum = 0;
		
		for(int i = 0; i < input.trim().length(); i++){
			if(input.charAt(i) == 'D' || input.charAt(i) == 'd' ){
				diagonalCounter ++;
				if(diagonalCounter > 0){
					waterSum += 500 + 1000 * (diagonalCounter - 1);
				} 
			} else if(input.charAt(i) == 'U' || input.charAt(i) == 'u' ){
				if(diagonalCounter > 0){
					waterSum += 500 + 1000 * (diagonalCounter - 1);
				} 
				diagonalCounter --;
			} else if(input.charAt(i) == 'H' || input.charAt(i) == 'h' ){
				if(diagonalCounter > 0){
					waterSum += 1000 * diagonalCounter;
					
				}
			}
		}
		
		System.out.println(waterSum);
	}
	
	public static void main(String[] args){
		String test1 = "ddhhuu";
		String test2 = "ddhhddhuhhuuu";
		String test3 = "dddhhhuuhhuuuhdddduu";
		
		calculateAmoutofWater(test1);
		calculateAmoutofWater(test2);
		calculateAmoutofWater(test3);
	}
}
