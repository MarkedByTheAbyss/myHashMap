public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
