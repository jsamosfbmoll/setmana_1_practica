package org.formacio.component;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ServeiAlumnat {

	Map<Integer, String> alumnes = new HashMap<Integer, String>();
	
	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	public boolean matricula (int id, String alumne) {
		if (alumne != null) {
			alumnes.put(id, alumne);
			return true;
		}
		
		return false;
	}
	
}
