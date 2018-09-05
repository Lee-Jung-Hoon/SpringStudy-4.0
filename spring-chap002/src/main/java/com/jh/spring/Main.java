package com.jh.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Main Class
 * @author JH
 */
public class Main {

	/**
	 * Main Methods
	 * <p>
	 * 싱글톤 객체
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. 설정 정보를 이용해서 빈 객체를 생성한다.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// 2. 빈 객체를 제공한다.
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}