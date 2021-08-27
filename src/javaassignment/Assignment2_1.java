package javaassignment;

import java.util.Collections;

public class Assignment2_1 {
	
	public static void main(String[] args) {
		
		//Write a program to print the following pattern using for loop:00 01 02 03 04 05 06 07 08 09 
		//		10 11 12 13 14 15 16 17 18 19 
		//		20 21 22 23 24 25 26 27 28 29 
		//		30 31 32 33 34 35 36 37 38 39 

		for (int x=0;x<=3;x++) {
			for(int y=0;y<=9;y++) {
				System.out.print(x+""+y+" ");
			}
			System.out.println();
		}
	System.out.println("--------------");
//		Write a program to create a static Array, having following cricket data:
//			--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console using normal for/while loop and for each loop

		String CriketData[]= new String[7];
		CriketData[0] = "Name";
		CriketData[1] = "Age";
		CriketData[2] = "DOB";
		CriketData[3] = "Team Name";
		CriketData[4] = "Gender";
		CriketData[5] = "Strike Rate";
		CriketData[6] = "isActive";
		//String CriketData[] = {"Name","Age","DOB","Team Name","Gender","Strike Rate","isActive" };
		
		Object player1[]= new Object[7];
		player1[0] = "Sachin";
		player1[1] = 48;
		player1[2] = "24-04-1973";
		player1[3] = "Team India";
		player1[4] = 'M';
		player1[5] = 88.55;
		player1[6] = false;
		//Object player1[]= {"Sachin",48,"24-04-1973","Team India",'M',88.55,false};
		
		Object player2[]= new Object[7];
		player2[0] = "Virat";
		player2[1] = 32;
		player2[2] = "05-11-1988";
		player2[3] = "Team India";
		player2[4] = 'M';
		player2[5] = 67.23;
		player2[6] = true;
		//Object player2[]= {"Virat",32,"05-11-1988","Team India",'M',67.23,true};
		
		Object player3[]= new Object[7];
		player3[0] = "Mithali";
		player3[1] = 38;
		player3[2] = "03-12-1982";
		player3[3] = "Women's Team India";
		player3[4] = 'F';
		player3[5] = 45.04;
		player3[6] = true;
//		Object player3[]= {"Mithali",38,"03-12-1982","Women's Team India",'F',45.04,true};
		
		
		//First player
		for(int i=0;i<player1.length && i<CriketData.length;  i++) {
			System.out.println(CriketData[i]+": "+player1[i]);
		}
		
			System.out.println("----------Second Player-----------");
		
		for(int j=0;j<player2.length && j<CriketData.length;  j++) {
			System.out.println(CriketData[j]+": "+player2[j]);
		}
		
			System.out.println("----------Third Player-----------");
		
		for(int k=0;k<player3.length && k<CriketData.length;  k++) {
			System.out.println(CriketData[k]+": "+player3[k]);
		}
		
		System.out.println("---------Using WhileLoop-----------");
	
		int i=0;
		while(i<player1.length && i<CriketData.length) {
			System.out.println(CriketData[i]+": "+player1[i]);
			i++;
		}	
			System.out.println("----------Second Player-----------");
		int j=0;
		while(j<player2.length && j<CriketData.length) {
			System.out.println(CriketData[j]+": "+player2[j]);
			j++;
		}
			System.out.println("----------Third Player-----------");
		int k=0;
		while(k<player3.length && k<CriketData.length) {
			System.out.println(CriketData[k]+": "+player3[k]);
			k++;
		}
		
		System.out.println("---------Using For Each-----------");
		for(Object e :  player1) {
			System.out.println("First Player: "+e);
		}
		System.out.println("---------");
		for(Object e :  player2) {
			System.out.println("Second Player: "+e);
		}
		System.out.println("---------");
		for(Object e :  player3) {
			System.out.println("Third Player: "+e);
		}
		
		System.out.println("---------");
//		Question 3: Try to print the following pattern on the console:
//		n = 4
//		n = 3
//		n = 2
//		n = 1
//		n = 0
	
		int n[] = new int[5];
		n[0]=4;
		n[1]=3;
		n[2]=2;
		n[3]=1;
		n[4]=0;
		for(int m=0; m<n.length; m++) {
			System.out.println("n = "+n[m]);	
		}
		
	}
}
