package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;
import com.diogo.trabalhofinal.mercadoacoes.repositories.AcaoRepository;

@Service
public class MercadoServiceImpl implements MercadoService {
	
	private AcaoRepository acaoRepository;
	
	public MercadoServiceImpl(AcaoRepository acaoRepository){
		this.acaoRepository = acaoRepository;
	}
	
	@Override
	public Set<Acao> obterTodasAcoes() {
		Set<Acao> acoes = new HashSet<>();
		this.acaoRepository.findAll().iterator().forEachRemaining(acoes::add);
		return acoes;
	}

	@Override
	public Set<Acao> comprarAcoes(String idCliente, String idEmpresa, int quantidadeAcoes) {
		Set<Acao> acoes = new HashSet<>();
		this.acaoRepository.findAll().iterator().forEachRemaining(acoes::add);
		return acoes;
	}

	@Override
	public void venderAcoes(String idCliente, String idEmpresa, int quantidadeAcoes) {

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
