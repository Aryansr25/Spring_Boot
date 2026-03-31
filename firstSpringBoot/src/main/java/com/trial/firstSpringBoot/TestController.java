package com.trial.firstSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
	@RequestMapping("/test")
	public String firstHandeler() {
		return "TESTING";
	}
}
