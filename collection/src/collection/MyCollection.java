package collection;

public class MyCollection implements Collection {

	public String[] string = {"A","B","C","D","E"};
	
	
	@Override
	public Iterator ieterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		
		return string[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return string.length;
	}

}
