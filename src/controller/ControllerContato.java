package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerContato {

	private Contato contato;


	public Contato getContato() {
		if (contato == null) {
			contato = new Contato();
		}
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	

	public void entrar() {
		System.out.println("Nome inserido pelo usuario : " + contato.getNome());
		System.out.println("Email inserido pelo usuario : " + contato.getEmail());
		System.out.println("Mensagem inserida pelo usuario : " + contato.getMensagem());
	}

}
