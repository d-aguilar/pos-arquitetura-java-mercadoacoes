package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;

public interface MercadoService {
	
	Set<Acao> obterTodasAcoes();
	Set<Acao> comprarAcoes(Long idCliente, Long idEmpresa, int quantidadeAcoes) throws Exception;
	void venderAcoes(Long idCliente, Long idEmpresa, int quantidadeAcoes) throws Exception;
	Set<Acao> getAcoesByIdEmpresa(Long id);
	Acao includeAcaoEmpresa(Acao acao);
	
}
