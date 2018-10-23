package com.lmr.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

//	/**
//	 * 与秒�?相关的业务操作对�?
//	 */
//	@Autowired
//	private SeckillService seckillService;
	
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
