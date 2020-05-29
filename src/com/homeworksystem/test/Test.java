package com.homeworksystem.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.homeworksystem.bean.Homework;
import com.homeworksystem.service.CourseService;
import com.homeworksystem.service.CurriculaVariableService;
import com.homeworksystem.service.HomeworkService;
import com.homeworksystem.service.QuestionService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ioc=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		CourseService bean = ioc.getBean(CourseService.class);
//		System.out.println(bean.selectAll());
//		CurriculaVariableService bean = ioc.getBean(CurriculaVariableService.class);
//		System.out.println(bean.selectByPrimaryKey("17030110101", ""+1));
//		System.out.println(bean.selectByStudentId("17030110101"));
//		QuestionService bean = ioc.getBean(QuestionService.class);
//		System.out.println(bean.selectByCourseId(1));
//		System.out.println(bean.selectByStudentId("17030110101"));
//		HomeworkService bean = ioc.getBean(HomeworkService.class);
//		System.out.println(bean.selectScore(new Integer(1).toString(),"17030110101"));
//		QuestionService bean = ioc.getBean(QuestionService.class);
//		System.out.println(bean.selectByStudentId("17030110101"));
//		CourseService bean = ioc.getBean(CourseService.class);
//		System.out.println(bean.selectByTeacherId("156678"));
//		CurriculaVariableService bean = ioc.getBean(CurriculaVariableService.class);
//		System.out.println(bean.selectByCourseId("1"));
//		QuestionService bean = ioc.getBean(QuestionService.class);
//		System.out.println(bean.selectByCourseId(3));
//		HomeworkService bean = ioc.getBean(HomeworkService.class);
//		bean.updateScore("8", "10001","99");
//		HomeworkService bean = ioc.getBean(HomeworkService.class);
//		System.out.println(bean.selectByQuestionId("8").size());
//		System.out.println();
//		QuestionService bean = ioc.getBean(QuestionService.class);
//		System.out.println(bean.selectByCourseId(8));
//		SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间 
//        sdf.applyPattern("yyyy-MM-dd");
//		Date current=new Date();
//		String time=sdf.format(current);
//		String[] part=time.split("-");
//		int year=Integer.parseInt(part[0]);
//		int month=Integer.parseInt(part[1]);
//		int day=Integer.parseInt(part[2]);
//		List<Integer> years=Arrays.asList(year,year+1,year+2);
//		List<Integer> months=new ArrayList<Integer>();
//		day+=10;
//		for(int i=0;i<12;i++)
//			months.add(month>12?(month++)-12:month++);
//		List<Integer> days=new ArrayList<Integer>();
//		for(int i=0;i<31;i++)
//			days.add(day>31?(day++)-31:day++);
//		
//		
//		years.stream().forEach( y -> System.out.print(" "+y));
//		System.out.println();
//		months.stream().forEach( m -> System.out.print(" "+m));
//		System.out.println();
//		days.stream().forEach( d -> System.out.print(" "+d));
//		System.out.println();
		HomeworkService bean = ioc.getBean(HomeworkService.class);
		List<Homework> homeworks=new ArrayList<Homework>();
		homeworks.add(new Homework("17030110101",8, null,null,"",100));
		homeworks.add(new Homework("1",8, null,null,"",99));
		homeworks.add(new Homework("2",8, null,null,"",100));
		homeworks.add(new Homework("3",8, null,null,"",12));
		homeworks.add(new Homework("4",8, null,null,"",2));
		bean.updateRepeatability(homeworks);
		System.out.println("ok");
	}

}
