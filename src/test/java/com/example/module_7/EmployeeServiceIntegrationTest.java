
package com.example.module_7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class EmployeeServiceIntegrationTest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void shouldIntegrateServiceAndRepository() {
        // Arrange
        Employee employee = new Employee(
                "Satyam",
                "integration@example.com"
        );

        Employee savedEmployee = employeeRepository.save(employee);

        // Act
        Optional<Employee> result =
                employeeService.getEmployeeById(
                        savedEmployee.getId()
                );

        // Assert
        assertThat(result).isPresent();
        assertThat(result.get().getName()).isEqualTo("Satyam");
        assertThat(result.get().getEmail())
                .isEqualTo("integration@example.com");
    }
}
