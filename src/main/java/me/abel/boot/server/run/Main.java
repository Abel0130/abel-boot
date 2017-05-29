/**
 * 
 */
package me.abel.boot.server.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description 
 * @author Abel.li
 * @contact abel0130@163.com
 * @version 
 */
@SpringBootApplication
@ComponentScan(basePackages={"im.abel.boot.server"},lazyInit=true,useDefaultFilters=true)
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
