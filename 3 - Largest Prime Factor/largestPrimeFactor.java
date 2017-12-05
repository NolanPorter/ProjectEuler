import java.util.ArrayList;
import java.util.List;

public class largestPrimeFactor{

	public static void main(String[] args){
		for(Long lon : factorization(600851475143L)){
			System.out.println(lon);
		}

	}


	public static List<Long> factorization(long n){
		 
		List<Long> factors = new ArrayList<Long>();

		for(long i = 2; i <= n; i++){
			while(n % i == 0){
				factors.add(i);
				n = n/i;
			}
		}
		return factors;

	}

}