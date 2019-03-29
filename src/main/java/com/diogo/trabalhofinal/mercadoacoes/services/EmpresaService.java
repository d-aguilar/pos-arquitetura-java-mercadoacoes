package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.Optional;
import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Empresa;

public interface EmpresaService {

	Set<Empresa> getAll();
	
	Optional<Empresa> getEmpresaById(Long id);
	
	Empresa createNewEmpresa(Empresa empresa);
	
	Empresa saveEmpresa(Long id, Empresa empresa);
	
	void deleteEmpresaById(Long id);
}
