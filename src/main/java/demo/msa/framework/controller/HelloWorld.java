/**   
 * Copyright © 2018 TravekSky. All rights reserved.
 * 
 * 功能描述：
 * @Package: demo.msa.framework.controller 
 * @author: Ocean   
 * @date: 2018年3月26日 上午10:40:53 
 */
package demo.msa.framework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2018 TravelSky
 * 
 * @ClassName: HelloWorld.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.20180326
 * @author: Ocean
 * @date: 2018年3月26日 上午10:40:53
 * 
 * Modification History:
 * Date            Author        Version           Description
 * -----------------------------------------------------------
 * 2018年3月26日      Ocean         v1.0.20180326     创建&修改
 */

@RestController
public class HelloWorld {

	@GetMapping("hello")
	public String hello() {
		return "hello,world!";
	}
}
