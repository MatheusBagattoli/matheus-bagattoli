public class EscolarMain {

    public static void main(String[] args) {
         double media = Media.calcularMedia(8, 10, 7);

         SistemaEscolar sistemaEscolar = new SistemaEscolar("Matheus", media);
         Disciplina disciplina = new Disciplina("Matemática", 350, "Carlos", "vermelha");

         sistemaEscolar.verificarAprovacao();
        System.out.println(disciplina);
    }

}
