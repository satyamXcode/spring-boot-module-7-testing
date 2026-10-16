package com.example.module_7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void shouldSaveAndFindEmployee() {
        // Arrange
        Employee employee = new Employee(
                "Satyam",
                "satyam@example.com"
        );

        // Act
        Employee savedEmployee = employeeRepository.save(employee);

        var foundEmployee = employeeRepository.findById(
                savedEmployee.getId()
        );

        // Assert
        assertThat(foundEmployee).isPresent();
        assertThat(foundEmployee.get().getName())
                .isEqualTo("Satyam");
        assertThat(foundEmployee.get().getEmail())
                .isEqualTo("satyam@example.com");
    }
}
