package com.duseni.duseni.persistence;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * clase que se encarga del manejo que se necesite de JSONs
 * @author Cesar
 *
 */
public class JsonManager {

	/**
	 * metodo que combierte cualquier objeto a un string json
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd-HH:mm:ss").create(); //formato especial para la fecha en la que se retorna el objeto en forma de json
		return gson.toJson(obj);
	}
}
