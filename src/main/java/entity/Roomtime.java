package entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;
import java.util.Date;

@Data
@Document("Time")
public class Roomtime {
    private String id;
    private Date date;
    private String start;
    private String end;
    private Person person;

}
