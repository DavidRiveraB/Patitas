package com.mx.Service;

import java.util.List;

import com.mx.Dominio.Patitas;

public interface Veterinario{
	
	public void editar(Patitas veterinario);
	
	public void guardar(Veterinario veterinario);
	
	public void eliminar(Veterinario veterinario);
	
	public List<Veterinario> listar();
	
	public Veterinario buscar(Veterinario veterinario);
	
}

