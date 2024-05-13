# Map vs FlatMap Behavior Practice

This project includes a set of methods for practicing the behavior of `map` and `flatMap` operations in Java streams. It contains methods to retrieve information about persons, such as their Aadhar number, work experience, and the companies they have worked for.

## Methods

### 1. `getPersonByName`

- **Description**: Retrieves a person by their name from the list of persons.
- **Parameters**:
    - `name` (String): The name of the person to retrieve.
- **Returns**:
    - `Person`: The person object with the specified name.
- **Throws**:
    - `RuntimeException`: If no person with the specified name is found.

### 2. `getAddharNumberByName`

- **Description**: Retrieves the Aadhar number of a person by their name from the list of persons.
- **Parameters**:
    - `name` (String): The name of the person whose Aadhar number is to be retrieved.
- **Returns**:
    - `Integer`: The Aadhar number of the person with the specified name.
- **Throws**:
    - `RuntimeException`: If no person with the specified name is found or if the Aadhar number is not available.

### 3. `getExperienceByNameUsingMap`

- **Description**: Retrieves the total work experience of a person by their name using map operation.
- **Parameters**:
    - `name` (String): The name of the person whose work experience is to be retrieved.
- **Returns**:
    - `List<List<EmployeeExperience>>`: A list of lists containing work experiences of the person with the specified name. If no person with the specified name is found, an empty list is returned.

### 4. `getExperienceByNameUsingFlatMap`

- **Description**: Retrieves the total work experience of a person by their name using flatMap operation.
- **Parameters**:
    - `name` (String): The name of the person whose work experience is to be retrieved.
- **Returns**:
    - `List<EmployeeExperience>`: A list of work experiences of the person with the specified name. If no person with the specified name is found, an empty list is returned.

### 5. `getCompaniesByNameUsingFlatMap`

- **Description**: Retrieves the names of companies where a person has worked by their name using flatMap operation.
- **Parameters**:
    - `name` (String): The name of the person whose companies' names are to be retrieved.
- **Returns**:
    - `List<String>`: A list of company names where the person with the specified name has worked. If no person with the specified name is found, an empty list is returned.

## Unit Tests

The project also includes unit tests for each method to ensure their correctness and functionality.

## Running Tests

To run the tests, execute the `MapVsFlatMapBehavorPractiseTest` class.

