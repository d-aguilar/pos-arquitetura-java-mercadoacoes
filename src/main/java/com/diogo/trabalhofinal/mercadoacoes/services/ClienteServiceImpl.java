package com.diogo.trabalhofinal.mercadoacoes.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;
import com.diogo.trabalhofinal.mercadoacoes.domain.Cliente;
import com.diogo.trabalhofinal.mercadoacoes.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	private ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository){
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public Set<Cliente> getAll() {
		Set<Cliente> clientes = new HashSet<>();
		this.clienteRepository.findAll().iterator().forEachRemaining(clientes::add);
		return clientes;
	}

	@Override
	public Optional<Cliente> getClienteById(Long id) {
		return clienteRepository.findById(id);
	}

	@Override
	public Cliente createNewCliente(Cliente cliente) {
		return clienteRepository.insert(cliente);
	}

	@Override
	public Cliente saveCliente(Long id, Cliente cliente) {
		if(clienteRepository.existsById(id)){
			return clienteRepository.save(cliente);
		}else {
			return null;
		}
	}

	@Override
	public void deleteClienteById(Long id) {
		clienteRepository.deleteById(id);
	}

}
