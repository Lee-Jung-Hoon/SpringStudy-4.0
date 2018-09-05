package com.jh.spring;

/**
 * [02-01] Greeter Class
 * @author JH
 */
public class Greeter {
	private String format;
	
	/**
	 * Formet Getter
	 * @param guest
	 * @return
	 */
	public String greet(String guest) {
		return String.format(format, guest);
	}
	
	/**
	 * Format Setter
	 * @param format
	 */
	public void setFormat(String format) {
		this.format = format;
	}
}
