package com.distribuidos.Autos.Service;
import java.util.List;

import com.distribuidos.Autos.Model.Auto;


public interface IAutoService {
	
public void crearAuto(Auto auto);

public List<Auto>listarAutos();

}
