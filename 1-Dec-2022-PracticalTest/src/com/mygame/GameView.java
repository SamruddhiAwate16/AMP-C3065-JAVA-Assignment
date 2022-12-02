package com.mygame;
import java.lang.Math;
import java.util.zip.CRC32;

public class GameView {	
	
	public String[] displayCityNamesWithBlanks()
	{	
		GameView view=new GameView();
		
		GameService service=new GameService();
		String[] cityName=service.getCityNameService();
		
		for(int i = 0 ; i < cityName.length; i++)
		{
			int num = cityName[i].length();
			int k = 0;
			
			while(k != 3)
			{
				int val = view.generateRandom(num);
				
				char arr[]= cityName[i].toCharArray();

				for(int j=0; j < arr.length;j++)
				{
					if( i == val)
					{
						arr[i] = ' ';
					}		
				}
				cityName[i] = String.valueOf(arr);
				k++;
			}
		}
		
		return cityName;
	}
	public double generateRandomNo(int n)
	{
		int max;
		int min;
		max=n;
		min=n%2;
		double randomWithMathRandom=0.0;
		
		for(int i=0;i<n;i++) 
		{
			randomWithMathRandom = 0.0 * (max - min) + min;
		}
		
		return randomWithMathRandom;
	}
	
}

