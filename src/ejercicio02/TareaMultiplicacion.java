package ejercicio02;

public class TareaMultiplicacion implements Runnable {

	private int[][] A;
	private int[][] B;
	private int[][] C;
	private long fila;
	private long columna;

	public TareaMultiplicacion(int[][] A, int[][] B, int[][] C, long fila, long columna) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.fila = fila;
		this.columna = columna;
	}

	@Override
	public void run() {
		int suma = 0;
		for (int k = 0; k < A.length; k++) {

		}

	}

}
