
public class StackTest1 {
	
	public static void main(String[] args) {
		System.out.println("Main's Start");
			method1();
		System.out.println("Main's End");
	}
	private static void method1() {
		System.out.println("Methd1's Start");
			method2();
		System.out.println("Method1's End");
	}
	private static void method2() {
		Employee f = null;
		try {
			f.setName("Rafael");
			System.out.println("Method2's Start");
			
				int[] array = new int[5];
				for(int i = 0; i < 6; i++) {
					array[i] = i;
					System.out.println(array[i]);
				}
		}catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("ultrapassing array's limit. "+e.getMessage());
			
		}catch( NullPointerException e) {
			System.out.println("NULL Reference");
		}
		System.out.println("Method2's End");
	}
}

