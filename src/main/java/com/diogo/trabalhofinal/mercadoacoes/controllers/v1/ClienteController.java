package com.diogo.trabalhofinal.mercadoacoes.controllers.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.diogo.trabalhofinal.mercadoacoes.services.ClienteService;
import io.swagger.annotations.Api;

@Api("API de Cliente")
@RestController
@RequestMapping(MercadoController.BASE_URL)
public class ClienteController {
	
	public static final String BASE_URL = "/api/v1/cliente";
	private final ClienteService _clienteService;
	
	public ClienteController(ClienteService clienteService){
		_clienteService = clienteService;
	}
}
