package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Empresa;
import com.diogo.trabalhofinal.mercadoacoes.repositories.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService {

	private EmpresaRepository empresaRepository;
	
	public EmpresaServiceImpl(EmpresaRepository empresaRepository){
		this.empresaRepository = empresaRepository;
	}
	
	@Override
	public Set<Empresa> getAll() {
		Set<Empresa> empresas = new HashSet<>();
		this.empresaRepository.findAll().iterator().forEachRemaining(empresas::add);
		return empresas;
	}

	@Override
	public Optional<Empresa> getEmpresaById(Long id) {
		return empresaRepository.findById(id);
	}

	@Override
	public Empresa createNewEmpresa(Empresa empresa) {
		return empresaRepository.insert(empresa);
	}

	@Override
	public Empresa saveEmpresa(Long id, Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	@Override
	public void deleteEmpresaById(Long id) {
		empresaRepository.deleteById(id);
	}


}
