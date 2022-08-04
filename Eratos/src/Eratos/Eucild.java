package Eratos;
import java.util.*;
public class Eucild {

	public static void main(String[] args) {
		Scanner no = new Scanner(System.in);
		System.out.print("a를 입력하세요. >");
		int a = no.nextInt();
		System.out.print("b를 입력하세요. >");
		int b = no.nextInt();
		int r = 0;
		
		do{
			r = a % b;
			a = b;
			b = r;
		}while(r!=0);
		
		System.out.println("a 와 b 의 최대공약수는" + a +"입니다." );
		
		}
	}


