package org.practice;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentDemo {

    public static void main(String[] args) {
        try {
            // Create an instance of ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Create a new Student object
            Student student = new Student("John Doe", 20, "A");

            // Serialize the Student object to JSON
            String jsonString = objectMapper.writeValueAsString(student);
            System.out.println("Serialized JSON: " + jsonString);

            // Deserialize the JSON string back to a Student object
            Student deserializedStudent = objectMapper.readValue(jsonString, Student.class);
            System.out.println("Deserialized Student: " + deserializedStudent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

