package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 来调用容器
 * @author Mr lei
 *
 */
public class BeanTest 
{
	public static void main(String [] args)
	{
		//创建Spring容器
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		//获取Chinese实例
		Person p=ac.getBean("chinese", Person.class);
		//调用跑步的方式方法
		p.runmethod();
	}

}
