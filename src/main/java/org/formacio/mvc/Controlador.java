package org.formacio.mvc;

import org.formacio.component.Servei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {
	
	@Autowired
	Servei servei;

	@RequestMapping(path = "/alumnes")
	@ResponseBody
	public String alumnes() {
		return Integer.toString(servei.alumnesQuantitat());
	}
}
