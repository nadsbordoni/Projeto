package Fachada;

import pacoteExcecoes.*;
import pacoteClassesPessoa.*;
import pacoteClassesReserva.*;
import pacoteClassesDemanda.*;

public class Fachada {
	private NegocioPessoa people;
	private NegocioDemanda demanda;
	private NegocioReserva reserva;
 	public Fachada (int escolha) throws NOException {
 		this.people = new NegocioPessoa(escolha);
 		this.demanda = new NegocioDemanda(escolha);
 		this.reserva = new NegocioReserva(escolha);
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
//Demanda
	public void cadastrarDemanda(Demanda demanda) throws EDException{
		this.demanda.cadastrar(demanda);
	}

	public void removerDemanda(Demanda demanda) throws NDException{
		this.demanda.remover(demanda);
	}

	public void atualizarDemanda(Demanda demanda, Demanda nova) throws NDException{
		this.demanda.atualizarDemanda(demanda, nova);
	}

	public Demanda procurarDemanda(Demanda demanda)
			throws NDException{
		return this.demanda.procurarDemanda(demanda);
	}
	
	public boolean existe (Demanda demanda) {
		return this.demanda.existe(demanda);
	}

//Reserva
	public void cadastrarReserva(Reserva reserva) throws HIException {
		this.reserva.cadastrar(reserva);
	}
	
	public boolean existe(Reserva reserva) {
		return this.reserva.existe(reserva);
	}
	
	public void atualizarReserva(Reserva reserva, Reserva alterada) throws RNCException{
		this.reserva.atualizar(reserva, alterada);
	}
	
	public void deletarReserva(Reserva reserva) throws RNCException{
		this.reserva.deletar(reserva);
	}
	
	public String procurarReserva(Reserva reserva) throws RNCException{
		return this.reserva.procurarReserva(reserva);
	}
}
	

