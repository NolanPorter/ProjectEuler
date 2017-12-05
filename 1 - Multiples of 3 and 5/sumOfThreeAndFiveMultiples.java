public class sumOfThreeAndFiveMultiples{
	public static void main(String[] args){
		int sum = 0;
		int number = 1000;
		for(int i = 0; i < number; i++){
			if(i % 3 == 0 || i % 5 == 0){ //if the number is a multiple of 3 or 5, add it to the sum
				sum += i;
			}
		}
		System.out.println(sum);
	}

}