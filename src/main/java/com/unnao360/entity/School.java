package com.unnao360.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class School {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private String classFrom;
private String address;
private int classTo;
private String type;
private String pinCode;
private String level;
private String village_name;
@ManyToOne
@JoinColumn(name="village_id")
private Village village;
}
