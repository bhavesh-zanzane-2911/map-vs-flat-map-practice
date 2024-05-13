package org.bhavesh.mapvsflat.practice;

import org.bhavesh.mapvsflat.practice.model.EmployeeExperience;
import org.bhavesh.mapvsflat.practice.model.Person;
import org.bhavesh.mapvsflat.practice.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class MapVsFlatMapBehavorPractise {

    private static final Logger LOG = LoggerFactory.getLogger(MapVsFlatMapBehavorPractise.class);

     /**
     * Retrieves a person by their name from the list of persons.
     *
     * @param name The name of the person to retrieve.
     * @return The person object with the specified name.
     * @throws RuntimeException If no person with the specified name is found.
     */
    public static Person getPersonByName(String name) {
        // Retrieve the list of persons
        List<Person> personsList = PersonService.getPersonsList();

        // Filter out persons with the specified name
        Optional<Person> firstPerson = personsList.stream()
                .filter(person -> name.equals(person.getName()))
                .findFirst();

        // Return the first person found with the specified name, or throw an exception if not found
        return firstPerson.orElseThrow(RuntimeException::new);
    }


    /**
     * Retrieves the Aadhar number of a person by their name from the list of persons.
     *
     * @param name The name of the person whose Aadhar number is to be retrieved.
     * @return The Aadhar number of the person with the specified name.
     * @throws RuntimeException If no person with the specified name is found or if the Aadhar number is not available.
     */
    public static Integer getAddharNumberByName(String name) {
        // Retrieve the list of persons
        List<Person> personsList = PersonService.getPersonsList();

        // Filter out persons with the specified name and retrieve their Aadhar numbers
        Optional<Integer> addharNumberOptional = personsList.stream()
                .filter(person -> name.equals(person.getName()))
                .map(Person::getAddharNo)
                .findFirst();

        // Return the Aadhar number of the first person found with the specified name, or throw an exception if not found or Aadhar number is not available
        return addharNumberOptional.orElseThrow(RuntimeException::new);
    }


    /**
     * Retrieves the total work experience of a person by their name using map operation.
     *
     * @param name The name of the person whose work experience is to be retrieved.
     * @return A list of lists containing work experiences of the person with the specified name.
     *         If no person with the specified name is found, an empty list is returned.
     */
    public static List<List<EmployeeExperience>> getExperienceByNameUsingMap(String name) {
        // Retrieve the list of persons
        List<Person> personsList = PersonService.getPersonsList();

        // Filter out persons with the specified name and map their total experience
        // map operation extracts the total experience of each person
        return personsList.stream()
                .filter(person -> name.equals(person.getName()))
                .map(Person::getTotalExperience)
                .toList();
    }


    /**
     * Retrieves the total work experience of a person by their name using flatMap operation.
     *
     * @param name The name of the person whose work experience is to be retrieved.
     * @return A list of work experiences of the person with the specified name.
     *         If no person with the specified name is found, an empty list is returned.
     */
    public static List<EmployeeExperience> getExperienceByNameUsingFlatMap(String name) {
        // Retrieve the list of persons
        List<Person> personsList = PersonService.getPersonsList();

        // Filter out persons with the specified name and flatMap their total experience
        // flatMap takes a stream as input
        return personsList.stream()
                .filter(person -> name.equals(person.getName()))
                .flatMap(person -> person.getTotalExperience().stream())
                .toList();
    }


    /**
     * Retrieves the names of companies where a person has worked by their name using flatMap operation.
     *
     * @param name The name of the person whose companies' names are to be retrieved.
     * @return A list of company names where the person with the specified name has worked.
     *         If no person with the specified name is found, an empty list is returned.
     */
    public static List<String> getCompaniesByNameUsingFlatMap(String name) {
        // Retrieve the list of persons
        List<Person> personsList = PersonService.getPersonsList();

        // Filter out persons with the specified name, flatMap their total experience,
        // and map their company names
        // flatMap takes a stream as input
        return personsList.stream()
                .filter(person -> name.equals(person.getName()))
                .flatMap(person -> person.getTotalExperience().stream())
                .map(EmployeeExperience::getCompanyName)
                .toList();
    }




}