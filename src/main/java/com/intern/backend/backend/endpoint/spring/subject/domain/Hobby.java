package com.intern.backend.backend.endpoint.spring.subject.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_HOBBY")
public class Hobby {
	
	@EmbeddedId
	private HobbyPk hobbyPk;
	
}
