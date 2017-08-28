package cn.sxt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.sxt.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/list")
	public String list(ModelMap map){
		map.addAttribute("list",employeeService.list());
		return "/list.jsp";//转发到list页面
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String emp_name = request.getParameter("emp_name");
		String emp_sex1  = request.getParameter("emp_sex");
		int emp_sex = Integer.parseInt(emp_sex1);
		String emp_age1 = request.getParameter("emp_age");
		int emp_age = Integer.parseInt(emp_age1);
		String emp_depart = request.getParameter("emp_depart");
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("emp_name",emp_name );
		map.put("emp_sex", emp_sex);
		map.put("emp_age",emp_age );
		map.put("emp_depart", emp_depart);
		String successtip = "插入成功！";
		String failuretip = "插入失败！";
		int result = employeeService.addEmployee(map);
		if(result==1) {
			mv.addObject("successtip",successtip);
			mv.setViewName("/add.jsp");
		}else {
			mv.addObject("failuretip",failuretip);
			mv.setViewName("/add.jsp");	
		}
		return mv;	
	}
	
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String emp_id1 = request.getParameter("emp_id");
		int emp_id = Integer.parseInt(emp_id1);
		int result = employeeService.deleteEmployee(emp_id);
		//String successtip = "插入成功！";
		//String failuretip = "插入失败！";
		if(result==1) {
			//mv.addObject("successtip",successtip);
			mv.setViewName("/index.jsp");
		}else {
			//mv.addObject("failuretip",failuretip);
			mv.setViewName("/index.jsp");	
		}
		return mv;
	}
	
	@RequestMapping("/toupdateEmployee")
	public ModelAndView toupdateEmployee(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String emp_id = request.getParameter("emp_id");
		String emp_name = request.getParameter("emp_name");
		String emp_sex = request.getParameter("emp_sex");
		String emp_age = request.getParameter("emp_age");
		String emp_depart = request.getParameter("emp_depart");
		mv.addObject("emp_id",emp_id);
		mv.addObject("emp_name",emp_name);
		mv.addObject("emp_sex",emp_sex);
		mv.addObject("emp_age",emp_age);
		mv.addObject("emp_depart",emp_depart);
		mv.setViewName("/update.jsp");
		return mv;
	}
	
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String emp_id1 = request.getParameter("emp_id");
		int emp_id = Integer.parseInt(emp_id1);
		String emp_name = request.getParameter("emp_name");
		String emp_sex1  = request.getParameter("emp_sex");
		int emp_sex = Integer.parseInt(emp_sex1);
		String emp_age1 = request.getParameter("emp_age");
		int emp_age = Integer.parseInt(emp_age1);
		String emp_depart = request.getParameter("emp_depart");
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("emp_id", emp_id);
		map.put("emp_name",emp_name );
		map.put("emp_sex", emp_sex);
		map.put("emp_age",emp_age );
		map.put("emp_depart", emp_depart);
		
		int result = employeeService.updateEmployee(map);
		String successtip = "插入成功！";
		String failuretip = "插入失败！";
		if(result==1) {
			mv.addObject("successtip",successtip);
			mv.setViewName("/update.jsp");
		}else {
			mv.addObject("failuretip",failuretip);
			mv.setViewName("/update.jsp");	
		}
		return mv;
	}
}
