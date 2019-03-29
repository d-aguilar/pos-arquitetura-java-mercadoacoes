package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Empresa;

public interface EmpresaService {

	Set<Empresa> getAll();
	
	Empresa getEmpresaById(String id);
	
	Empresa createNewEmpresa(Empresa empresa);
	
	Empresa saveEmpresa(String id, Empresa empresa);
	
	void deleteEmpresaById(String id);
	
}
