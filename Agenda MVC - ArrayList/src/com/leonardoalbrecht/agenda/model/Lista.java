package com.leonardoalbrecht.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	// Atributos
	private static List<Contato> lista;
	
	// Cria uma INST�NCIA �NICA da Lista (Padr�o de Projeto: Singleton)
	public static List<Contato> getInstance() {
		
		if (lista == null) {
			lista = new ArrayList<Contato>();
		}
		
		// Se J� existir, retorna a inst�ncia
		return lista;
	}
}
