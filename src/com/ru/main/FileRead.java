package com.ru.main;
import java.io.*;

public class FileRead {
	public static void main(String args[])
	{
		int i;
		FileInputStream fn;
		if(args.length != 1)
		{
			System.out.println("Show file name");
			return;
		}
		try{
			
			fn = new FileInputStream(args[0]);
		}catch(FileNotFoundException e){
			System.out.println("Can not print file");
			return;
		}
		try{
			
			do{
				i = fn.read();
				if(i != -1){
					System.out.println((char) i);
				}
				}while(i != -1);
			}catch(IOException e){
				
				System.out.println("Error reading file");
			}
			try{
				fn.close();
				
			}catch(IOException e){
				
				System.out.println("Error closing file");
			}
		}
	}
	


