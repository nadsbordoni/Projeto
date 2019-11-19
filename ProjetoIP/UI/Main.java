package UI;

import Fachada.Fachada;
import pacoteClassesPessoa.*;
import pacoteClassesDemanda.*;
import pacoteClassesReserva.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fachada fachada;
		System.out.println("Boa tarde. Digite 1 para Lista e 2 para Array.");
		try {
			fachada = new Fachada(in.nextInt());
			in.nextLine();
			while (true)
				try {
					System.out.println("Gostaria de acessar Pessoas(1), Demanda(2), Reserva(3)? Se desejar sair, digite 0");
					int menu = in.nextInt();
					in.nextLine();
					if (menu == 0) {
						System.out.println("Obrigado. Esperamos ter ajudado!");
						break;
					}
					switch (menu) {
					case 1:
						System.out.println(
								"Voc� deseja: Inserir Pessoa(1), Procurar Pessoa(2), Atualizar dados de Pessoa(3), Deletar Pessoa(4)");
						int escolha = in.nextInt();
						in.nextLine();
						switch (escolha) {
						case 1:
							System.out.println("Deseja cadastrar Pessoa F�sica (1) ou Jur�dica(2)?");
							int tipopessoa = in.nextInt();
							in.nextLine();
							switch (tipopessoa) {
							case 1:
								System.out.print("Digite o nome: ");
								String nome = in.nextLine();
								System.out.print("Digite o endere�o: ");
								String zipcode = in.nextLine();
								System.out.print("Digite o telefone: ");
								String telefone = in.nextLine();
								System.out.print("Digite o CPF: ");
								String CPF = in.nextLine();
								PessoaFisica pessoa = new PessoaFisica(nome, zipcode, telefone, CPF);
								fachada.cadastrarPessoa(pessoa);
								System.out.println("Pessoa cadastrada com sucesso!");
								break;
							case 2:
								System.out.print("Digite o nome: ");
								nome = in.nextLine();
								System.out.print("Digite o endere�o: ");
								zipcode = in.nextLine();
								System.out.print("Digite o telefone: ");
								telefone = in.nextLine();
								System.out.print("Digite o CNPJ: ");
								String CNPJ = in.nextLine();
								PessoaJuridica empresa = new PessoaJuridica(nome, zipcode, telefone, CNPJ);
								fachada.cadastrarPessoa(empresa);
								System.out.println("Empresa cadastrada com sucesso!");
								break;
							}
							break;
						case 2:
							System.out.print("Digite CPF ou CNPJ, por favor: ");
							String documento = in.nextLine();
							Pessoa pessoa = fachada.procurarPessoa(documento);
							System.out.println("Pessoa encontrada. O nome dela � " + pessoa.getNome());
							break;
						case 3:
							System.out.print("Gostaria de atualizar Pessoa F�sica(1) ou Jur�dica(2)?");
							int atualizar = in.nextInt();
							in.nextLine();
							switch (atualizar) {
							case 1:
								System.out.print("Digite CPF de Pessoa F�sica j� cadastrada: ");
								String doc = in.nextLine();
								PessoaFisica person = (PessoaFisica) fachada.procurarPessoa(doc);
								System.out.print("Digite o nome que gostaria de atualizar: ");
								String nome = in.nextLine();
								System.out.print("Digite o endere�o que gostaria de atualizar: ");
								String zipcode = in.nextLine();
								System.out.print("Digite o telefone que gostaria de atualizar: ");
								String telefone = in.nextLine();
								PessoaFisica personnova = new PessoaFisica(nome, zipcode, telefone, doc);
								fachada.atualizarPessoa(person, personnova);
								System.out.println("Pessoa atualizada com sucesso!");
								break;
							case 2:
								System.out.print("Digite CNPJ de Pessoa F�sica j� cadastrada: ");
								doc = in.nextLine();
								PessoaJuridica empresa = (PessoaJuridica) fachada.procurarPessoa(doc);
								System.out.print("Digite o nome que gostaria de atualizar: ");
								nome = in.nextLine();
								System.out.print("Digite o endere�o que gostaria de atualizar: ");
								zipcode = in.nextLine();
								System.out.print("Digite o telefone que gostaria de atualizar: ");
								telefone = in.nextLine();
								PessoaJuridica empresanova = new PessoaJuridica(nome, zipcode, telefone, doc);
								fachada.atualizarPessoa(empresa, empresanova);
								System.out.println("Empresa atualizada com sucesso!");
								break;
							}
							break;
						case 4:
							System.out.print("Digite o CPF ou CNPJ da pessoa que gostaria de deletar: ");
							String docprocurar = in.nextLine();
							Pessoa pessoa1 = fachada.procurarPessoa(docprocurar);
							fachada.deletarPessoa(pessoa1);
							System.out.println("Exclus�o efetuada.");
							break;
						}
						break;
					case 2:
						System.out.println(
								"Voc� deseja: Inserir Demanda(1), Procurar Demanda(2), Atualizar dados da Demanda(3), Deletar Demanda(4)");
						escolha = in.nextInt();
						in.nextLine();
						switch (escolha) {
						case 1:
							System.out.print("Digite CPF ou CNPJ de pessoa j� cadastrada para adicionar a Lide: ");
							String doc = in.nextLine();
							Pessoa pessoa = fachada.procurarPessoa(doc);
							System.out.print("Digite �rea do Direito em que se enquadra sua Lide: ");
							String area = in.nextLine();
							System.out.print("Digite tipo de causa: ");
							String demanda = in.nextLine();
							Demanda lide = new Demanda(pessoa, area, demanda);
							int codigo = fachada.cadastrarDemanda(lide).getCodigo();
							System.out.println("Demanda cadastrada com sucesso! O Codigo da sua demanda � " + codigo);
							break;
						case 2:
							System.out.print("Digite o c�digo da Lide: ");
							int codigoprocurar = in.nextInt();
							in.nextLine();
							Demanda procurada = fachada.procurarDemanda(codigoprocurar);
							System.out.println("Lide encontrada. A �rea � " + procurada.getArea() + " e esta no nome de: " + procurada.getPessoa().getNome());
							break;
						//case 3
						//case 4
							
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}