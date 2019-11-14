package Fachada;

import pacoteExcecoes.*;
import pacoteClassesPessoa.*;

public class Fachada {
	private NegocioPessoa people;
	// private NegocioReserva
	// private NEgocioSessao

 	public Fachada (int escolha) throws NOException {
 		this.people = new NegocioPessoa(escolha);
 		//this.sessao = new NegocioSessao(escolha)
 		//this.reserva = new NegocioReserva(escolha)
 	}
//Pessoa
 	public void cadastrarPessoa(Pessoa pessoa) throws UFException {
		this.people.cadastrar(pessoa);
	}

	public boolean existePesspa(String documento) {
		return this.people.existe(documento);
	}

	public void atualizarPessoa(Pessoa pessoa, Pessoa mudar) throws UIException{
		this.people.atualizar(pessoa, mudar);
	}

	public void deletarPessoa(Pessoa pessoa) throws UIException{
		this.people.deletar(pessoa);
	}

	public Pessoa procurarPessoa(String documento) throws UIException{
		return this.people.procurarPessoa(documento);
	}
}
//Sessao

//Reserva
