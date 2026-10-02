package com.distribuidos.Autos.Service.Imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuidos.Autos.Model.Auto;
import com.distribuidos.Autos.Repositoy.IAutoRepository;
import com.distribuidos.Autos.Service.IAutoService;

@Service
public class AutoServiceImple implements IAutoService {
	 @Autowired
	 private IAutoRepository RepoAuto;
	 
	@Override
	public void crearAuto(Auto auto) {
		RepoAuto.save(auto);
		
	}

	@Override
	public List<Auto> listarAutos() {
		return RepoAuto.findAll();
	
	}

}
