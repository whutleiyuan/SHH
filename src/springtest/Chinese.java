package springtest;
/**
 * 定义一个中国人实现人的接口
 * @author Mr lei
 *
 */
public class Chinese implements Person
{
	private Run run;
	//Run对象的实例通过设值注入的方式传入
	public void setRun( Run run)
	{
		this.run=run;
	}
	
	@Override
	public void runmethod() 
	{		
		System.out.println(run.pace());
	}

}
