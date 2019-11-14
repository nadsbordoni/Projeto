package Fachada;

import pacoteExcecoes.*;
import pacoteClassesPessoa.*;

public class Fachada {
	private NegocioPessoa pessoa;
	// private NegocioReserva
	// private NEgocioSessao

 	public Fachada (int escolha) throws NOException {
 		this.pessoa = new NegocioPessoa(escolha);
 		//this.sessao = new NegocioSessao(escolha)
 		//this.reserva = new NegocioReserva(escolha)
 	}
//Pessoa

//Sessao

//Reserva
}