package com.acl.rempill_app.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;



@Getter
@Setter
@Entity
@Table(name = "Remember")
public class RememberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "createdate")
    private LocalDate createDate;
    @Column(name = "alarm")
    private LocalDate alarm;

    public RememberEntity() {
    }

    public RememberEntity(Long id, String title, String description, LocalDate createDate, LocalDate alarm) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.alarm = alarm;
    }


}
