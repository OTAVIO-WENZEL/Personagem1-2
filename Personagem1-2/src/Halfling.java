public class Halfling extends Personagem{

    String tamanho = "Pequeno";
    String classe;

    public Halfling (String nome, int idade, String sexo, int id, String classe){
        super(nome, idade, sexo, id);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nTamanho: " + tamanho +
        "\nClasse: " + classe;
    }
    
}
