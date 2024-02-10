package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {

    private UUID id;
    private UUID StydentID;
    private String Techonology;
    private int rate;
    List<AnswersCertificationsEntity> answersCertificationsEntities;
}
