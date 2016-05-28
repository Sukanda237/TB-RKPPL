package com.RKPPL.TB;

import java.util.ArrayList;
import java.util.List;

//author Trias Fachrul Zulfikar
//133040286

public class MainApp {
	
	public static void main(String[] args) {
		
//		membuat variabel dan memasukan nilainya
		int n1 = 5;
		int n2 = 6;
		
//		Instansiasi kelas D
		D d = new D();
		
//		method pow dari kelas D
		System.out.println(d.pow(n1, n2));
		
//		method mul dari kelas D
		System.out.println(d.mul(n1, n2));
		
//		method div dari kelas D
		System.out.println(d.div(n1, n2));
		
//		method toString dari kelas D
		System.out.println(d.toString());
		
		System.out.println();
		
		
//		Instansiasi kelas C
		C c = new C();
		
//		memasukan nilai ke n1 dan n2
		c.setN1(n1);
		c.setN2(n2);
		
//		method add dari kelas C
		System.out.println(c.add());
		
//		method sub dari kelas C
		System.out.println(c.sub());
		
//		method mul dari kelas C
		System.out.println(c.mul());
		
//		method div dari kelas C
		System.out.println(c.div());
		
//		method toString dari kelas C
		System.out.println(c.toString());
		
		System.out.println();
		
		
//		Instansiasi Kelas E
		E e = new E();
		
//		membuat List
		List dataList = new ArrayList();
		
		dataList.add(c);
		dataList.add(d);
		dataList.add(e);
		e.setDataList(dataList);
		
		System.out.println(e.getDataList());
		
		System.out.println(e.contains("C"));
		System.out.println(e.contains("D"));
		System.out.println(e.contains("E"));
		
				
		System.out.println(e.toString());
		
		
		
	}

}
