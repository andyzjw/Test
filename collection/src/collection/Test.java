package collection;

public class Test {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		
		System.out.println(collection.size());
		
		Iterator iter = collection.ieterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
