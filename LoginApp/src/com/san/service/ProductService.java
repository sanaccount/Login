package com.san.service;

import java.util.ArrayList;
import java.util.List;

import com.san.bean.Productbean;

public class ProductService 
{

	public List<Productbean> getData(){
		
		Productbean productbean1 = new Productbean();
		productbean1.setId(11);
		productbean1.setDesc("aaaa");
		productbean1.setName("aaa1");
		
		Productbean productbean2 = new Productbean();
		productbean2.setId(22);
		productbean2.setDesc("bbb");
		productbean2.setName("bbb1");
		
		Productbean productbean3 = new Productbean();
		productbean3.setId(33);
		productbean3.setDesc("ccc");
		productbean3.setName("ccc1");
		
		List<Productbean> list = new ArrayList<Productbean>();
		list.add(productbean1);
		list.add(productbean2);
		list.add(productbean3);
		
		return list;
		
	} 
	
	public Productbean addItem(Productbean pbean){
	
		//Insert query
		
		//select query
		
		return pbean;
	}
	
	public Productbean update(Productbean pbean){
		
		//Update query
		
		//select query
		
		return pbean;
	}
	
	public Productbean delete(Productbean pbean){
		
		//delete query
		
		//select query
		
		return pbean;
	}
		
		
	}
		
		
	

	
    
	
	

