import java.lang.reflect.Type;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.harwoodjp.Crypto.AES;

public class GsonTest {
	
	public class Cat {
		private String guid;
		private String name;
		private int age;

		public Cat(String guid, String name, int age) {
			this.guid = guid;
			this.name = name;
			this.age = age;
		}
	}
	
	public class CatSerializerIgnoreAge implements JsonSerializer<Cat> {
		@Override
		public JsonElement serialize(Cat src, Type typeOfSrc, JsonSerializationContext context) {
			JsonObject json = new JsonObject();
			json.addProperty("guid", src.guid);
			json.addProperty("name", src.name);
			return json;
		}
	}
	
	private class CatDeserializerWithEncryptedGuid implements JsonDeserializer<Cat> {
		@Override
		public Cat deserialize(JsonElement jElement, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
			JsonObject json = jElement.getAsJsonObject();
			String guid = json.get("guid").getAsString();
			String name = json.get("name").getAsString();
			int age = json.get("age").getAsInt();
			return new Cat(AES.encrypt(guid, "SECRETKEY"), name, age);
		}
	}
	
	private Cat mocha = new Cat("1", "Mocha", 15);

	@Test
	public void serializeCat() {
		String mochaJson = new Gson().toJson(mocha);
		System.out.println(mochaJson);
		Assert.assertTrue(mochaJson.contains("guid") && mochaJson.contains("name") && mochaJson.contains("age"));
	}

	@Test
	public void serializeCatWithoutAge() { 
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Cat.class, new CatSerializerIgnoreAge());
		String mochaJson = gsonBuilder.create().toJson(mocha);
		Assert.assertFalse(mochaJson.contains("age"));
	}
	
	@Test
	public void deserializeCat() {
		String mochaJson = new Gson().toJson(mocha);
		Cat mocha2 = new Gson().fromJson(mochaJson, Cat.class);
		Assert.assertEquals(mocha.guid, mocha2.guid);
	}
	
	@Test
	public void deserializeCatWithEncryptedGuid() {
		String mochaJson = new Gson().toJson(mocha);
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Cat.class, new CatDeserializerWithEncryptedGuid());
		Cat mochaEncrypted = gsonBuilder.create().fromJson(mochaJson, Cat.class);
		Assert.assertTrue(mochaEncrypted.guid.equals(AES.encrypt(mocha.guid, "SECRETKEY")));
	}

}
