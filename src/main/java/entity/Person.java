package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Person")
public class Person {
    @Id
    private String id;
    private String nome;
    private String cognome;

    @Indexed(unique=true)
    private String mail;
}
