package Logic;
import java.util.ArrayList;

import Data.*;
import Entidades.Alumno;
import Entidades.Direccion;;

public class Usuario {
	
	private DataAlumno da = new DataAlumno();
	
	public Alumno Validate(String user,String pass)
	{
		//DataAlumno DA = new DataAlumno();
		Alumno A = new Alumno();
		if(user.equals("43904") && pass.equals("asd")) 
		{
			A.setApellido("Ruiz");
			A.setNombre("Federico");
			A.setContraseña("asd");
			A.setEmail("federicofruiz@hotmail.com");
			A.setLegajo("43904");
			A.setTelefono("4564997");
			Direccion D = new Direccion();
			D.setCalle("Niacaragua");
			D.setNumero(618);
			A.setDireccion(D);	
			
			return A;
		}
		else
		{
			return null;
		}
		
		
		/*ArrayList<Alumno> alumnos = da.getAll();
		for (Alumno A:alumnos) 
		{
			if(user.equals(A.getLegajo()) && pass.equals(A.getContraseña()))
			{
				AlumnoValidate = A;
			}
		}
		
		if(AlumnoValidate != null) 
			{
			return da.getOne(AlumnoValidate.getLegajo());
			}
		*/
		
	}
}
