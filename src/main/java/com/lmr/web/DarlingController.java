package com.lmr.web;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lmr.entity.MoodLog;
import com.lmr.service.DarlingService;
import com.vdurmont.emoji.EmojiParser;

/**
 * 说说控制层
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
	public String add(@RequestParam("moodText") String text,Model model){
		
		String moodText=EmojiParser.parseToAliases(text);
		
		System.out.println(moodText);
		
		MoodLog mood=new MoodLog();
		mood.setUser("admin");
		mood.setMoodText(moodText);
		mood.setPublishTime(new Date());
		
		darlingService.publishMood(mood);
		
		return "/darling/list";
	}
	
	/**
	 * 日志列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model){
		
		List<MoodLog> moodLogs=darlingService.getMoodLogAll();
		
		model.addAttribute("moodLogs", moodLogs);
		
		System.out.println(moodLogs.size());
		for(MoodLog moodLog:moodLogs){
			System.out.println(moodLog.toString());
		}
		
		return "darling/list";
	}
	
}
