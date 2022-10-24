package com.yedam.java.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Cats {
	private String name;
	private int age;
	private String color;
	
	public void printInfo() {
		// aop가 사용될 경우에는 this를 사용하면 안됨.
		System.out.println(this.getName() + " , "
					     + this.getAge() + " , "
					     + this.getColor());	
	}
	
	@Autowired
	Cats myCat;

	// 인터페이스를 이용해서 호출해야만 AOP 작용
	public void printData() {
		System.out.println(myCat.getName() + " , "
			     		 + myCat.getAge() + " , "
			     		 + myCat.getColor());	
	}
}
