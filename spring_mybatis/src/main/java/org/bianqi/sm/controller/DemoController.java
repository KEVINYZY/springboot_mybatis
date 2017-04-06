package org.bianqi.sm.controller;

import java.util.List;

import org.bianqi.sm.pojo.Demo;
import org.bianqi.sm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

/**
 * @ClassName: DemoController
 * @Description: TODO
 * @author: Administrator
 * @date: 2017年4月6日 下午11:26:01
 */
@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value="likeName",name="name")
	public List<Demo> likeName(String name) {
		PageHelper.startPage(1, 3);
		return demoService.likeName(name);
	}

	@RequestMapping("/save")
	public Demo save() {
		Demo demo = new Demo();
		demo.setName("zhangsan");
		demoService.save(demo);
		return demo;
	}
}
