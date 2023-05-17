package dev.elma.radar_ms.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Owner {
    private long id;
    private String name;
    private Date birthDay;
    private String email;
}
