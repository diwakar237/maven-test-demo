package main.java.com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class appTest {
@Test
void testAdd() {
assertEquals(5, App.add(2, 3));
}
}
