package com.diogo.trabalhofinal.mercadoacoes.controllers.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diogo.trabalhofinal.mercadoacoes.services.EmpresaService;

import io.swagger.annotations.Api;

@Api("API de Empresa")
@RestController
@RequestMapping(MercadoController.BASE_URL)
public class EmpresaController {
	
	public static final String BASE_URL = "/api/v1/empresa";
	private final EmpresaService empresaService;
	
	public EmpresaController(EmpresaService empresaService){
		this.empresaService = empresaService;
	}
}
