package com.mygame.main;

import com.mygame.GameService;
import com.mygame.GameView;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameView view = new GameView();
		GameService service = new GameService();
		
		String name[] = view.displayCityNamesWithBlanks();
		
		for(int i = 0 ; i <=5 ; i++)
		System.out.println(name[i]);
		
		System.out.println("Guess the Name of the cities:");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String c=sc.next();
		
	}

}
