package com.bs.pratice.token.view;

import java.util.Scanner;

import com.bs.pratice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc =new TokenController();

	public void mainMenu() {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("9. 프로그램 끝내기");
		System.err.print("메뉴 입력 : ");
		int numMenu=sc.nextInt();
		
		switch(numMenu) {
		case 1 :  tokenMenu(); break;
		case 2 :  inputMenu(); break;
		case 9 : return;
		}
	}
	public void tokenMenu() {
		String str = " J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 개수 : "+str.length());
		str=tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+str);
		String tr_str=tc.fristCap(str);
		System.out.println("토큰 처리 후 개수 : "+tr_str.length());
		System.out.println("모두 대문자로 변환 : "+tr_str);
		
		
		
	}
	
	public void inputMenu() {
		sc.nextLine();
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		tc.fristCap(str);
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char word =sc.next().charAt(0);
		int num=tc.findChar(str, word);
		System.out.println(word+"문자가 들어간 개수 :"+num);
		
		
		
	}
}
