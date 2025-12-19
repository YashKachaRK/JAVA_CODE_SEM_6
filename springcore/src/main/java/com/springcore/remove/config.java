package com.springcore.remove;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages= "com.springcore.remove")
public class config {

		@Bean
		public Samosa getSamosa() {
			Samosa samosa = new Samosa();
			return samosa;
		}
		@Bean
		public St getSt() {
			St st = new St(getSamosa());
			return st;
			
		}
}
