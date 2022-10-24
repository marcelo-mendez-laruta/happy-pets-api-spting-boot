package cloud.pirwa.happypetsapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(value="Pets")
@Data
public class petModel {
    @Id
    private String id;
    @Field(value="name")
    private String name;
    private String age;
    private String profileImage;
    @Field(value="ownerid")
    private String ownerId;
}
