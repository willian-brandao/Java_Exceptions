
public class StackTest2 {

		public static void main(String[] args) {
			System.out.println("main's start");
			try {
				method1();
			}catch(NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
				System.out.println("Error finded "+e.getMessage());
				e.printStackTrace();
				if( e instanceof ArithmeticException )
					System.out.println("We taking with / by zero");
			}
			System.out.println("main's end");
		}
		private static void method1() {
			System.out.println("method1's start");
				method2();
			System.out.println("method1's end");
		}
		private static void method2() {
			Employee e = null; 
			//e.setName("Willian");
			int x = 5;
			double y = 5/0;
			System.out.println("method2's start");
				int[] array = new int[5]; 
				for( int i = 0; i < 6; i++) {
					array[i]=i;
					System.out.println(array[i]);
				}
			System.out.println("method2's end");
		}
	}


