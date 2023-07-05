public class main {

	public static void testInt() {
		System.out.println("Print test of Integer");
		myHashMap<Integer, Integer> map = new myHashMap<Integer, Integer>();
		map.add(1, 1);
		map.add(2, 2);
		map.add(3, 3);
		map.add(4, 4);
		map.add(5, 5);
		map.add(6, 6);
		map.add(7, 7);
		map.add(8, 8);
		map.add(9, 9);
		map.add(10, 10);
		map.add(10, 22);
		map.delete(1);
		map.delete(2);
		map.delete(3);
		map.delete(4);
		map.delete(5);
		map.delete(6);
		map.delete(7);
		map.add(1,1233);
		map.print();
	}

	public static void testString() {
		System.out.println("Print test of String");
		myHashMap<String, String> map = new myHashMap<String, String>();
		map.add("asd","qwe");
		map.add("test1","string 1");
		map.add("test234","string 112345");
		map.add("kek","asdfghjsdf");
		map.add("t","stri1");
		map.delete("test1");
		map.add("geg","1234");
		map.add("test234","shrek");
		map.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInt();
		testString();
	}

}
