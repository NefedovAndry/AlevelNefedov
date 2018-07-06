import java.util.Scanner;

public class LCMandGCD {

//	public static int[] voidsDeleting(int[] arr){
//		int counter = 0;
//		while (arr[counter] != 0){
//			++counter;
//		}
//		int[] outputArr = new int[counter - 1];
//		for (int i = 0; i < counter; i++){
//			outputArr[i] = arr[i];
//		}
//		return outputArr;
//	}
	
	public static void main(String[] args) {
		System.out.println("Здравствуйте! Для нахождения наименьшего общего кратного (НОК) и наибольшего общего делителя (НОД) введите через "
				+ "Enter два числа:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int min = (a < b) ? a : b;
		int[] divisions = new int[min];
		int counter = 0;
		for (int div = 1; div <= min; div++){
			if (a % div == 0 && b % div == 0) {
				counter++;
				divisions[counter] = div;
			}
		}
		int lcm, gcd;
		gcd = (counter > 1) ? divisions[counter] : 1;
		lcm = (counter > 2) ? divisions[2] : 1;
		
		System.out.println("НОК:" + lcm);
		System.out.println("НОД:" + gcd);
	}

}
