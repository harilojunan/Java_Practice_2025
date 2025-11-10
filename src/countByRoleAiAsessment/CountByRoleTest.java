package countByRoleAiAsessment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CountByRoleTest {

	@Test
	void testEmptyList() {
		Map<String, Long> result = CountByRole.countByRole(Collections.emptyList());
        assertTrue(result.isEmpty(), "Result should be empty for empty input");	
    }
	
	@Test
    void testAllWithRoles() {
		Role dev = new Role(1, "Developer");
        Role qa = new Role(2, "Tester");
        
        List<User> users = List.of(
                new User(1, "Alice", dev),
                new User(2, "Bob", qa),
                new User(3, "Charlie", dev)
        );
        Map<String, Long> result = CountByRole.countByRole(users);
        assertEquals(2, result.size());
        assertEquals(2L, result.get("Developer"));
        assertEquals(1L, result.get("Tester"));
    }

    @Test
    void testMissingRoles() {
    	Role dev = new Role(1, "Developer");
    	Role na = new Role(2, "Unknown");
    	
        List<User> users = List.of(
                new User(1, "Alice", na),
                new User(2, "Bob", na),
                new User(3, "Charlie", dev)
        );
        Map<String, Long> result = CountByRole.countByRole(users);
        assertEquals(2, result.size());
        assertEquals(2L, result.get("Unknown"));
        assertEquals(1L, result.get("Developer"));
    }

    @Test
    void testMixedRoles() {
    	Role dev = new Role(1, "Developer");
        Role qa = new Role(2, "Tester");
        Role pm = new Role(3, "Project Manager");
        Role na = new Role(3, "Unknown");
        
        List<User> users = List.of(
                new User(1, "Alice", dev),
                new User(2, "Bob", qa),
                new User(3, "Charlie", na),
                new User(4, "David", pm),
                new User(5, "Eve", na)
        );
        Map<String, Long> result = CountByRole.countByRole(users);
        assertEquals(4, result.size());
        assertEquals(1L, result.get("Tester"));
        assertEquals(1L, result.get("Developer"));
        assertEquals(1L, result.get("Project Manager"));
        assertEquals(2L, result.get("Unknown"));
    }

}
