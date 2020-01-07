package command;

public class MyCommand implements Commond {
	private Receiver receiver;
	
	public MyCommand(Receiver r) {
		this.receiver = r;
	};
	
	@Override
	public void exe() {
		receiver.action();
	}

}
