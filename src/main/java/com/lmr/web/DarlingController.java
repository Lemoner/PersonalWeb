package com.lmr.web;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmr.entity.MoodLog;
import com.lmr.service.DarlingService;

/**
 * 
 */
@Controller
@RequestMapping("/darling")
public class DarlingController{
	
	/**
	 * 日志对象
	 */
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	/**
	 */
	@Autowired
	private DarlingService darlingService;
	
	/**
	 * 主页
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/jun", method=RequestMethod.GET)
	public String homePage(Model model){
		return "darling/index";
	}
	
	/**
	 * 添加日志
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@RequestParam("moodText") String moodText,Model model){
		System.out.println(moodText);
		
		MoodLog mood=new MoodLog();
		mood.setUserId(123);
		mood.setMoodText(moodText);
		mood.setPublishTime(new Date());
		
		darlingService.publishMood(mood);
		
		return "darling/list";
	}
	
	/**
	 * 日志列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model){
		
//		int offset=0;
//		int limit=4;
//		
//		List<Seckill> seckills=seckillService.getSeckillAll(offset, limit);
//		
//		model.addAttribute("seckills", seckills);
		
		return "darling/list";
	}
	
}
