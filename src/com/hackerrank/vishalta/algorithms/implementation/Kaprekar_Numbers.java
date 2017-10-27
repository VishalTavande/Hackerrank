package com.hackerrank.vishalta.algorithms.implementation;

import java.util.Scanner;

public class Kaprekar_Numbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int q = s.nextInt();
        
        boolean found = false;
        for(int i=p; i<=q; i++) {
        	int totalDigits = String.valueOf(i).length();
            long square = (long) Math.pow(i, 2);
            
            long quotient = square/(long)(Math.pow(10,totalDigits));
            long remainder = square%(long)(Math.pow(10,totalDigits));
            
            if((quotient+remainder) == i) {
                found = true;
                System.out.println(i);
            }
        }
        if(!found)
            System.out.println("INVALID RANGE");
        s.close();
	}
}
