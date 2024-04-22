import java.time.Instant;

public class CriandoPersonagem {

    static String nome;
    static int idade;
    static String sexo;
    static int id;
    static String classe;
    static long idUnix;

    private static void dados(){

        System.out.print("Nome: ");
        nome = Console.lerString();
        System.out.print("Idade: ");
        idade = Console.lerInt();
        System.out.print("Sexo: ");
        sexo = Console.lerString();
        System.out.print("Classe: ");
        classe = Console.lerString();

        idUnix = Instant.now().getEpochSecond();
        id = (int) (idUnix % 1000000);
    }
    
    public static void criar(int case1) {
        System.out.println("\nCRIANDO PERSONAGEM:");

        switch (case1) {
            case 1:
                System.out.println("\nRAÇA HUMANO:");
                dados();

                Humano humano = new Humano(nome, idade, sexo, id, classe);
                CadastroDePersonagens.cadastrar(humano);

                System.out.println("\nPersonagem Humano Criado com Sucesso!");
                break;

            case 2:                
                System.out.println("\nRAÇA ELFO:");
                dados();

                Elfo elfo = new Elfo(nome, idade, sexo, id, classe);
                CadastroDePersonagens.cadastrar(elfo);

                System.out.println("\nPersonagem Elfo Criado com Sucesso!");
                break;

            case 3:                
                System.out.println("\nRAÇA ANÃO:");
                dados();

                Anao anao = new Anao(nome, idade, sexo, id, classe);
                CadastroDePersonagens.cadastrar(anao);

                System.out.println("\nPersonagem Anão Criado com Sucesso!");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }


    
}
