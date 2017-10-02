package springtest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hibernatetest.BaseDao;

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
		
		//下面的代码用于测试Hibernate
		//获取BaseDao的实例
		BaseDao baseDao = ac.getBean("baseDao",BaseDao.class);
		//创建session
		Session session=baseDao.getSession();
		//创建Person实例
		Transaction tx=session.beginTransaction();
		hibernatetest.Person hp=new hibernatetest.Person();
		//给个属性设置值
		hp.setAge(22);
		hp.setHeight(170);
		hp.setName(" Mr lei");
		hp.setWeight(110);
		//保存
		session.save(hp);
		//提交事务
		tx.commit();
		//关闭sesion
		session.close();
		
		
		
	}


}
