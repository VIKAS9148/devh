package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();

        // Path to JSON file
        FileReader reader = new FileReader(".\\JSON\\student.json");

        Object obj = jsonparser.parse(reader);
        JSONObject studentobj = (JSONObject) obj;

        String fname = (String) studentobj.get("firstname");
        String lname = (String) studentobj.get("lastname");

        System.out.println("Firstname: " + fname);
        System.out.println("Lastname: " + lname);
    }
}
