public class sumSquareDifference{
	long squareAll = 0;
	long squareSum = 0;
	public static void main(String[] args){
		int num = 100;
		System.out.println(squareOfSum(num) - squareOfAll(num));
	}

	public static long squareOfAll(int n){
		long sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i*i;

		}
		return sum;

	}

	public static long squareOfSum(int n){
		long sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum*sum;
	}


}