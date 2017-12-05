public class pythagTriplet{

	/*	
		a^2 + b^2 = c^2
		a < b < c
		a should only be able to be up to 332, because 332+333+334 = 999
		a <= 332
		b <= 333
		c <= 334
	*/
	public static void main(String[] args){
		System.out.println(findSpecialPythagTriplet());
	}

	public static int findSpecialPythagTriplet(){
		int a, b, c;

		for(a = 0; a < 1000; a++){
			for(b = a; b < 1000; b++){
				for(c = b; c < 1000; c++){
					if((a < b) && (b < c) && (a + b + c == 1000) && (a*a + b*b == c*c)){
						return a*b*c;
					}
				}
			}
		}
		return 0;
	}

}