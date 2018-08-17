package com.alevel.hometask.basic;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		System.out.println("Здравствуй, незнакомец! Как мне тебя называть?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println(name.length() >= 10 ? ("tl;dr") : ("Hello, " + name + "!"));
		
		System.out.println(name + ", а спорим, что я найду большее из трёх целых чисел, которые ты введёшь?!");
		int inputNumber = scan.nextInt();
		int bigger = inputNumber;
		inputNumber = scan.nextInt();
		bigger = inputNumber > bigger ? inputNumber : bigger;
		inputNumber = scan.nextInt();
		bigger = inputNumber > bigger ? inputNumber : bigger;
		System.out.println(name + ", большее из чисел, которые ты ввёл - " + bigger);
		
		System.out.println(name + ", а хочешь - я найду, чему равна 2 в любой степени от 1 до 30 включительно?"
				+ " 2 в какой степени ты хочешь увидеть?");
		inputNumber = scan.nextInt();
		int powerOfTwo = 1;
		powerOfTwo = ((inputNumber < 1) || (inputNumber > 30) ? (0) : (powerOfTwo << inputNumber));
		System.out.println(powerOfTwo == 0 ? ("Глупо ты поступил, " + name + "!") : ("2 в степени " + inputNumber + " равно " + powerOfTwo + "!"));
		System.out.println(name + ", на сегодня всё! 8)\r\nУдачи, " + name + "!");
	}
}
