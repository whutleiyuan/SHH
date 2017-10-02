package springtest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hibernatetest.BaseDao;

/**
 * ����������
 * @author Mr lei
 *
 */
public class BeanTest 
{
	public static void main(String [] args)
	{
		//����Spring����
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		//��ȡChineseʵ��
		Person p=ac.getBean("chinese", Person.class);
		//�����ܲ��ķ�ʽ����
		p.runmethod();
		
		//����Ĵ������ڲ���Hibernate
		//��ȡBaseDao��ʵ��
		BaseDao baseDao = ac.getBean("baseDao",BaseDao.class);
		//����session
		Session session=baseDao.getSession();
		//����Personʵ��
		Transaction tx=session.beginTransaction();
		hibernatetest.Person hp=new hibernatetest.Person();
		//������������ֵ
		hp.setAge(22);
		hp.setHeight(170);
		hp.setName(" Mr lei");
		hp.setWeight(110);
		//����
		session.save(hp);
		//�ύ����
		tx.commit();
		//�ر�sesion
		session.close();
		
		
		
	}


}
