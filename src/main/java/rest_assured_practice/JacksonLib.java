package rest_assured_practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import rest_assured_practice.multipleUsers.MultipleUser;
import rest_assured_practice.users.Users;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JacksonLib {

    public static void main(String args[]) throws IOException {

        // byte conversion of json file
        byte[] userJsonData = Files.readAllBytes(Paths.get("/Users/keshavsharma/Desktop/frameworks/api_auto_rest_assured_java/src/main/java/rest_assured_practice/request_json/User.json"));
        // creating object of type ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // returning object of User class
        Users users = mapper.readValue(userJsonData, Users.class);
//        System.out.println(users.getFirstName());
//        System.out.println(users.getAddress().getFlatNo());
//        System.out.println(users.getAddress().getAbc().getPin());

        byte[] multipleUserJsonData = Files.readAllBytes(Paths.get("/Users/keshavsharma/Desktop/frameworks/api_auto_rest_assured_java/src/main/java/rest_assured_practice/request_json/MultipleUsers.json"));
        // returning object of MultipleUser class
        MultipleUser[] multipleUsers = mapper.readValue(multipleUserJsonData, MultipleUser[].class);
//        System.out.println(multipleUsers[0].getMobile().get(0));
//        System.out.println(multipleUsers[1].getFirstName());
        for (MultipleUser mu : multipleUsers) {
            if (mu.getLastName().equals("Four")) {
                System.out.println(mu.getAddress().getAbc().get(1).getPin());
                System.out.println(mu.getMobile().get(1));
            }
        }
    }
}
