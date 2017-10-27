package com.hackerrank.vishalta.algorithms.implementation;

import java.util.Scanner;

public class Time_In_Words {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        String hours = getHoursToWord(h);
        String minutes = getMinutesToWord(m);
       
       if(m<=30) {
    	   if(minutes==null)
    		  System.out.println(hours + " o' clock");
    	   else
    		   System.out.println(minutes + " past " + hours);
       }
       else
    	   System.out.println(minutes + " to " + getHoursToWord(h+1));
       
       in.close();
	}


	private static String getHoursToWord(int h) {
		String hour = null;
        switch(h) {
        case 1:	
        	hour = "one";
        	break;
        case 2:	
        	hour = "two";
        	break;
        case 3:	
        	hour = "three";
        	break;
        case 4:	
        	hour = "four";
        	break;
        case 5:	
        	hour = "five";
        	break;
        case 6:	
        	hour = "six";
        	break;
        case 7:	
        	hour = "seven";
        	break;
        case 8:	
        	hour = "eight";
        	break;
        case 9:	
        	hour = "nine";
        	break;
        case 10:	
        	hour = "ten";
        	break;
        case 11:	
        	hour = "eleven";
        	break;
        case 12:	
        	hour = "twelve";
        	break;
        }
        
        return hour;
	}


	private static String getMinutesToWord(int m) {
		
		if(m>30) {
			m = 60-m;
		}
		
		String minutes = null;
		   switch(m) {
		   	case 1:
		   		minutes = "one minute";
		   		break;
		   	case 2:
		   		minutes = "two minutes";
		   		break;
		   	case 3:
		   		minutes = "three minutes";
		   		break;
		   	case 4:
		   		minutes = "four minutes";
		   		break;
		   	case 5:
		   		minutes = "five minutes";
		   		break;
		   	case 6:
		   		minutes = "six minutes";
		   		break;
		   	case 7:
		   		minutes = "seven minutes";
		   		break;
		   	case 8:
		   		minutes = "eight minutes";
		   		break;
		   	case 9:
		   		minutes = "nine minutes";
		   		break;
		   	case 10:
		   		minutes = "ten minutes";
		   		break;
		   	case 11:
		   		minutes = "eleven minutes";
		   		break;
		   	case 12:
		   		minutes = "twelve minutes";
		   		break;
		   	case 13:
		   		minutes = "thirteen minutes";
		   		break;
		   	case 14:
		   		minutes = "fourteen minutes";
		   		break;
		   	case 15:
		   		minutes = "quarter";
		   		break;       		
		   	case 16:
		   		minutes = "sixteen minutes";
		   		break;
		   	case 17:
		   		minutes = "seventeen minutes";
		   		break;
		   	case 18:
		   		minutes = "eighteen minutes";
		   		break;
		   	case 19:
		   		minutes = "nineteen minutes";
		   		break;
		   	case 20:
		   		minutes = "twenty minutes";
		   		break;
		   	case 21:
		   		minutes = "twenty one minutes";
		   		break;
		   	case 22:
		   		minutes = "twenty two minutes";
		   		break;
		   	case 23:
		   		minutes = "twenty three minutes";
		   		break;
		   	case 24:
		   		minutes = "twenty four minutes";
		   		break;
		   	case 25:
		   		minutes = "twenty five minutes";
		   		break;
		   	case 26:
		   		minutes = "twenty six minutes";
		   		break;
		   	case 27:
		   		minutes = "twenty seven minutes";
		   		break;
		   	case 28:
		   		minutes = "twenty eight minutes";
		   		break;
		   	case 29:
		   		minutes = "twenty nine minutes";
		   		break;
		   	case 30:
		   		minutes = "half";
		   		break;
		   }
		   
		   return minutes;
	}
}
