package com.diogo.trabalhofinal.mercadoacoes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.diogo.trabalhofinal.mercadoacoes.domain.Empresa;

public interface IEmpresaRepository extends MongoRepository<Empresa, Long> {
	
}
