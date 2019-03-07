package org.minicoding;

public class MiniCoding {

	public static void mathGame() {
		boolean flag = true;
		for(int i=1;i<=100;i++) {
			if((i%3)==0) {
				System.out.print("Fizz");
				flag = false;
			}
			if((i%5)==0) {
				System.out.print("Buzz");
				flag = false;
			}
			if(flag) {
				System.out.print(i);
			}
			System.out.println();
			flag = true;
		}
	}
	
	public static void mathGameStage2() {
		boolean flag = true;
		String str_i ;
		for(int i=1;i<=100;i++) {
			str_i = String.valueOf(i);
			if((i%3)==0 || str_i.indexOf("3")>-1) {
				System.out.print("Fizz");
				flag = false;
			}
			if((i%5)==0 || str_i.indexOf("5")>-1) {
				System.out.print("Buzz");
				flag = false;
			}
			if(flag) {
				System.out.print(i);
			}
			System.out.println();
			flag = true;
		}
	}
}
