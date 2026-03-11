/**
 * 3)
 *
 * A classe concentra múltiplas responsabilidades:
 *
 * Dados do aluno.
 *
 * Dados do professor.
 *
 * Cálculo de média.
 *
 * Impressão de boletim.
 *
 * Viola o Princípio da Responsabilidade Única (SRP).
 *
 * Dificulta manutenção, testes e reutilização do código.
 */

public class SistemaEscolar {

    private String nomeAluno;
    private double mediaAluno;

    public SistemaEscolar(String nomeAluno, double mediaAluno) {
        this.nomeAluno = nomeAluno;
        this.mediaAluno = mediaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(double mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public void verificarAprovacao(){
        if(mediaAluno < 7){
            throw new RuntimeException("Aluno está reprovado");
        }else {
            System.out.println("Aluno está aprovado");
        }
    }
}



