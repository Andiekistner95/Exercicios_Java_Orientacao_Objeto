package orientacao_a_objeto;

import javax.swing.JOptionPane;

public class Teste_Funcionario2 {
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = JOptionPane.showInputDialog("Informe o nome do funcionário");
		funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário"));
		
		JOptionPane.showMessageDialog(null, funcionario.consultaFuncionario());
	
		int continuar = JOptionPane.showConfirmDialog(null, "Deseja alterar novamente?");
		int imprimir = JOptionPane.showConfirmDialog(null, "Deseja imprimir?");
		
		if (imprimir == 0 ){
			JOptionPane.showMessageDialog(null, funcionario.consultaFuncionario());
		}
		
		while (continuar == 0 ){
			funcionario.nome = JOptionPane.showInputDialog("Informe o nome do funcionário");
			funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário"));
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja alterar novamente?");
			imprimir = JOptionPane.showConfirmDialog(null, "Deseja imprimir?");
			
			if (imprimir == 0 ){
				JOptionPane.showMessageDialog(null, funcionario.consultaFuncionario());
			}
		}
	}
}
