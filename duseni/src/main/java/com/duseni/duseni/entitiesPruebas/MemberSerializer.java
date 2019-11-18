package com.duseni.duseni.entitiesPruebas;

import java.lang.reflect.Type;

import com.duseni.duseni.entities.Member;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class MemberSerializer implements JsonSerializer<Member> {

	@Override
	public JsonElement serialize(Member member, Type typeOfSrc, JsonSerializationContext context) {
		// TODO Auto-generated method stub
		    JsonObject jsonObject = new JsonObject();
//	        jsonObject.addProperty("id", member.getIdentificationCard());
//	        jsonObject.addProperty("Nombre", member.getFirstName());
//	        jsonObject.addProperty("Adrress", member.getAddress().getDescripcion());
	        return jsonObject;
	}

}
