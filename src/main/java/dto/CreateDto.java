package dto;

import lombok.Getter;

@Getter
public class CreateDto {

    String name;
    String job;

    public CreateDto (String name, String job){
        this.name = name;
        this.job = job;
    }


}
