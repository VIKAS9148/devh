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

<student>
    <firstname>Sumanth</firstname>
    <lastname>Gowda</lastname>
</student>




package what.what;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;

public class ReadXML {
    public static void main(String[] args) {
        try {
            // Load XML file
            File file = new File("XML/student.xml");

            // Create SAX reader
            SAXReader reader = new SAXReader();

            // Read document
            Document document = reader.read(file);

            // Get root element
            Element root = document.getRootElement();

            // Read values
            String fname = root.elementText("firstname");
            String lname = root.elementText("lastname");

            // Print output
            System.out.println("First Name: " + fname);
            System.out.println("Last Name: " + lname);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
