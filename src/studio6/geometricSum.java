package studio6;

public class geometricSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gSum(3);
		System.out.println(gSum(3));
		//base case ends recursion(not return another function)
	}
	public static double gSum(int n) {
		
		if(n > 0) {
			return 1/Math.pow(2,n)+gSum(--n);
		}
		else {
			return 0;
		}
		
		
	}

}
