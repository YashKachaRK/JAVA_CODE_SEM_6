package com.springcore.remove;

import org.springframework.stereotype.Component;

//@Component
public class St {
		
	
		// add dependency 
		
	 	private Samosa samosa;
	 	
		public St(Samosa samosa) {
			super();
			this.samosa = samosa;
		}

		public Samosa getSamosa() {
			return samosa;
		}

		public void setSamosa(Samosa samosa) {
			this.samosa = samosa;
		}

		public void study() {
			this.samosa.display();
			System.out.println("Hello");
		}
}
