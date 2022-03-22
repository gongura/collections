package com.company;

public class Main {

    static void polyndrome(int num) {
             int rem, rev = 0,act;
        for(act = num;act!= 0;act/=10) {
            rem = act % 10; // 234 => 4,3,2
            rev = (rev*10)+rem; //40

        }
        System.out.println(rev+"===="+num);
        if(num == rev) {
            System.out.println("yes it is polyndrome");
        } else {
            System.out.println("not a polyndrome");
        }
    }

    public static void main(String[] args) {
	polyndrome(232);
    }
}
