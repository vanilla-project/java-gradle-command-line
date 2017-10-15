package guide.vanilla_project;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ExampleTest {
    @Test
    public void providesExampleText() {
        Example example = new Example();

        assertThat(example.greeting(), equalTo("Java Example"));
    }
}