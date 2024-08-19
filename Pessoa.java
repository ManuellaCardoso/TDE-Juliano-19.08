public class Pessoa {
    protected String nome;
    protected String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void logar() {
        System.out.println("Usuário logado");
    }
}
