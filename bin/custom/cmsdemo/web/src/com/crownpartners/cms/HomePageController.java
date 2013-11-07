package com.crownpartners.cms;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.*;

@Controller
public class HomePageController {

	@RequestMapping("/")
	public String homepage(Model model) {
		return "/homepage";
	}

}