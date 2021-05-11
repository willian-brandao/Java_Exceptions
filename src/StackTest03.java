
public class StackTest03 {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fim main");
	}

	public static void metodo1() {
		System.out.println("Inicio do metodo 1");
		try {
			metodo2();
		} catch (MyException e) {
			System.err.println("Erro Encontrado. " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do metodo 1");
	}

	public static void metodo2() {
		Employee E = null;
		// E.setName("Firmino");
		int x = 5;
		int y = 0;

		if (y == 0) {
			MyException ex = new MyException("MyException: O denominador é 0");
			throw ex;
		} else {
			double z = (x / y);
		}
		System.out.println("Inicio do metodo 2");

		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		System.out.println("Fim do metodo 2");
	}
}
