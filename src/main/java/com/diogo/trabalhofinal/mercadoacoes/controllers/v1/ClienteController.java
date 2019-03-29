package com.diogo.trabalhofinal.mercadoacoes.controllers.v1;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.diogo.trabalhofinal.mercadoacoes.domain.Cliente;
import com.diogo.trabalhofinal.mercadoacoes.services.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("API de Cliente")
@RestController
@RequestMapping(MercadoController.BASE_URL)
public class ClienteController {
	
	public static final String BASE_URL = "/api/v1/cliente";
	private final ClienteService _clienteService;
	
	public ClienteController(ClienteService clienteService){
		_clienteService = clienteService;
	}
	
	@ApiOperation(value = "Listar cliente")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Set<Cliente> getAllClientes() {
		Set<Cliente> clientes = _clienteService.getAll();
		return clientes;
	}
	
	@ApiOperation(value = "Cadastrar cliente")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Cliente createNewCliente(Cliente cliente){
		Cliente c = _clienteService.createNewCliente(cliente);
		return c;
	}
	
	@ApiOperation(value = "Atualizar cliente")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Cliente saveCliente(Long id, Cliente cliente){
		Cliente c = _clienteService.saveCliente(id, cliente);
		return c;
	}
	
	@ApiOperation(value = "Deletar cliente")
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void deleteCliente(Long id){
		_clienteService.deleteClienteById(id);
	}
	
}
