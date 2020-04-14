package com.example.gete.plugin.model.entity;

import com.example.gete.plugin.view.SerializeView;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@JsonView(SerializeView.Simple.class)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @CreatedDate
    //@Builder.Default
    @JsonIgnore
    @Column(name = "created_at", nullable = false, columnDefinition = "DATETIME(6)")
    protected LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    //@Builder.Default
    @JsonIgnore
    @Setter
    @Column(name = "updated_at", nullable = true, columnDefinition = "DATETIME(6)")
    protected LocalDateTime updatedAt = LocalDateTime.now();

    @PreUpdate
    protected void setUpdatedAt() {
        this.updatedAt = LocalDateTime.now();
    }

    public BaseEntity() {
    }
}
