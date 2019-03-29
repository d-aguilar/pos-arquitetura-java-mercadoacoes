package com.diogo.trabalhofinal.mercadoacoes.repositories;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.diogo.trabalhofinal.mercadoacoes.domain.Acao;

public interface IAcaoRepository extends MongoRepository<Acao, Long> {

	public Acao obterAcoesPorEmpresa(String idEmpresa);
	public Acao comprarAcao(String idEmpresa, String idCliente, String idAcao, Date dataCompra);
	public Acao venderAcao(String idEmpresa, String idCliente, String idAcao);
}
