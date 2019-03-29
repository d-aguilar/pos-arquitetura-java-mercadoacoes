package com.diogo.trabalhofinal.mercadoacoes.services;
import java.util.Optional;
import java.util.Set;

import com.diogo.trabalhofinal.mercadoacoes.domain.Cliente;

public interface ClienteService {

	Set<Cliente> getAll();
	
	Optional<Cliente> getClienteById(Long id);
	
	Cliente createNewCliente(Cliente cliente);
	
	Cliente saveCliente(Long id, Cliente cliente);
	
	void deleteClienteById(Long id);
	
}
