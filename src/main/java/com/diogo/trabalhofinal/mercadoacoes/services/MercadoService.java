package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;

public interface MercadoService {
	
	Set<Acao> obterTodasAcoes();
	Set<Acao> comprarAcoes(String idCliente, String idEmpresa, int quantidadeAcoes);
	void venderAcoes(String idCliente, String idEmpresa, int quantidadeAcoes);
	
}
