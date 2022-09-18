package controller;
import javax.swing.JOptionPane;
import model.PilhaString;
public class HistoricoController {

	public HistoricoController() {
		super();
	}
	
	public void insereEndereco(PilhaString historico) {
		String valor = JOptionPane.showInputDialog("Insira o endereco: ");
		if (valor.contains("https://www.") && valor.contains(".co")) {
			historico.push(valor);
		}
		else {
			System.out.println("Endereco invalido.");
		}
	}
	
	public void removeEndereco(PilhaString historico) throws Exception {
		if (historico.size() < 1) {
			System.out.println("Invalido, pilha vazia.");
		}
		else {
			historico.pop();
		}
	}
	
	public PilhaString consultaEndereco(PilhaString historico) throws Exception {
		if (historico.size() < 1) {
			System.out.println("Invalido, pilha vazia.");
		}
		System.out.println("Ultimo endereco visitado: " +historico.top());
		return historico;
	}

}
