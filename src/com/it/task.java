package com.it;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task {

    public static void main(String[] args) {


//        Задание 1:

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi, " + name);


//        Задание 2:

        for (int i = args.length ; i >= 0; i--) {
            System.out.println(i);

        }


//        Задание 3:


        for (int a = 0 ; a < 3 ; a++) {
            double b = Math.random() * 3;
            System.out.print(b + " ");
        }

        for (int a = 0 ; a < 3 ; a++) {
            double b = Math.random() * 3;
            System.out.println(b + " ");
        }


//        Задание 4:


        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String password2 = "123456";

            if (password.equals(password2)) {
                System.out.println(password + " = 123456");
            } else {
                System.out.println("Wrong password");
            }


//        Задание 5:

        int sum = 0;
        for (int i=0; i<args.length; i++) {
            int arg = Integer.parseInt(args[i]);
            sum=sum+arg;
        }
        System.out.println(sum);


        int fact = 1;
        for (int i=0; i<args.length; i++) {
            int arg = Integer.parseInt(args[i]);
            fact=fact * arg;
        }
        System.out.println(fact);


//        Задание от 29.02.2020


        String Str1 = new String("Доброе утро");
        String Str2 = new String( "Спокойной ночи");
        System.out.print ("Длина строки:" + " Доброе утро" + " -");
        System.out.println(Str1.length());
        System.out.print ("Длина строки:" + " Спокойной ночи" + " -");
        System.out.println(Str2.length());



//        Задания 6:


        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] numbers = number.split(" ");

        List<Integer> even = new ArrayList<Integer>();
        List<Integer> uneven = new ArrayList<Integer>();
        List<Integer> task3 = new ArrayList<Integer>();
        List<Integer> task4 = new ArrayList<Integer>();
        List<Integer> task5 = new ArrayList<Integer>();
        List<Integer> lucky = new ArrayList<Integer>();



        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (num % 2 == 0) {

                even.add(num);
            } else {
                uneven.add(num);
            }
            if (num <= min) {
                min = num;
            } else if (num >= max) {
                max = num;
            }
            if (num % 3 == 0 || num % 9 == 0) {
                task3.add(num);
            }
            if (num % 5 == 0 && num % 7 == 0) {
                task4.add(num);
            }
            if (num >= 100 && num <=999) {
                String str1 = Integer.toString(num);
                String[] str2 = str1.split("(?!^)");
                if (!str2[0].equals(str2[1]) && !str2[1].equals(str2[2]) && !str2[2].equals(str2[0])){
                task5.add(num);
                }
            }
            String str = Integer.toString(num);
            String[] str9 = str.split("(?!^)");
            if (str9.length % 2 ==0) {
                int sum1 = 0;
                int sum2 = 0;
                for (int j=0; j<str9.length/2; j++){
                    int num1 = Integer.parseInt(str9[j]);
                    sum1 = sum1 + num1;
                }
                for (int j=str9.length/2; j<str9.length; j++){
                    int num2 = Integer.parseInt(str9[j]);
                    sum2 = sum2 + num2;
                }
                if (sum1 == sum2) {
                    lucky.add(num);
                }
            }
        }

        System.out.println("Even numbers: " + even);

        System.out.println("Uneven numbers: " + uneven);

        System.out.println("Min number: " + min);

        System.out.println("Max number: " + max);

        System.out.println("Divided by 3 or 9: " + task3);

        System.out.println("Divided by 5 and 7: " + task4);

        System.out.println("Task 6.5: " + task5);

        System.out.println("Lucky numbers: " + lucky);

    }

}

