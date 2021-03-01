/* 
 - Fomos contactados pela Marvel, para fazermos o cadastro dos Her๓is e Vil๕es do Universo Marvel.
 	
 	CARACTERISTICAS
  	- Numero de Identifica็ใo
    - Nome 
    - Classe (1 - Her๓i ou  2 - Vilใo)
    - Poder Principal
    - Ano de cria็ใo
    - Foi morto pelo Thanos?
 	FUNCIONALIDADES:
  	- Inclusใo do personagem                                     [FEITO]                                      
  	- Consultar personagem                                       [FEITO]
  	- Excluir personagem                                         [FEITO]
  	- Listar TODOS os personagens                                [FEITO]
  	- Listar por Classe de Personagens                           [FEITO]
  	- Listar os personagens que sobreviveram ao estalo do Thanos [FEITO]
 */
import java.util.Scanner;
public class MarvelCharacters {
	static int num = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numIdentificacao = new int[num];
		String[] nome = new String[num];
		boolean[] classe = new boolean[num];
		String[] poderPrincipal = new String[num];
		int[] anoCriacao = new int[num];
		boolean[] thanosMatou = new boolean[num];
		int ultimoIndice = 0;
		int opcao;
		System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
		System.out.println("|             Bem Vindo               |");
		menu();
		System.out.print("Valor: ");
		opcao = sc.nextInt();
		while (opcao != 7) {

			switch (opcao) {
			case 1:
				ultimoIndice = addHero(sc, ultimoIndice, numIdentificacao, nome, classe, poderPrincipal, anoCriacao,
						thanosMatou);
				break;
			case 2:
				consultarPorID(sc, ultimoIndice, numIdentificacao, nome, classe, poderPrincipal, anoCriacao,
						thanosMatou);

				break;
			case 3:
				removerPersonagem(sc, ultimoIndice, numIdentificacao, nome, classe, poderPrincipal, anoCriacao,
						thanosMatou);
				break;
			case 4:
				listarTodosPersonagens(ultimoIndice, nome, numIdentificacao);
				break;
			case 5:
				listarPorClasse(ultimoIndice, nome, classe);
				break;
			case 6:
				listarSobreviventes(ultimoIndice, nome, thanosMatou);
				break;
			default:
				break;
			}
			menu();
			opcao = sc.nextInt();
		}
		sc.close();

	}

	private static void listarSobreviventes(int ultimoIndice, String[] nome, boolean[] thanosMatou) {
		System.out.println("จจจจจจจจจ  Sobreviventes  จจจจจจจจจ ");
		for (int i = 0; i < ultimoIndice; i++) {
			if (thanosMatou[i] == false) {
				System.out.println("Nome: "+ nome[i]);
			}
		}
		
	}

	private static void listarPorClasse(int ultimoIndice, String[] nome, boolean[] classe) {
		System.out.println("จจจจจจจจจ  Heroi  จจจจจจจจจ ");
		for (int i = 0; i < ultimoIndice; i++) {
			if (classe[i] == true) {
				System.out.println("Nome: " +nome[i]);
			}
		}
		System.out.println("จจจจจจจจจ  Vilใo  จจจจจจจจจ ");
		for (int i = 0; i < ultimoIndice; i++) {
			if (classe[i] == false) {
				System.out.println("Nome: " +nome[i]);
			}
		}
		
	}

	private static void removerPersonagem(Scanner sc, int ultimoIndice, int[] numIdentificacao, String[] nome,
			boolean[] classe, String[] poderPrincipal, int[] anoCriacao, boolean[] thanosMatou) {
		int idSelecionada;
		System.out.print("Digite a ID do personagem a ser excluida: ");
		idSelecionada = sc.nextInt();
		int flag = achaPosicao(idSelecionada, numIdentificacao, ultimoIndice);
		if (flag != -1) {
			System.out.println("Personagem removido [ "+ nome[flag]+" ]");
			for (int i = flag; i <  ultimoIndice; i++) {
				numIdentificacao[i] = numIdentificacao[i+1]; 
				nome[i] = nome[i+1]; 
				classe[i] = classe[i+1]; 
				poderPrincipal[i] = poderPrincipal[i+1]; 
				anoCriacao[i] = anoCriacao[i+1]; 
			}
			 ultimoIndice--;
		} else {
			System.out.println("ID do Personagem nใo encontrada");
		}
		
	}

	private static int addHero(Scanner sc, int ultimoIndice, int[] numIdentificacao, String[] nome, boolean[] classe,
			String[] poderPrincipal, int[] anoCriacao, boolean[] thanosMatou) {
		int numberId, yearCreated;
		String nick, mainPower;
		boolean klass, killedByThanos;
		// klass true=heroi | false = vilao
		System.out.println("Digite o numero de identificacao:");
		numberId = sc.nextInt();
		System.out.println("Digite o nome do personagem:");
		sc.nextLine();
		nick = sc.nextLine();

		System.out.println("Digite a classe do personagem [ 1 - Heroi | 2 - Vilao ]:");
		int resultClasse = sc.nextInt();
		while (resultClasse != 1 && resultClasse != 2) {
			System.out.println("Valor incorreto");
			System.out.println("Digite a classe do personagem 1 - Heroi | 2 - Vilao:");
			resultClasse = sc.nextInt();
		}
		if (resultClasse == 1) {
			klass = true; // heroi
		} else {
			klass = false; // vilao
		}
		System.out.println("Digite o poder principal:");
		sc.nextLine();
		mainPower = sc.nextLine();

		System.out.println("Digite o ano de cria็ao:");
		yearCreated = sc.nextInt();
		System.out.println("Thanos matou? 1- True 2- False ]:");
		int resultKilledByThanos = sc.nextInt();
		while (resultKilledByThanos < 1 && resultKilledByThanos != 2) {
			System.out.println("Valor incorreto");
			System.out.println("Digite a classe do personagem 1 - Heroi | 2 - Vilao:");
			resultKilledByThanos = sc.nextInt();
		}
		if (resultKilledByThanos == 1) {
			killedByThanos = true; // heroi
		} else {
			killedByThanos = false; // vilao
		}


		numIdentificacao[ultimoIndice] = numberId;
		nome[ultimoIndice] = nick;
		classe[ultimoIndice] = klass;
		poderPrincipal[ultimoIndice] = mainPower;
		anoCriacao[ultimoIndice] = yearCreated;
		thanosMatou[ultimoIndice] = killedByThanos;

		System.out.println("O personagem " + nome[ultimoIndice] + " ID: " + numIdentificacao[ultimoIndice] + " Classe: "
				+ classe[ultimoIndice] + " poderPrincipal: " + poderPrincipal[ultimoIndice] + " ano de criacao: "
				+ anoCriacao[ultimoIndice] + " thanos matou: " + thanosMatou[ultimoIndice]);

		ultimoIndice++;
		return ultimoIndice;
	}

	public static void consultarPorID(Scanner sc, int ultimoIndice, int[] numIdentificacao, String[] nome, boolean[] classe, String[] poderPrincipal, int[] anoCriacao, boolean[] thanosMatou) {
		int idSelecionada;
		System.out.println("Digite a ID do personagem para ser consultado(a)");
		idSelecionada = sc.nextInt();
		int flag = achaPosicao(idSelecionada, numIdentificacao, ultimoIndice);
		if (flag != -1) {
			System.out.print("Exibindo INFO do Personagem [ "+ nome[flag]+ " ]");
			System.out.println("\n ID: "+numIdentificacao[flag]+ 
					"\n Classe: "+classe[flag]+"\n Poder Principal: "+poderPrincipal[flag]+
					"\n Ano de cria็ใo: "+anoCriacao[flag]+"\n Foi morto por Thanos: "+ thanosMatou[flag]);
		}else {
			//valida็ao
			int optionBackForward;
			System.out.println("ID nใo identificada");
			System.out.println("1 - Voltar para o menu principal \n 2 - Tentar novamente");
			optionBackForward = sc.nextInt();
			while (optionBackForward != 1 || optionBackForward != 2) {
				if (optionBackForward == 1) {
					menu();
				} else if(optionBackForward == 2) {
					consultarPorID(sc, ultimoIndice, numIdentificacao, nome, classe, poderPrincipal, anoCriacao,
							thanosMatou);
				}
				System.out.print("Valor invalido, digite novamente: ");
				optionBackForward = sc.nextInt();
				break;
			}
		}
	}
	
	public static int achaPosicao(int idPersonagem, int[] numIdentificacao, int ultimoIndice) {
		for (int i = 0; i < ultimoIndice; i++) {
			if (idPersonagem == numIdentificacao[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void listarTodosPersonagens(int ultimoIndice, String[] nome, int[] numIdentificacao) {
		for (int i = 0; i < ultimoIndice; i++) {
			System.out.println("Nome:" + nome[i] + " ID:" + numIdentificacao[i]);
		}
	}

	public static void menu() {
		System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
		System.out.println("|          O que deseja fazer?        |");
		System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ");
		System.out.println("1 - Adicionar um personagem           |");
		System.out.println("2 - Consultar um personagem           |");
		System.out.println("3 - Excluir personagem                |");
		System.out.println("4 - Listar todos os personagem        |");
		System.out.println("5 - Listar personagem por classe      |");
		System.out.println("6 - Listar sobreviventes ao Thanos    |");
		System.out.println("7 - Sair                              |");
	}
}
