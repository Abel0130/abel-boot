/**
 * 
 */
package me.abel.boot.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @description 
 * @author Abel.li
 * @contact abel0130@163.com
 * @version
 */
@RestController
public class SpringBootController {

	@RequestMapping(method=RequestMethod.GET)
	public Long get(Long id) {
		System.out.println(id);
		return id;
	}
	
}
