package main;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Attack {//JSON pokemon arcoss 
	public JSONArray Name;
	public String level;
	public int heal1,atk1,atk2,atk3,atk4,atk5,atk6;
   public Attack(){
	     this.heal1 = 390;
	     this.atk1 = 0;
	     this.atk2 = 0;
	     this.atk3 = 0;
	     this.atk4 = 0;
	     this.atk5 = 0;
	     this.atk6 = 0;
	   //JSONParser parser = new JSONParser();
		  try{
			  //pull data JSON
			 // String location = Attack.class.getResource("/Pokemon.json").getPath().toString();
			  /*Object obj = parser.parse(new FileReader("D:\\Pokemon.json"));
		      JSONObject json = (JSONObject) obj;		      
		      Name = (JSONArray) json.get("name");
		      level = (String) json.get("Lv");*/
		     		       
		  }catch(Exception e)
		  {
			
		  }	
   }
   
}
