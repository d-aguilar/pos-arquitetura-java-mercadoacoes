package com.diogo.trabalhofinal.mercadoacoes.services;
import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Cliente;

public interface ClienteService {

	Set<Cliente> getAll();
	
	Cliente getClienteById(String id);
	
	Cliente createNewCliente(Cliente cliente);
	
	Cliente saveCliente(String id, Cliente cliente);
	
	void deleteClienteById(String id);
	
}
