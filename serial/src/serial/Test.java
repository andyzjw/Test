package serial;

public class Test {
	public static void main(String[] args) {
		MyHandler mh1 = new MyHandler("h1");
		MyHandler mh2 = new MyHandler("h2");
		MyHandler mh3 = new MyHandler("h3");
		mh1.setHandler(mh2);
		mh2.setHandler(mh3);
		
		mh1.operator();
		
	}
}
