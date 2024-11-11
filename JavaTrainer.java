package com.qn.spring.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jt")
@Scope("prototype")
public class JavaTrainer {
		private String name;
		
		@Autowired
		public JavaTrainer(@Value("Rudresh sir") String name) {
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
