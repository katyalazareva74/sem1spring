package homework.service;

import homework.model.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class InputOutput {

    public void writeJson(Person person) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try (FileWriter writer = new FileWriter("person.json");) {
            writer.write(gson.toJson(person));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Person readJson() {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Person person = new Person();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("person.json"));
            person = gson.fromJson(bufferedReader, Person.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return person;
    }

}
