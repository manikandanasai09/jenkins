package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenkinsController {
	@GetMapping(value = "/getM")
	public String getname() {
		return"Mani A";
	}

}
