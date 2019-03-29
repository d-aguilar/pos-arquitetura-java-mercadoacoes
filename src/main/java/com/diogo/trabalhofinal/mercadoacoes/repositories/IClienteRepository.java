package com.diogo.trabalhofinal.mercadoacoes.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.diogo.trabalhofinal.mercadoacoes.domain.Cliente;;

public interface IClienteRepository  extends MongoRepository<Cliente, Long> {
	
	public Cliente obterPeloNome(String nome);
}
