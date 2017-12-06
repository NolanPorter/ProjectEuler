public class primeNumberGen{
	public static void main(String[] args){
		int num = 10001;
		int i = 0;
		int counter = 0;

		while (i < num){
		    counter++;
		    if (isPrime(counter))
		        i++;
		}
		System.out.println(counter);

	}

	public static boolean isPrime(int num){
		if(num <= 1){
			return false;
		}
		else if (num <= 3){
			return true;
		}
		else if(num%2 == 0 || num%3 == 0){
			return false;
		}
		int i = 5;
		while(i*i <= num){
			if(num%i == 0 || num%(i+2) == 0){
				return false;
			}
			i += 6;
		}

		return true;
	}
}