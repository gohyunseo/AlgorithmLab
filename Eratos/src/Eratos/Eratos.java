package Eratos;

import java.util.Arrays;

public class Eratos {

	public static void main(String[] args) {
		int[] arr = new int[101] ; //그림상 0과 1이 바뀜
		int k = 2;
		while(k*k<100){
			if(arr[k]==0) {
				int i = k;
				while(i <= 100/k) {
					arr[k*i] = 1;
					i++;
				}	
			}
			k++;	
		}
		for(int j=2;j<=100;j++) {
			if(arr[j]==0){
				System.out.print(j + " ");
			}
		}
	}

}
