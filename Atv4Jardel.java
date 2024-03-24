import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "CADASTRO ALUNOS");
    String nome = JOptionPane.showInputDialog("Nome completo do aluno: ");
    String matricula = JOptionPane.showInputDialog("Matrícula do aluno: ");

    
    double nota1 = Double.parseDouble(JOptionPane.showInputDialog("1° nota do aluno: "));
    double nota2 = Double.parseDouble(JOptionPane.showInputDialog("2° nota do aluno: "));

    double media =  (nota1 + nota2) / 2;
    
    if (media >= 70) {
      JOptionPane.showMessageDialog(null, "O aluno está aprovado.");
      JOptionPane.showMessageDialog(null, "Com média de: " + media);
    }
    else if ((media >= 50) && (media < 70)) {
      JOptionPane.showMessageDialog(null, "O aluno terá um exame de recuperação.");
      JOptionPane.showMessageDialog(null, "O aluno teve média: " + media);
    }
      else {
        JOptionPane.showMessageDialog(null, "O aluno está reprovado.");
      JOptionPane.showMessageDialog(null, "O aluno teve média: " + media);
      }
    
    
  }
}