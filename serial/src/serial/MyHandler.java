package serial;

public class MyHandler extends AbstractHandler implements Handler{

	private String name;
	
	public MyHandler (String name) {
		this.name  = name;
	}
	
	@Override
	public void operator() {
		System.out.println(this.name+"开始运行啦！");
		if(this.getHandler() != null) {
			this.getHandler().operator();
		}else {
			System.out.println("结束啦");
		}
	}

}
