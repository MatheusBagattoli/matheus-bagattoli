public class Aluno {

    private String nomeAluno;
    private int notas;

    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }
}
