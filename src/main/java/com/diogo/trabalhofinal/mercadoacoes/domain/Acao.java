package com.diogo.trabalhofinal.mercadoacoes.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Document(collection = "acoes")
public class Acao {
	
	private String id;
	private Long idEmpresa;
	private float valor;
	
	@Nullable
	private Date dataCompra;
	@Nullable
	private Long idCliente;
	
}
