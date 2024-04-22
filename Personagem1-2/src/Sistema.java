public class Sistema {

    public static void executar() {
        int opccao;

        do {

            menu();
            opccao = Console.lerInt();
            verificarOpcao(opccao);

        } while (opccao != 0);
    }

    private static void menu() {

        System.out.println("\nMENU DE PERSONAGENS");
        System.out.println("1) Criar Personagem");
        System.out.println("2) Buscar Personagem");
        System.out.println("3) Editar Personagem");
        System.out.println("4) Excluir Personagem");
        System.out.println("5) Listar Personagens");
        System.out.println("6) Apagar Todos os Personagens");
        System.out.println("0) Sair");
        System.out.print("Informe uma Opção: ");
    }

    private static void verificarOpcao(int opccao) {
        int id;

        switch (opccao) {

            case 1:

                System.out.println("\nESCOLHA UMA RAÇA:");
                System.out.println("1) Humano");
                System.out.println("2) Elfo");
                System.out.println("3) Anão");
                System.out.println("0) Voltar");
                System.out.print("Informe uma Opção: ");
                int case1 = Console.lerInt();
                if (case1 == 0){break;}
                CriandoPersonagem.criar(case1);
                break;

            case 2:

                System.out.println("\nBUSCAR PERSONAGEM");
                System.out.print("Informe o ID do Personagem: ");
                id = Console.lerInt();

                for (Personagem tempPers : CadastroDePersonagens.getListaPersonagens()) {
                    if (tempPers.getId() == id){
                        System.out.println("\nPersonagem encontrado:");
                        System.out.println(tempPers);
                        return;
                    }
                }
                System.out.println("\nPersonagem do ID " + id + " não localizado");
                break;

            case 3:

                System.out.println("\nEDITAR PERSONAGEM");
                System.out.print("Informe o ID do Personagem: ");
                id = Console.lerInt();
        
                Personagem personagem = null;
                for (Personagem tempPers : CadastroDePersonagens.getListaPersonagens()) {
                    if (tempPers.getId() == id) {
                        personagem = tempPers;
                        break;
                    }
                }
        
                if (personagem == null) {
                    System.out.println("\nPersonagem do ID " + id + " não encontrado.");
                    return;
                }
        
                System.out.println("\nPersonagem encontrado:");
                System.out.println(personagem);
        
                System.out.println("\nDigite as novas informações do personagem:");
                System.out.print("Nome: ");
                String nome = Console.lerString();
                personagem.setNome(nome);
        
                if (personagem instanceof Humano) {
                    System.out.print("Classe: ");
                    String classe = Console.lerString();
                    ((Humano) personagem).setClasse(classe);
                } else if (personagem instanceof Elfo) {
                    System.out.print("Classe: ");
                    String classe = Console.lerString();
                    ((Elfo) personagem).setClasse(classe);
                } else if (personagem instanceof Anao) {
                    System.out.print("Classe: ");
                    String classe = Console.lerString();
                    ((Anao) personagem).setClasse(classe);
                }
        
                System.out.println("\nPersonagem editado com sucesso!");            
                break;

            case 4:

                System.out.println("\nEXCLUIR PEROSNAGEM");
                System.out.print("Informe o ID do Personagem: ");
                id = Console.lerInt();

                if (CadastroDePersonagens.excluir(id)){
                    System.out.println("\nPersonagem foi excluído com sucesso!");
                } else {
                    System.out.println("\nPersonagem " + id + " não localizado no cadastro");
                }
                break;

            case 5:

                System.out.println("\nLISTAR PERSONAGENS:");
                System.out.println("1) Listar Todos os Personagens");
                System.out.println("2) Listar Humanos");
                System.out.println("3) Listar Elfos");
                System.out.println("4) Listar Anões");
                System.out.println("0) Voltar");
                System.out.print("Informe uma Opção: ");
                int case5 = Console.lerInt();
                if (case5 == 0){break;}
                listarOpccaoCase5(case5);
                break;

            case 6:

                CadastroDePersonagens.resetarLista();
                break;

            case 0:

                System.out.println("\nO Sistema foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

        System.out.println();
    }

    private static void listarOpccaoCase5(int case5){

        switch (case5) {
            case 1:

                if (CadastroDePersonagens.getListaPersonagens().size() == 0) {
                    System.out.println("\nNão há Personagens criados...");
                    break;
                }
            
                System.out.println("\nTODOS OS PERSONAGENS CRIADOS:");
                for (Personagem tempPersonagem : CadastroDePersonagens.getListaPersonagens()) {
                    System.out.println(tempPersonagem);
                }
                break;

            case 2:

                if(CadastroDePersonagens.getHumanos().size() == 0){
                    System.out.println("\nNão há Humanos criados...");
                    break;
                }
                System.out.println("\nHUMANOS CRIADOS:");
                for(Personagem tempHumanos : CadastroDePersonagens.getHumanos()){
                    System.out.println(tempHumanos);
                }
                break;

            case 3:

                if(CadastroDePersonagens.getElfos().size() == 0){
                    System.out.println("\nNão há Elfos criados...");
                    break;
                }

                System.out.println("\nELFOS CRIADOS:");
                for(Personagem tempElfos : CadastroDePersonagens.getElfos()){
                    System.out.println(tempElfos);
                }
                break;

            case 4:

                if(CadastroDePersonagens.getAnoes().size() == 0){
                    System.out.println("\nNão há Anões criados...");
                    break;
                }

                System.out.println("\nANÕES CRIADOS:");
                for(Personagem tempAnoes : CadastroDePersonagens.getAnoes()){
                    System.out.println(tempAnoes);
                }
                break;
        
            default:
            
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }
    
}
