package models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class product {
	   
	    @Id
		int id;	
		String name;
		Double price;
		String category;
		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Double getPrice() {
			return price;
		}


		public void setPrice(Double price) {
			this.price = price;
		}


		
		

		 public product(int id,String name, Double price,String category) {
		    this.id = id;
			 this.name = name;
		    this.price = price;
		    this.category = category;
		 }

		 public product()
		 {
			 
		 }

		
		
}
