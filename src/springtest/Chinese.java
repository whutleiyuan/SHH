package springtest;
/**
 * ����һ���й���ʵ���˵Ľӿ�
 * @author Mr lei
 *
 */
public class Chinese implements Person
{
	private Run run;
	//Run�����ʵ��ͨ����ֵע��ķ�ʽ����
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
