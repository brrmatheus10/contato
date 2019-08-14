package controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {
	
	public static void redirect(String url) {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect(url);
		} catch (IOException e) {
			addMessageError("Erro ao redirecionar a página.");
			e.printStackTrace();
		}
	}
	
	public static void addMessageError(String message) {
		FacesContext.getCurrentInstance().addMessage("", new FacesMessage(message));
	}

}