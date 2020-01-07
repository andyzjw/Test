package command;

public class Test {
	public static void main(String[] args) {
		Receiver re = new Receiver();
		Commond comm = new MyCommand(re);
		
		Invoker in = new Invoker(comm);
		
		in.action();
		
	}
}
