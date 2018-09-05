package com.jh.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Main2 Class
 * @author JH
 */
public class Main2 {
	
	/**
	 * Main2 Methods
	 * <p>
	 * 싱글톤 객체
	 * @param args
	 */
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);

		// 스프링은 별도의 설정을 하지 않을 경우 한 개의 빈 객체만을 생성
		// 이를 '싱글톤' 범위를 갖는다고 표현한다.(한 개의 <bean> 태그에 대해 한 개의 빈 객체를 생성)
		System.out.println("(g1 == g2) = " + (g1 == g2));
		
		// 2개의 <bean> 태그에 대해서는 2개의 빈 객체를 생성
		Greeter g3 = ctx.getBean("greeter1", Greeter.class);
		System.out.println("(g1 == g3) = " + (g1 == g3));
		ctx.close();
	}
}
