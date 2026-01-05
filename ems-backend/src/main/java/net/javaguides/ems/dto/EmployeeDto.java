package net.javaguides.ems.dto;

import jakarta.persistence.Column;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;



}
