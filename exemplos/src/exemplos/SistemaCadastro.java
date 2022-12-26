package exemplos;
public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos","123456");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
