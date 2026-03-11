public class Disciplina {

    private String disciplina;
    private int cargaHoraria;
    private String professor;
    private String sala;

    public Disciplina(String disciplina, int cargaHoraria, String professor, String sala) {
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.sala = sala;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void informacoesAluno(){

    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "disciplina='" + disciplina + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor='" + professor + '\'' +
                ", sala='" + sala + '\'' +
                '}';
    }
}

