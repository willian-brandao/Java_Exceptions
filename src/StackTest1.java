
public class StackTest1 {
	public static void main(String[] args) {
		System.out.println("main's start");
		method1();
		System.out.println("main's end");
	}
	private static void method1() {
		System.out.println("method1's start");
		try {
			method2();
		
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Out of bound of array!!! "
		+e.getMessage());
		e.printStackTrace();
	}
	
		System.out.println("method1's end");
	}
	private static void method2() {
		System.out.println("method2's start");
		
		//Employee e = null; 
		//e.setName("Willian");
		
		
		
			int[] array = new int[5]; 
			for( int i = 0; i < 6; i++) {
				array[i]=i;
				System.out.println(array[i]);
			}
		
		//int x = 5;
		//int y = x/0;
		
		System.out.println("method2's end");
	}
}
