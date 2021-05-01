
public class TestStack {
	public static void main(String[] args) {
		System.out.println("main's start");
		method1();
		System.out.println("main's end");
	}
	private static void method1() {
		System.out.println("method1's start");
		method2();
		System.out.println("method1's end");
	}
	private static void method2() {
		System.out.println("method2's start");
		
		//Employee e = null; 
		//e.setName("Willian");
		
		
		try {
			int[] array = new int[5];
			for( int i = 0; i < 6; i++) {
				array[i]=i;
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Out of bound of array!!! "
			+e.getMessage());
			e.printStackTrace();
		}
		
		//int x = 5;
		//int y = x/0;
		
		System.out.println("method2's end");
	}
}
