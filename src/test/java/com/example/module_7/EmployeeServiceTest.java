
package com.example.module_7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    void shouldReturnEmployeeWhenEmployeeExists() {
        // Arrange
        Employee employee = new Employee(
                "Satyam",
                "satyam@example.com"
        );

        when(employeeRepository.findById(1L))
                .thenReturn(Optional.of(employee));

        // Act
        Optional<Employee> result =
                employeeService.getEmployeeById(1L);

        // Assert
        assertThat(result).isPresent();
        assertThat(result.get().getName()).isEqualTo("Satyam");

        verify(employeeRepository).findById(1L);
    }


    @Test
    void shouldReturnEmptyWhenEmployeeDoesNotExist() {
        // Arrange
        when(employeeRepository.findById(99L))
                .thenReturn(Optional.empty());

        // Act
        Optional<Employee> result =
                employeeService.getEmployeeById(99L);

        // Assert
        assertThat(result).isEmpty();

        verify(employeeRepository).findById(99L);
    }

}
