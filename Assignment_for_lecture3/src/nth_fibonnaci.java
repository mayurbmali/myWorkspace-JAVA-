import java.util.Scanner;

public class nth_fibonnaci {

	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		Scanner scn=new Scanner(System.in);
		int N = scn.nextInt();
		while(sum<N-1){
			
			sum=a+b;
			b=a;
			a=sum;
		}
		System.out.println(sum);

	}

}
