package com.distribuidos.Autos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.distribuidos.Autos.Model.Auto;
import com.distribuidos.Autos.Service.IAutoService;




@RestController
public class AutoController {
	 @Autowired
	 private IAutoService serviceAuto;
	 
	 @PostMapping("/Auto/crear")
	    public String crearAuto(@RequestBody Auto aut){
	        serviceAuto.crearAuto(aut);
	        return "Dado de alta OK";
	    }
	 
	 @GetMapping("/Auto/listar")
	    public List<Auto> getAuto(){
	        return serviceAuto.listarAutos();
	    }
}
