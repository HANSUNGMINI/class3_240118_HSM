package com.itwillbs.test_hsm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HSHController {
	@RequestMapping
	public String get() {
		return "HSH";
	}
}
