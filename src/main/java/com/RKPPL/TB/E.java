package com.RKPPL.TB;

import java.util.List;

// Trias FZ

public class E {
	
	private List dataList;
	
	public E(){
		System.out.println("Ctor dari kelas E");
	}
	
	public boolean containe(String n){
		return true ;
	}

	public List getDataList() {
		return dataList;
	}

	public void setDataList(List dataList) {
		this.dataList = dataList;
	}
	
	@Override
	public String toString(){
		return("toString di kelas E");
	}
	
	
		
}
