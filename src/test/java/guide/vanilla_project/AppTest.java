package guide.vanilla_project;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class AppTest {
    @Test
    public void printsGreeting() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        App app = new App(new PrintStream(output));

        app.run();

        assertThat(output.toString(), containsString("Java Example"));
    }
}
