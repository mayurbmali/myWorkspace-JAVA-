package codersdbit;

public class ques2 {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(numprimes(n));

	}

	public static boolean isPrime(int num) {
		boolean flag = true;
		if(num==0 || num==1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static int numprimes(int num) {
		if(num==0 || num==1) {
			return -1;
		}
		else if (isPrime(num)) {
			return 1;
		}else if(!isPrime(num) && num>2) {
			
		}
	}
}
