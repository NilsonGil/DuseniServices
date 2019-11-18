package com.duseni.duseni.entitiesPruebas;

import java.lang.reflect.Type;

import com.duseni.duseni.entities.Address;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class AddressSerializer implements JsonSerializer<Address> {

	@Override
	public JsonElement serialize(Address adrress, Type typeOfSrc, JsonSerializationContext context) {
		// TODO Auto-generated method stub
		    JsonObject jsonObject = new JsonObject();
//	        jsonObject.addProperty("id_address", adrress.getId());
//	        jsonObject.addProperty("descripcion", adrress.getDescripcion());
	        return jsonObject;
	}
}