package com.duseni.duseni.entitiesPruebas;

import java.lang.reflect.Type;

import com.duseni.duseni.entities.Member;
import com.duseni.duseni.entities.Request;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class RequestSerializer implements JsonSerializer<Request> {

	@Override
	public JsonElement serialize(Request request, Type typeOfSrc, JsonSerializationContext context) {
		 JsonObject jsonObject = new JsonObject();
	        jsonObject.addProperty("id_request", request.getId_request());
            jsonObject.addProperty("description", request.getDescription());
            jsonObject.addProperty("required_quantity", request.getRequired_Quantity());
	        return jsonObject;
	}



}