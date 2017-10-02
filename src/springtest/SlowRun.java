package springtest;
/**
 * 定义一个慢跑来继承Run
 * @author leiyuan
 *
 */
public class SlowRun implements Run
{

	@Override
	public String pace() {
		return "你太胖了，跑得太慢了";
	}
	

}
