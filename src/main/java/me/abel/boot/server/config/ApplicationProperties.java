/**
 * 
 */
package me.abel.boot.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description 
 * @author Abel.li
 * @contact abel0130@163.com
 * @version 
 */
@ConfigurationProperties(prefix="application")
public class ApplicationProperties {
	private String name;
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
