import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double limite = 1000;
    JOptionPane.showMessageDialog(null, "Caixa do Oiapoque");
    int sacarDepositar = Integer.parseInt(JOptionPane.showInputDialog("[1] Sacar Dinheiro.\n[2] Depositar dinheiro."));
    if (sacarDepositar == 1) {
      double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo: R$1000.00\nQuanto deseja sacar?"));
      double novoLimite = limite - saque;
      if (saque > limite) {
      JOptionPane.showMessageDialog(null, "Erro!\nVocê não pode sacar mais que seu limite!");
      }
        else {
          JOptionPane.showMessageDialog(null, "Seu novo limite é de: R$" + (limite - saque) + "\nSaque de R$" + saque + " efetuado com sucesso!");
        }
    }
      else if (sacarDepositar == 2) {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo: R$1000.00\nQuanto deseja depositar?"));
        double novoLimite = limite + deposito;
        JOptionPane.showMessageDialog(null, "Seu novo limite é de: R$" + (limite + deposito) + "\nDepósito de R$" + deposito + " efetuado com sucesso!");
      }
        else {
          JOptionPane.showMessageDialog(null, "Por favor, selecione [1] ou [2].");
        }

  }
}
