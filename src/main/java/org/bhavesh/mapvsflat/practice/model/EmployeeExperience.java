package org.bhavesh.mapvsflat.practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class EmployeeExperience {

    private Integer employeeId;
    private String companyName;
    private Integer experience;
    private List<String> languagesKnown;
}
