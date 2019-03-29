package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;
import com.diogo.trabalhofinal.mercadoacoes.domain.Cliente;
import com.diogo.trabalhofinal.mercadoacoes.repositories.AcaoRepository;
import com.diogo.trabalhofinal.mercadoacoes.repositories.ClienteRepository;

@Service
public class MercadoServiceImpl implements MercadoService {
	
	private AcaoRepository acaoRepository;
	private ClienteRepository clienteRepository;
	private EmailService emailService;
	
	public MercadoServiceImpl(AcaoRepository acaoRepository, ClienteRepository clienteRepository, EmailService emailService){
		this.acaoRepository = acaoRepository;
		this.clienteRepository = clienteRepository;
		this.emailService = emailService;
	}
	
	@Override
	public Set<Acao> obterTodasAcoes() {
		Set<Acao> acoes = new HashSet<>();
		this.acaoRepository.findAll().iterator().forEachRemaining(acoes::add);
		return acoes;
	}

	@Override
	public Set<Acao> comprarAcoes(Long idCliente, Long idEmpresa, int quantidadeAcoes) throws Exception {
		Set<Acao> acoes = new HashSet<>();
		this.acaoRepository.findAll().iterator().forEachRemaining(acoes::add);
		
		Optional<Cliente> cliente = this.clienteRepository.findById(idCliente);
		
		String email = cliente.get().getEmail();
		emailService.sendEmail(email,  "Parabéns! Você comprou ações.", "Compra de ações");
		
		return acoes;
	}

	@Override
	public void venderAcoes(Long idCliente, Long idEmpresa, int quantidadeAcoes) throws Exception {
		Optional<Cliente> cliente = this.clienteRepository.findById(idCliente);
		
		String email = cliente.get().getEmail();
		emailService.sendEmail(email,  "Parabéns! Você vendeu ações.", "Venda de ações");
	}
	
	@Override
	public Set<Acao> getAcoesByIdEmpresa(Long id) {
		Set<Acao> acoes = new HashSet<>();
		this.acaoRepository.findAll().iterator().forEachRemaining(acoes::add);
		
		acoes = acoes.stream().filter(a -> a.getIdEmpresa().equals(id)).collect(Collectors.toSet());
		
		return acoes;
	}

	@Override
	public Acao includeAcaoEmpresa(Acao acao) {
		return this.acaoRepository.insert(acao);
	}

}
