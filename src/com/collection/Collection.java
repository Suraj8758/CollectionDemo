package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("suraj");
		list.add("pankaj");
		list.add("rajan");
		
		//System.out.println(list);
		
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
