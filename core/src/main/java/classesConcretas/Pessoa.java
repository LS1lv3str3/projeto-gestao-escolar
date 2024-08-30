package classesConcretas;

public abstract class Pessoa {
    private String nome;
    private String apelido;
    private int idade;
    private String nif;

    public Pessoa(String nome, String apelido, int idade, String nif) {
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void mostrarDados();

}
