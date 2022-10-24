package com.bs.pratice.token.controller;

public class TokenController {
	public TokenController(){
		
	}
	
	public String afterToken(String str) {
		str=str.replace(" ","");
		return str;
	}
	
	public String fristCap(String input) {
		String retultInput=input.toUpperCase();
		return retultInput;
	}
	
	public int findChar(String input, char one) {
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(one==input.charAt(i))
			{
				count++;
			}
			
			
		}
		return count;
		
	}
	

}
