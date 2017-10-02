package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	}

}
