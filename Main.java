public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. João", "joao@universidade.com");
        Aluno aluno1 = new Aluno("Maria", "maria@gmail.com");
        Aluno aluno2 = new Aluno("Pedro", "pedro@gmail.com");

        Turma turma = new Turma(1, "Programação Java", professor);
        
        professor.logar();
        aluno1.logar();
        aluno2.logar();

        turma.inserirAluno(aluno1);
        turma.inserirAluno(aluno2);
        
        turma.listarAlunos();
        turma.exibirId();
        turma.exibirProfessor();
    }
}
