package com.sungjuk;

public class Sungjuk_Ex1 {

	public static void main(String[] args) {
		
		Sungjuk sung = new Sungjuk();
		
		sung.input();
		sung.process();
		
		
		System.out.println("\n       ***성적표***        ");
		System.out.println("==========================");
		System.out.println("학번     이름      국어      영어      수학     총점      평균     등급");
		System.out.println("==========================");
		sung.output();
		System.out.println();
		

	}

}
