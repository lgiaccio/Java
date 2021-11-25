import java.util.Random;
import java.util.Scanner;

public class SPRINt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int qtdt;
		int[] notas = new int[3];

		System.out.print("Digite a quantidade de Equipes >>> ");
		qtdt = teclado.nextInt();

		String[] times = new String[qtdt];
		int[] disputa = new int[qtdt];
		int[] design = new int[qtdt];
		String[] podium = new String[] { "Primeiro Lugar", "Segundo Lugar", "Terceiro Lugar" };

		System.out.println("--------------------------");
		nometimes(times);
		System.out.println("---------------------------------");
		designes(design, times);
		System.out.println("\nTodos Contra todos");
		allxall(disputa, times, design);
		System.out.println("------------------------");
		System.out.println("\nTabela de resultados");
		tabela(disputa, times, design);
		tabela1(disputa, times, design);
		System.out.println("-----------------------");
		System.out.println("Final");

		podium(notas, times, design, podium);
		tabela2(notas, times, design);
		podiumprint(notas, times, design, podium);

	}

	private static void tabela2(int[] notas, String[] times, int[] design) {
		int conta;
		String contador;
		if (design.length == 2) {
			for (int i = 0; i < 2; i++) {
				for (int j = i + 1; j < 2; j++) {
					if (notas[i] < notas[j]) {
						conta = design[i];
						design[i] = design[j];
						design[j] = conta;
						conta = notas[i];
						notas[i] = notas[j];
						notas[j] = conta;
						contador = times[i];
						times[i] = times[j];
						times[j] = contador;
					}
					if (notas[i] == notas[j]) {
						if (design[i] < design[j]) {
							conta = design[i];
							design[i] = design[j];
							design[j] = conta;
							conta = notas[i];
							notas[i] = notas[j];
							notas[j] = conta;
							contador = times[i];
							times[i] = times[j];
							times[j] = contador;
						}
					}
				}
			}

		} else {
			for (int i = 0; i < notas.length; i++) {
				for (int j = i + 1; j < notas.length; j++) {
					if (notas[i] < notas[j]) {
						conta = design[i];
						design[i] = design[j];
						design[j] = conta;
						conta = notas[i];
						notas[i] = notas[j];
						notas[j] = conta;
						contador = times[i];
						times[i] = times[j];
						times[j] = contador;
					}
					if (notas[i] == notas[j]) {
						if (design[i] < design[j]) {
							conta = design[i];
							design[i] = design[j];
							design[j] = conta;
							conta = notas[i];
							notas[i] = notas[j];
							notas[j] = conta;
							contador = times[i];
							times[i] = times[j];
							times[j] = contador;
						}
					}
				}
			}
		}

	}

	private static void podiumprint(int[] notas, String[] times, int[] design, String[] podium) {
		System.out.println("---------");
		System.out.println("PODIUM");
		if (design.length == 2) {
			for (int i = 0; i < design.length; i++) {
				System.out.printf("%s : %s %d pontos , Design :%d ", podium[i], times[i], notas[i], design[i]);
				System.out.println();
			}
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.printf("%s : %s %d pontos , Design :%d ", podium[i], times[i], notas[i], design[i]);
				System.out.println();
			}
		}

	}

	private static void tabela1(int[] disputa, String[] times, int[] design) {
		for (int i = 0; i < disputa.length; i++) {
			System.out.printf("%s : %d - design: %d", times[i], disputa[i], design[i]);
			System.out.println();
		}

	}

	public static void podium(int[] notas, String[] times, int[] design, String[] podium) {
		Random gerador = new Random();
		System.out.println("------------------");
		int not1, not2;

		if (design.length == 2) {
			for (int i = 0; i < 2; i++) {
				for (int j = i + 1; j < 2; j++) {
					not1 = gerador.nextInt(10) + 1;
					not2 = gerador.nextInt(10) + 1;
					System.out.println(String.format("%s %d x %d %s", times[i], not1, not2, times[j]));
					if (not1 == not2) {
						if (design[i] > design[j]) {
							System.out.printf("Vitória por desempate,'%s' venceu", times[i]);
							notas[i] += 1;
						} else {
							System.out.printf("Vitória por desempate,'%s' venceu", times[j]);
							notas[j] += 1;
						}
					} else if (not1 > not2) {
						System.out.println("Vitória do(a) >> " + times[i]);
						notas[i] += 2;
					} else {
						System.out.println("Vitória do(a) >> " + times[j]);
						notas[j] += 2;
					}
					System.out.println("\n");
				}
			}
		} else {
			for (int i = 0; i < 3; i++) {
				for (int j = i + 1; j < 3; j++) {
					not1 = gerador.nextInt(10) + 1;
					not2 = gerador.nextInt(10) + 1;
					System.out.println(String.format("%s %d x %d %s", times[i], not1, not2, times[j]));
					if (not1 == not2) {
						if (design[i] > design[j]) {
							System.out.printf("Vitória por desempate,'%s' venceu", times[i]);
							notas[i] += 1;
						} else {
							System.out.printf("Vitória por desempate,'%s' venceu", times[j]);
							notas[j] += 1;
						}
					} else if (not1 > not2) {
						System.out.println("Vitória do(a) >> " + times[i]);
						notas[i] += 2;
					} else {
						System.out.println("Vitória do(a) >> " + times[j]);
						notas[j] += 2;
					}
					System.out.println("\n");

				}
			}

		}

	}

	public static void tabela(int[] disputa, String[] times, int[] design) {
		int conta;
		String contador;
		if (disputa.length == 2) {
			for (int i = 0; i < 2; i++) {
				for (int j = i + 1; j < 2; j++) {
					if (disputa[i] < disputa[j]) {
						conta = design[i];
						design[i] = design[j];
						design[j] = conta;
						conta = disputa[i];
						disputa[i] = disputa[j];
						disputa[j] = conta;
						contador = times[i];
						times[i] = times[j];
						times[j] = contador;
					}
					if (disputa[i] == disputa[j]) {
						if (design[i] < design[j]) {
							conta = design[i];
							design[i] = design[j];
							design[j] = conta;
							conta = disputa[i];
							disputa[i] = disputa[j];
							disputa[j] = conta;
							contador = times[i];
							times[i] = times[j];
							times[j] = contador;
						}
					}
				}
			}
		} else {
			for (int i = 0; i < disputa.length; i++) {
				for (int j = i + 1; j < disputa.length; j++) {
					if (disputa[i] < disputa[j]) {
						conta = design[i];
						design[i] = design[j];
						design[j] = conta;
						conta = disputa[i];
						disputa[i] = disputa[j];
						disputa[j] = conta;
						contador = times[i];
						times[i] = times[j];
						times[j] = contador;
					}
					if (disputa[i] == disputa[j]) {
						if (design[i] < design[j]) {
							conta = design[i];
							design[i] = design[j];
							design[j] = conta;
							conta = disputa[i];
							disputa[i] = disputa[j];
							disputa[j] = conta;
							contador = times[i];
							times[i] = times[j];
							times[j] = contador;
						}
					}
				}
			}
		}
	}

	public static void allxall(int[] disputa, String[] times, int[] design) {
		Random gerador = new Random();
		System.out.println("------------------");
		int not1, not2;
		for (int i = 0; i < disputa.length; i++) {
			for (int j = i + 1; j < disputa.length; j++) {
				not1 = gerador.nextInt(10) + 1;
				not2 = gerador.nextInt(10) + 1;
				System.out.println(String.format("%s %d x %d %s", times[i], not1, not2, times[j]));
				if (not1 == not2) {
					if (design[i] > design[j]) {
						System.out.printf("Vitória por desempate,'%s' venceu", times[i]);
						disputa[i] += not1;
						System.out.println();
					} else {
						System.out.printf("Vitória por desempate,'%s' venceu", times[j]);
						disputa[j] += not2;
						System.out.println();
					}
				} else if (not1 > not2) {
					System.out.println("Vitória do(a) >> " + times[i]);
					disputa[i] += not1;
				} else {
					System.out.println("Vitória do(a) >> " + times[j]);
					disputa[j] += not2;
				}
				System.out.println("\n");
			}
		}

	}

	public static void designes(int[] design, String[] times) {
		Scanner teclado = new Scanner(System.in);
		int notad = 0;
		boolean test = false;
		// System.out.println("eu to saindo?");
		for (int i = 0; i < design.length; i++) {

			while (test == false) {

				System.out.printf("Digite a Nota do design do time: '%s' >>> ", times[i]);
				notad = teclado.nextInt();
				if (notad < 0 || notad > 10) {
					System.out.println("Digite uma nota válida !!!");
					notad = 0;
					test = false;
					System.out.println();
				} else {
					design[i] = notad;
					test = true;
				}
			}
			test = false;
		}

	}

	public static void nometimes(String[] times) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < times.length; i++) {
			System.out.printf("Escreva o nome do time >>> ");
			times[i] = teclado.nextLine();
		}

	}
}
