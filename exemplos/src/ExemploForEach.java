public class ExemploForEach {
    public static void main(String[] args) {

        //em arrays o índice inicia em zero
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }
    }
    
}
