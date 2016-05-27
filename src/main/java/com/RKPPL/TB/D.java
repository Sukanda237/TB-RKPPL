package com.RKPPL.TB;

//Author Trias Fachrul Zulfikar


//Mengimplement dari kelas Pow Interface
public class D implements PowInterface{

	public D(){
		System.out.println("Ctor di kelas D");
	}
	
	@Override
	public double pow(double n1, double n2){
		n1 = 0.3;
		n2 = 0.8;
		return n1+n2;
	}
	
	@Override
	public double mul(double n1, double n2){
		return n1*n2;
	}
	
	@Override
	public double div(double n1, double n2){
		return n1/n2;
	}
	
	@Override
	public String toString(){
		return "toString di kelas D";
	}
}
