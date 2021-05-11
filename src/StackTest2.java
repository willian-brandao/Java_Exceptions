public class StackTest2{
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		}catch( NullPointerException | ArrayIndexOutOfBoundsException  | ArithmeticException e) {
			System.out.println("Erro Econtrado. "+e.getMessage());
			e.printStackTrace();
			if( e instanceof ArithmeticException) {
				System.out.println("Estamos lidando com uma divisão por 0");
			}
		}
		System.out.println("Fim main");
	}
	private static void metodo1() {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	private static void metodo2() {
		
		int x = 5;
		double y = x / 0;
		Employee E = null;
		E.setName("Janilton");
		System.out.println("Inicio do metodo 2");
		int[] array = new int[5];
		for( int i = 0; i < 6; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		System.out.println("Fim do metodo 2");
	}
}