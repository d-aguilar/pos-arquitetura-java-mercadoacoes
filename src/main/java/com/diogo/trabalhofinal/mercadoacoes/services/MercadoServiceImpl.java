package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;
import com.diogo.trabalhofinal.mercadoacoes.repositories.IAcaoRepository;

@Service
public class MercadoServiceImpl implements MercadoService {
	
	private IAcaoRepository acaoRepository;
	
	public MercadoServiceImpl(IAcaoRepository acaoRepository){
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

}
