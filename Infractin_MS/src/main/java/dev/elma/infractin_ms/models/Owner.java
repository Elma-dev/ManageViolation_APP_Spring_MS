package dev.elma.infractin_ms.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Owner {
    private long id;
    private String name;
    private Date birthDay;
    private String email;
}
