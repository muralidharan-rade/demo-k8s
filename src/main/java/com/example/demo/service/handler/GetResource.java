package com.example.demo.service.handler;

import java.util.Date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = { "/get" })
public class GetResource {
@GetMapping(value = { "/ping" })
	public String getServerTime() {
		return "received ping on " + new Date().toString();
	}
}
