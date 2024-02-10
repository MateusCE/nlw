package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertificationsEntity {
    private UUID id;
    private UUID CertificationID;
    private UUID StudentID;
    private UUID questionID;
    private UUID answerID;
    private Boolean isCorrect;
}
