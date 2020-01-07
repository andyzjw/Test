package command;

public class Invoker {
	private Commond comm;
	
	public Invoker(Commond cc) {
		this.comm = cc;
	}
	
	public void action() {
		comm.exe();
	}
	
}
