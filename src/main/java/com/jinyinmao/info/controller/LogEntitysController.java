package com.jinyinmao.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jinyinmao.info.mapper.LogEntitysMapper;
import com.jinyinmao.info.model.LogEntitys;

@RestController
public class LogEntitysController {
	
	@Autowired
	private LogEntitysMapper logEntitysMapper;
	
	@GetMapping("all/{purchase}")
	public List<LogEntitys> All(@PathVariable String purchase){
		return logEntitysMapper.All(purchase);
	}

}
