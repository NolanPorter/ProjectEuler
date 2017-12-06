public class fibo{
	
	public static void main(String[] args){
		int n = 0;
		int sum = 0;
		fibo fibo = new fibo();

		while(fibo.fibonacci(n) < 4000000){
			if(fibo.fibonacci(n) % 2 == 0){
				sum += fibo.fibonacci(n);
			}
			System.out.println(n + " : " + fibo.fibonacci(n));
			System.out.println("Sum: " +sum);
			n++;
		}
	}


	public int fibonacci(int n){
		if(n <= 1){
			return 1;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

	//https://en.wikipedia.org/wiki/Quadratic_sieve
}