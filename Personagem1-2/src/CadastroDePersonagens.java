import java.util.ArrayList;
import java.util.List;

public class CadastroDePersonagens {

    private static List<Personagem> listaPersonagens = new ArrayList<>();

    public static void cadastrar (Personagem var) {
        listaPersonagens.add(var);
    }

    public static List<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    public static boolean excluir(int id) {

        for (Personagem tempPersonagem : listaPersonagens){
            if (tempPersonagem.getId() == id) {
                listaPersonagens.remove(tempPersonagem);
                return true;
            }
        }

        return false;

    }

    public static void resetarLista(){
        listaPersonagens.clear();

        System.out.println("\nBanco de Dados Resetado com Sucesso!");
    }

    public static List<Personagem> getAnoes(){
        List<Personagem> tempListAnoes = new ArrayList<>();

        for(Personagem tempAnoes : listaPersonagens){
            if(tempAnoes instanceof Anao){
                tempListAnoes.add(tempAnoes);
            }
        }

        return tempListAnoes;
    }
    
    public static List<Personagem> getElfos(){
        List<Personagem> tempListElfos = new ArrayList<>();

        for(Personagem tempElfos : listaPersonagens){
            if(tempElfos instanceof Elfo){
                tempListElfos.add(tempElfos);
            }
        }

        return tempListElfos;
    }

    public static List<Personagem> getGnomos(){
        List<Personagem> tempListGnomos = new ArrayList<>();

        for(Personagem tempGnomos : listaPersonagens){
            if(tempGnomos instanceof Gnomo){
                tempListGnomos.add(tempGnomos);
            }
        }

        return tempListGnomos;
    }

    public static List<Personagem> getHalflings(){
        List<Personagem> tempListHalflings = new ArrayList<>();

        for(Personagem tempHalflings : listaPersonagens){
            if(tempHalflings instanceof Halfling){
                tempListHalflings.add(tempHalflings);
            }
        }

        return tempListHalflings;
    }

    public static List<Personagem> getHumanos(){
        List<Personagem> tempListHumanos = new ArrayList<>();

        for(Personagem tempHumanos : listaPersonagens){
            if(tempHumanos instanceof Humano){
                tempListHumanos.add(tempHumanos);
            }
        }

        return tempListHumanos;
    }


    public static List<Personagem> getMeioElfos(){
        List<Personagem> tempListMeioElfos = new ArrayList<>();

        for(Personagem tempMeioElfos : listaPersonagens){
            if(tempMeioElfos instanceof MeioElfo){
                tempListMeioElfos.add(tempMeioElfos);
            }
        }

        return tempListMeioElfos;
    }

    public static List<Personagem> getMeioOrcs(){
        List<Personagem> tempListMeioOrcs = new ArrayList<>();

        for(Personagem tempMeioOrcs : listaPersonagens){
            if(tempMeioOrcs instanceof MeioOrc){
                tempListMeioOrcs.add(tempMeioOrcs);
            }
        }

        return tempListMeioOrcs;
    }    
}
