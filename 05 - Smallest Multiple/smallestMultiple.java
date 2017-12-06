import java.util.ArrayList;
import java.util.List;
public class smallestMultiple{
	static long i = 2520;
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		while(!isDivis(i)){
			i += 20;
		}
		System.out.println(i);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + "ms");

		/*
		if(isPrime(18)){
			System.out.println("xd");
		}*/
		
	}



	public static boolean isDivis(long num){
		/*
		20 -> 2, 4, 5, 10
		19 -> 19
		18 -> 2, 3, 6, 9, 18
		17 -> 17
		16 -> 2, 4, 8, 16
		15 -> 3, 5, 15
		14 -> 2, 7, 14
		13 -> 13
		12 -> 2, 3, 4, 6, 12
		11 -> 11
		*/
		int counter = 0;
		int divis = 20;
		for(int j = 11; j <= divis; j++){
			if(num%j != 0){
				return false;
			}
		}
		return true;
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