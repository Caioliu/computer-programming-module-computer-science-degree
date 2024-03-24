import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Caixa do Oiapoque");
    double limite = 1000;
    double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo: R$1000.00\nQuanto deseja sacar?"));
    double novoLimite = limite - saque;
    if (saque > limite) {
      JOptionPane.showMessageDialog(null, "Erro!\nVocê não pode sacar mais que seu limite!");
    }
    else {
      JOptionPane.showMessageDialog(null, "Seu novo limite é de: R$" + (limite - saque) + "\nSaque de R$" + saque + " efetuado com sucesso!");
    }
  }
}
