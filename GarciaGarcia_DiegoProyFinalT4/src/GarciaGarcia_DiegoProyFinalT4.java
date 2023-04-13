
public class GarciaGarcia_DiegoProyFinalT4 {

	private static final int _3 = 3;
	private static final int _80 = 80;

	public static void main(String[] args) {
		// Recorre el array devuelto por el método averiguarMultiplos de la clas
		// MultiplosDos
		// con un bucle for-each y muestra cada valor por consola
		for (int cadena : MultiplosDos.averiguarMultiplosRefactorizado(_80, _3)) {
			System.out.println(cadena);
		}
		System.out.println("Aquí termina el programa");
	}

}
