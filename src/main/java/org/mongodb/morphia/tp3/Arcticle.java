package org.mongodb.morphia.tp3;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Arcticle {
		@Id
		ObjectId id;
		String name;
		int stars;
		
		public ObjectId getId() {
			return id;
		}
		public void setId(ObjectId id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStars() {
			return stars;
		}
		public void setStars(int stars) {
			this.stars = stars;
		}
		
		public String toString() {
			return "Article [name=" + name + ", stars=" + stars + "]";
		}
}
