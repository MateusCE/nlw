package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class verifyIfHasCertificationDTO {
    private String email;
    private String technology;

    public verifyIfHasCertificationDTO(verifyIfHasCertificationDTO veryHasCertificationDTO) {
    }
}
