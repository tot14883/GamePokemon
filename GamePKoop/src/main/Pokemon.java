package main;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Pokemon {//Class My pokemon
	public JSONArray name,ar,bl,ch,de,me,sc;
	public String lv;
	public  int heal,heal1,heal2,heal3,heal4,heal5;
	public  int atk,atk2,atk3,atk4,atk5,atk6;
	public Pokemon(){
		this.heal = 0;
	    this.heal1 = 0;
	    this.heal2 = 0;
	    this.heal3 = 0;
	    this.heal4 = 0;
	    this.heal5 = 0;
	    this.atk = 0;
	    this.atk2 = 0;
	    this.atk3 = 0;
	    this.atk4 = 0;
	    this.atk5 = 0;
	    this.atk6 = 0;
		JSONParser parser = new JSONParser();
		  try{
			  //pull json from res
			  //String location = Pokemon.class.getResource("/Pokemon.json").getPath().toString();
			  Object obj = parser.parse(new FileReader("D:\\Pokemon.json"));
		      JSONObject json = (JSONObject) obj;
		       lv = (String) json.get("Lv");
		       name = (JSONArray)json.get("name");
		       ar = (JSONArray)json.get("Arceus");
		       bl = (JSONArray)json.get("Blaziken");
		       ch = (JSONArray)json.get("Charizard");
		       de = (JSONArray)json.get("Deoxy");
		       me = (JSONArray)json.get("Meganium");
		       sc = (JSONArray)json.get("Scizor");		    			      		       
		  }catch(Exception e)
		  {
			
		  }	
      
	}
}
