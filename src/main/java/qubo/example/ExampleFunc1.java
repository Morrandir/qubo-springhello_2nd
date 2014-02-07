package qubo.example;

/**
 * Created by Qubo_Song on 1/9/14.
 */

public class ExampleFunc1 {

    private final Long id;
    private final String content;

    public ExampleFunc1(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getID() {
        return id;
    }

    public String getContent() {
        return content;
    }

}