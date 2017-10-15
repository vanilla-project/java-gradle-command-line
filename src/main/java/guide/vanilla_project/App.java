package guide.vanilla_project;

import java.io.PrintStream;

public class App {
    private PrintStream output;

    public App(PrintStream output) {
        this.output = output;
    }

    public void run() {
        Example example = new Example();

        output.println(example.greeting());
    }
}
