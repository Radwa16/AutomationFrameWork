package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JSONDataReader {
    public String email,firstname,lastname,password,day,month,year,company,address,city,state,
            zipcode,country,phone;

    public void Jsonreader() throws IOException, ParseException {
        String path = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
        File file = new File(path);
        JSONParser parser = new JSONParser();
        JSONArray JArray = (JSONArray) parser.parse(new FileReader(path));

        for (Object JsonObject : JArray)
        {
            JSONObject persons  = (JSONObject) JsonObject;
            firstname = (String) persons.get("firstname");
            lastname = (String) persons.get("lastname");
            email = (String) persons.get("email");
            password = (String) persons.get("password");
            day = (String) persons.get("day");
            month = (String) persons.get("month");
            year = (String) persons.get("year");
            company = (String) persons.get("company");
            address = (String) persons.get("address");
            city = (String) persons.get("city");
            state = (String) persons.get("state");
            zipcode = (String) persons.get("zipcode");
            country = (String) persons.get("country");
            phone = (String) persons.get("phone");
        }

    }
}
