public class palindrome{

	public static void main(String[] args){
		int greatest = 0;

		for(int i = 100; i < 1000; i++){
			for(int j = 100; j < 1000; j++){
				if(isPalin(i*j) && (i*j > greatest)){
					greatest = i*j;
				}
			}
		}
	 	System.out.println(greatest);
	}

	public static boolean isPalin(int num){
		int n = num;
 		int rev = 0;
 		while (num > 0){
      		int dig = num % 10;
      		rev = rev * 10 + dig;
      		num = num / 10;
 		}

 		if(n == rev){
 			return true;
 		}else{
 			return false;
 		}
	}
}