package com.vanilla.inventory.entity.commons;

import java.util.Calendar;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class MetaObject {

	@Id
    @GeneratedValue(generator = "sequence-generator")
    @org.hibernate.annotations.GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @org.hibernate.annotations.Parameter(name = "sequence_name", value = "common_sequence"),
        @org.hibernate.annotations.Parameter(name = "initial_value", value = "100"),
        @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
        }
    )
	private long id;
	
	private Calendar created = Calendar.getInstance();
	private Calendar deleted;
	private Calendar modified;
	
	
}
