package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevOpsWorld {
     @GetMapping("/Deployment")
	public String startDeployment()
	{
		return "this is RestApp-FirstDeployment-V14";
	}
}
