package dotEqualsAndHashCode;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if(e.id == this.id && e.name.equals(this.name))
			return true;
		else
			return false;
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}
