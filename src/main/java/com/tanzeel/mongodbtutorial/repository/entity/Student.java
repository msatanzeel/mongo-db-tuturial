package com.tanzeel.mongodbtutorial.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    @CreatedDate
    private Date createdDate;
    @LastModifiedBy
    private Date updatedDate;

}
