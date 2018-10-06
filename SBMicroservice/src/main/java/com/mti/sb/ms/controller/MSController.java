/**
 * 
 */
package com.mti.sb.ms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prem_MacPro
 *
 */
@RestController
public class MSController {
	
	@RequestMapping
	public String pingTest() {
		return "SBMisroservices Up and running";
	}

}
