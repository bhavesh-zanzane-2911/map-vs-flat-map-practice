package org.bhavesh.mapvsflat.practice.service;

import org.bhavesh.mapvsflat.practice.model.EmployeeExperience;
import org.bhavesh.mapvsflat.practice.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.bhavesh.mapvsflat.practice.service.EmployeeService.*;

public class PersonService {

    public static List<Person> getPersonsList(){
        Person p1=new Person(1, "Bhavesh",getEmployeeExperience("Bhavesh"));
        Person p2=new Person(2, "Adesh",getEmployeeExperience("Adesh"));
        Person p3=new Person(3, "Yogita",getEmployeeExperience("Yogita"));
        return Arrays.asList(p1,p2,p3);
    }



}
