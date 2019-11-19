package Fachada;

import pacoteExcecoes.*;
import pacoteClassesPessoa.*;
import pacoteClassesReserva.*;
import pacoteClassesDemanda.*;

public class Fachada {
	private NegocioPessoa people;
	private NegocioDemanda demanda;
	private NegocioReserva horario;
 	public Fachada (int escolha) throws NOException {
 		this.people = new NegocioPessoa(escolha);
 		this.demanda = new NegocioDemanda(escolha);
 		this.horario = new NegocioReserva(escolha);
 	}
//Pessoa
 	public void cadastrarPessoa(Pessoa pessoa) throws UFException {
		this.people.cadastrar(pessoa);
	}

	public boolean existePessoa(String documento) {
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
	public Demanda cadastrarDemanda(Demanda demanda) throws EDException{
		return this.demanda.cadastrar(demanda);
	}

	public void deletarDemanda(int codigo) throws NDException{
		this.demanda.deletar(codigo);
	}

	public void atualizarDemanda(int codigo, Demanda nova) throws NDException{
		this.demanda.atualizarDemanda(codigo, nova);
	}

	public Demanda procurarDemanda(int codigo)
			throws NDException{
		return this.demanda.procurarDemanda(codigo);
	}
	
	public boolean existe (Demanda demanda) {
		return this.demanda.existe(demanda);
	}

//Reserva
	public void cadastrarReserva(Reserva reserva) throws HIException {
		this.horario.cadastrar(reserva);
	}
	
	public boolean existe(Reserva reserva) {
		return this.horario.existe(reserva);
	}
	
	public void atualizarReserva(Reserva reserva, Reserva alterada) throws RNCException{
		this.horario.atualizar(reserva, alterada);
	}
	
	public void deletarReserva(Reserva reserva) throws RNCException{
		this.horario.deletar(reserva);
	}
	
	public String procurarReserva(Reserva reserva) throws RNCException{
		return this.horario.procurarReserva(reserva);
	}
}
	

