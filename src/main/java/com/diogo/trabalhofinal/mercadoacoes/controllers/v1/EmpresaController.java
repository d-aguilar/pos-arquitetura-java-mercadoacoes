package com.diogo.trabalhofinal.mercadoacoes.controllers.v1;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.diogo.trabalhofinal.mercadoacoes.domain.Empresa;
import com.diogo.trabalhofinal.mercadoacoes.services.EmpresaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("API de Empresa")
@RestController
@RequestMapping(MercadoController.BASE_URL)
public class EmpresaController {
	
	public static final String BASE_URL = "/api/v1/empresa";
	private final EmpresaService empresaService;
	
	public EmpresaController(EmpresaService empresaService){
		this.empresaService = empresaService;
	}
	
	@ApiOperation(value = "Listar empresas")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Set<Empresa> getAllEmpresas() {
		Set<Empresa> empresas = empresaService.getAll();
		return empresas;
	}
	
	@ApiOperation(value = "Cadastrar empresa")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Empresa createNewEmpresa(Empresa empresa){
		Empresa e = empresaService.createNewEmpresa(empresa);
		return e;
	}
	
	@ApiOperation(value = "Atualizar empresa")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Empresa saveEmpresa(Long id, Empresa empresa){
		Empresa e = empresaService.saveEmpresa(id, empresa);
		return e;
	}
	
	@ApiOperation(value = "Deletar empresa")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void deleteEmpresa(Long id){
		empresaService.deleteEmpresaById(id);
	}
}
