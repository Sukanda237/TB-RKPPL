package com.RKPPL.TB;

import java.util.List;

// Trias FZ

public class E {
	
	private List dataList;
	
	public E(){
		System.out.println("Ctor dari kelas E");
	}
	
	public boolean contains(String n){
		return this.dataList.toString().contains(n);
	}

//	mengambil data berupa List
	public List getDataList() {
		return dataList;
	}

//	melakukan set dataList
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}
	
//	Method toString dari kelas E
	@Override
	public String toString(){
		return("toString di kelas E");
	}
	
	
		
}
