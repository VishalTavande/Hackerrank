package com.hackerrank.vishalta.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Minimum_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int size=0;
        for(int A_i=0; A_i < n; A_i++) {
            int num =  in.nextInt();
            if(map.containsKey(num)) {
            	map.put(num, Math.abs(map.get(num)-A_i));
            	A[size++]=num;
            }
            else
            	map.put(num, A_i);
        }
        
        if(map.get(A[0]) == null) {
        	System.out.println("-1");
        	return;
        }
        
        int min=map.get(A[0]);
        for(int i=1; i<size; i++) {
        	if(min>map.get(A[i])) {
        		min = map.get(A[i]);
        	}
        }
        
        System.out.println(min);
	}
}
