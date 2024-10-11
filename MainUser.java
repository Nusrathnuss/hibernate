package com.tap.main;

import com.tap.entity.user;
import com.tap.manager.HibernateManager;

public class MainUser {
	public static void main(String []args) {
		HibernateManager hm=new HibernateManager();
		hm.connect();
		user u=new user(5,9067,"jahan",988000);
		hm.add(u);
		System.out.println("data is added");
	}

}
