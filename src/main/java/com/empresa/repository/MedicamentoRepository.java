package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	

//	public List<Alumno> findByDni(String dni);
//	public List<Alumno> findByNombreLike(String nombre);
//	//findByIdAlumno es un metodo para encontrar el id
//	public List<Alumno> findByIdAlumno(int id);
	
	public List<Medicamento> findByPrecio(String precio);
	public List<Medicamento> findByNombreLike(String nombre);
	public List<Medicamento> findByStockLessThan(String stock);

}
