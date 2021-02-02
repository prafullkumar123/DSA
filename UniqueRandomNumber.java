package com.ds;

import java.util.Random;

public class UniqueRandomNumber 
{

	public static void main( String[] args )
	{
		int temp=0;
		int arr[] = new int[100];
		boolean rnm = false;
		long startBbl = 0, endBbl = 0;
		boolean condition = false;
		startBbl = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			int random = rand();
			do{
				 random = rand();
				if(arr[0]==0) {
					arr[0]=random;
				}
			}while(cond(random, arr));
			arr[i]=random;
		}

		System.out.println( "\n ! START Bubble sort !" );
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int itr : arr) {
			System.out.print(itr+" ");
		}
		endBbl = System.currentTimeMillis();
		System.out.println( "\n! END Bubble sort !   "+(endBbl-startBbl) );
	
	}

	private static boolean cond(int random,int arr[]) {
		// TODO Auto-generated method stub
		boolean rnm= false;
		for(int j = 0;j< arr.length;j++) {
			if(arr[j]==random)
				rnm =  true;
		}
		System.out.print(random+"  ");
		return rnm;
	}

	private static int rand() {
		// TODO Auto-generated method stub
		return new Random().nextInt(101);
	}
}
