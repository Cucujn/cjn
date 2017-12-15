package ShangKe;

import java.util.Scanner;

//编程求1!+2!+…+X!
//递归表达式，递归出口:1!=1
public class digui {
	public static int digui(int tmp) {
		if(tmp ==1) {
			return 1;
		} else {
			return tmp*digui(tmp-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum+=digui(i);
		}
		System.out.println(sum);
	}

}
