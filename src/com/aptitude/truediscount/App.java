package com.aptitude.truediscount;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double amount,r,t,td,sum,si,cp,sp,pw;
        Scanner sc=new Scanner(System.in);
        System.out.println("1");
        System.out.println("2.5");
        System.out.println("3");
        System.out.println("4.20");
        System.out.println("6");
        System.out.println("7.18");
        System.out.println("8,17,19");
        System.out.println("9");
        System.out.println("10.13.14");
        System.out.println("11");
        System.out.println("12");
        System.out.println("15.16");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch (choice){
            case 1->{
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println("Enter the time in years");
                t= sc.nextDouble();
                System.out.println(Problems.prob1(amount,r,t));
            }
            case 2->{
                System.out.println("Enter the true discount");
                td=sc.nextDouble();
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println("Enter the time in years");
                t= sc.nextDouble();
                System.out.println(Problems.prob2_5(td,r,t));
            }
            case 3->{
                System.out.println("Enter the sum of amount");
                sum=sc.nextDouble();
                System.out.println("Enter the true discount");
                td=sc.nextDouble();
                System.out.println("Enter the time in years");
                t= sc.nextDouble();
                System.out.println(Problems.prob3(sum,td,t));
            }
            case 4->{
                System.out.println("Enter the sum of amount");
                sum=sc.nextDouble();
                System.out.println("Enter the true discount");
                td=sc.nextDouble();
                System.out.println("Enter the time in years");
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println(Problems.prob4_20(sum,td,r));
            }
            case 6->{

            }
            case 7->{
                System.out.println("Enter the si amount");
                si=sc.nextDouble();
                System.out.println("Enter the true discount");
                td=sc.nextDouble();
                System.out.println(Problems.prob7_18(si,td));
            }
            case 8->{
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                System.out.println("Enter the true discount");
                td=sc.nextDouble();
                System.out.println("Enter the time in years");
                t= sc.nextDouble();
                System.out.println(Problems.prob8_17_19(amount,td,t));
            }
            case 9->{
                System.out.println("Enter the amount");
                double amount1=sc.nextDouble();
                System.out.println("Enter the amount");
                double amount2=sc.nextDouble();
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println("Enter the time in years");
                t= sc.nextDouble();
                System.out.println(Problems.prob9(amount1,amount2,r,t));
            }
            case 10->{
                System.out.println("Enter the cost price");
                cp=sc.nextDouble();
                System.out.println("Enter the selling price");
                sp= sc.nextDouble();
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println("Enter the time in years");
                t= sc.nextDouble();
                System.out.println(Problems.prob10_13_14(cp,sp,r,t));
            }
            case 11->{

                System.out.println("Enter the present worth");
                pw= sc.nextDouble();
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println(Problems.prob11(pw,r));
            }
            case 12->{
                System.out.println("Enter the amount");
                amount=sc.nextDouble();
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println("Enter number of months ");
                double noofmonths = sc.nextDouble();
                System.out.println(Problems.prob12(amount,r,noofmonths));
            }
            case 15->{
                System.out.println("Enter the amount");
                double amount1=sc.nextDouble();
                System.out.println("Enter the time in years");
                double t1= sc.nextDouble();
                System.out.println("Enter the amount");
                double amount2=sc.nextDouble();
                System.out.println("Enter the time in years");
                double t2= sc.nextDouble();
                System.out.println("Enter the rate of interest");
                r=sc.nextDouble();
                System.out.println(Problems.prob15_16(amount1,t1,amount2,t2,r));
            }
        }
    }
}
