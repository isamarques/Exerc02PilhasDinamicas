package view;
import controller.HistoricoController;
import model.PilhaString;
import javax.swing.*;

public class Principal {
	

	public static void main(String[] args) throws Exception {
		PilhaString historico = new PilhaString();
		HistoricoController h = new HistoricoController();
		
		int escolha = 0;
		while (escolha != 3) {
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opcao: \n1- Inserir novo endereco no historico;"
				+ "\n2- Remover ultimo endereco da pilha; \n3- Consultar ultimo endereco visitado; \n9- Sair."));
		
		switch(escolha) {
		case 1: h.insereEndereco(historico);
		break;
		case 2: h.removeEndereco(historico);
		break;
		case 3: h.consultaEndereco(historico);
		break;
		default: System.out.println("Opcao invalida. Tente novamente.");
			}
		}
	}

}
