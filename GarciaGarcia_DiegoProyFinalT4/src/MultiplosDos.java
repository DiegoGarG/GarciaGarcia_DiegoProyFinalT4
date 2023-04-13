
public class MultiplosDos {

	private static int[] multiplos;

	/**
	 * Devuelve un array de enteros que contiene los múltiplos de 2 en el rango
	 * especificado
	 * @param fin    el último número del rango (debe ser mayor o igual a inicio y
	 *               menor o igual a 999)
	 * @param inicio el primer número del rango (debe ser mayor o igual a 0 y menor
	 *               o igual a 999)
	 *
	 * @return un array de enteros que contiene los múltiplos de 2 en el rango
	 *         especificado
	 * @throws IllegalArgumentException si alguno de los parámetros introducidos
	 *                                  produce una incoherencia (1 - 999)
	 */
	public static int[] averiguarMultiplosRefactorizado(int fin, int inicio) {
		// Calcular la diferencia entre fin e inicio
		int diff1 = fin - inicio;
		// Si la diferencia es negativa, lanzar una excepción
		String excepcion = "Alguno de los parametros introducidos produce una incoherencia(1 - 999)";
		if (diff1 < 0) {
			throw new IllegalArgumentException(
					excepcion);
		} // Si el inicio es negativo, lanzar una excepción
		else if (inicio < 0) {
			throw new IllegalArgumentException(
					excepcion);
		}
		int diff = diff1;
		// Calcular la cantidad de múltiplos de 2 en el rango especificado
		int count = diff / 2 + 1;
		setMultiplos(new int[count]);
		// Índice utilizado para agregar los múltiplos al array
		int index = 0;
		// Recorrer el rango especificado y agregar los múltiplos de 2 al array
		for (int i = inicio; i <= fin; i++) {
			if (i % 2 == 0) {
				getMultiplos()[index++] = i;
			}
		}
		// Devolver el array con los múltiplos de 2 encontrados
		return getMultiplos();
	}

	private static int[] getMultiplos() {
		return multiplos;
	}

	private static void setMultiplos(int[] multiplos) {
		MultiplosDos.multiplos = multiplos;
	}

}
