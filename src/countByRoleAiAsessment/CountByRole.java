package countByRoleAiAsessment;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
	private final int id;
	private final String name;
	private final Role role;
	
	public String getName() {
		return name;
	}

	public Role getRole() {
		return role;
	}

	public User(int id, String name, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
}

record UserDto(int id, String name, String role) {}

class Role {
	private final int id;
	private final String name;
	
	public String getName() {
		return name;
	}

	public Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

record RoleDto(int id, String name) {}

public class CountByRole {

	public static void main(String[] args) {
		
		Role dev = new Role(1,"Developer");
		Role qa = new Role(2,"Tester");
		Role pm = new Role(3,"Project Manager");
		
		List<User> users = List.of(
				new User(101, "Nick Fury", pm),
				new User(102, "Tony Stark", dev),
				new User(103, "Wanda", qa),
				new User(104, "Bruice wayn", pm),
				new User(105, "Steve Roger", dev),
				new User(106, "Natasha", qa),
				new User(107, "Peter", dev)
		);
		
		Map<String, Long> roleCounts = countByRole(users);
		
		roleCounts.forEach((role, count) ->
			System.out.println(role + " -> " + count)
		);
		
	}


public static Map<String, Long> countByRole(List<User> users) {
    if (users == null || users.isEmpty()) {
        return Collections.emptyMap();
    }

    return users.stream()
            .collect(Collectors.groupingBy(
                    user -> {
                        Role role = user.getRole();
                        if (role == null || role.getName() == null || role.getName().isBlank()) {
                            return "Unknown";
                        }
                        return role.getName();
                    },
                    Collectors.counting()
            ));
	}
}
