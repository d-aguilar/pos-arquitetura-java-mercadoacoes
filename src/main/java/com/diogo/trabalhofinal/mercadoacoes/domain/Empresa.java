package com.diogo.trabalhofinal.mercadoacoes.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Document(collection = "empresas")
public class Empresa {

	private String id;
	private String nome;
}
