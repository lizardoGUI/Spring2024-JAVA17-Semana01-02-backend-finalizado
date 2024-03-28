package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public abstract List<Medicamento> listaMedicamento();
	public abstract List<Medicamento> listaMedicamentoPorPrecio(String precio);
	public abstract List<Medicamento> listaMedicamentoPorNombre(String nombre);
	public abstract List<Medicamento> listaMedicamentoMayores(String stock);
}
