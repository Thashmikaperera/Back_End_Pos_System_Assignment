package lk.ijse.gdse65.back_end_assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO{
    private String customerId;
    private String customerName;
    private String city;
    private String email;
}