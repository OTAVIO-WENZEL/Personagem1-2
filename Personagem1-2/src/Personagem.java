public class Personagem {

    String nome;
    int idade;
    String sexo;
    int id;

    public Personagem (String nome, int idade, String sexo, int id){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String txt = "\nNome: " + nome +
                    "\nIdade: " + idade +
                    "\nSexo: " + sexo +
                    "\nID: " + id;
        return txt;
    }
}