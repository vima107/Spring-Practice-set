package com.qn.spring.spring_di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("st")
@Scope("prototype")
public class SqlTrainer {
	private String name;

	public SqlTrainer(@Value("Bharath sir") String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
