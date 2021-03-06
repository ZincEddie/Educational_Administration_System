package com.system.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.system.po.Course;
import com.system.po.Selectedcourse;
import com.system.po.ShowPage;
import com.system.po.StudentCustom;
import com.system.po.StudentGrade;
import com.system.po.User;
import com.system.service.ICourseService;
import com.system.service.ISelectCourseService;
import com.system.service.IStudentService;
import com.system.service.ITeacherService;

/**
 * 教师功能操作
 * @author zincpool
 *
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private ICourseService iCourseService;
	@Autowired
	private ISelectCourseService iSelectCourseService;
	@Autowired
	private IStudentService iStudentService;
	@Autowired
	private ITeacherService iTeacherServive;
	
	//教师课程信息显示
	@RequestMapping("/showCourse")
	public String showCourse(@RequestParam(defaultValue="1",name="page") Integer pageNum,
			Model model,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		ShowPage<Course> page = iCourseService.findCourseByTeacherid(pageNum, user.getUserId());
		page.setAction(request.getContextPath());
		model.addAttribute("pageInfo", page);
		return "teacher/showCourse";
	}
	
	//教师课程信息查询
	@RequestMapping(value = {"/selectCourse"})
	public String findCourseByIdAndName(@RequestParam(defaultValue="1",name="page") Integer pageNum,@RequestParam(name="findByName",required=false)String findByName,
			Model model,HttpServletRequest request) {
		if(pageNum == 1 && findByName != null && !"".equals(findByName)) {
			request.getSession().setAttribute("search", findByName);
		}
		if(findByName == null || "".equals(findByName)) {
			findByName = request.getSession().getAttribute("search").toString();
		}
		User user = (User) request.getSession().getAttribute("user");
		ShowPage<Course> page = iCourseService.findCourseByTeacheridAndName(pageNum, user.getUserId(), findByName);
		page.setAction(request.getContextPath());
		model.addAttribute("pageInfo", page);
		return "teacher/showCourse";
	}
	
	//跳转教授课程的学生列表页面
	@RequestMapping("/gradeCourse")
	public String showGradeCourseUI(@RequestParam(defaultValue="1",name="page") Integer pageNum,@RequestParam("id")Integer courseid,
			Model model,HttpServletRequest request) {
		ShowPage<StudentGrade> page = iSelectCourseService.getStudentGradeByCourseId(pageNum, courseid);
		page.setAction(request.getContextPath());
		model.addAttribute("pageInfo", page);
		return "teacher/showGrade";
	}
	
	//跳转成绩打分页面
	@RequestMapping(value = "/mark", method = RequestMethod.GET)
	public String showMarkUI(@RequestParam("studentid")String id,@RequestParam("courseid")Integer courseid,Model model) {
		StudentCustom sc = iStudentService.findStudentById(id);
		model.addAttribute("studentInfo", sc);
		model.addAttribute("courseid", courseid);
		return "teacher/mark";
	}
	
	//给选修课程的学生成绩打分
	@RequestMapping(value = "/mark", method = RequestMethod.POST)
	public String mark(Selectedcourse sc,Model model) {
		iSelectCourseService.updateSelectedcourse(sc);
		return "redirect:/teacher/gradeCourse?id="+sc.getCourseid();
	}
	
	//跳转教师密码修改页面
	@RequestMapping(value = "/passwordRest", method = RequestMethod.GET)
	public String showPasswordRestUI() {
		return "teacher/passwordRest";
	}
	
	//教师密码修改操作
	@RequestMapping(value = "/passwordRest", method = RequestMethod.POST)
	public String doPasswordRest(@RequestParam("oldPassword")String oldPassword,@RequestParam("password1")String newPassword,
			HttpServletRequest request,Model model) {
		User user = (User) request.getSession().getAttribute("user");
		if(!user.getPassword().equals(oldPassword)) {
			model.addAttribute("fail", "旧密码不正确");
			return "teacher/passwordRest";
		}
		iTeacherServive.updateTeacherPassword(user.getUserId(), newPassword);
		model.addAttribute("success", "修改成功");
		return "redirect:/logout";
	}
}
