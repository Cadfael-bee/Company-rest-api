package com.osdb.java.test.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Details about the company")
public class Company {
	
	@Id
	@ApiModelProperty(notes = "The unique id of the company")
	private long id;
	
	@ApiModelProperty(notes = "The name of the company")
	private String name;
	
	@ApiModelProperty(notes = "Company activity description")
	private String description;
	
	@ApiModelProperty(notes = "The date of foundation")
	private Date founded;
	
}
