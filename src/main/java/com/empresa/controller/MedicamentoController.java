package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/url/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService medicamentoService;
	
	
	@GetMapping
	public List<Medicamento> listaMedicamentos(){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamento();
		return lstSalida;
	}
	
	@GetMapping("/porPrecio/{precio}")
	public List<Medicamento> listaMedicamentosPorPrecio(@PathVariable("precio") String precio){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorPrecio(precio);
		return lstSalida;
	}
	
	@GetMapping("/porNombreLike/{nombre}")
	public List<Medicamento> listaAlumnoPorNombre(@PathVariable("nombre") String nombre){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorNombre(nombre+"%");
		return lstSalida;
	}
	
	@GetMapping("/porStock/{stock}")
	public List<Medicamento> listaAlumnoPorStock(@PathVariable("stock") String stock){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoMayores(stock);
		return lstSalida;
	}
}






