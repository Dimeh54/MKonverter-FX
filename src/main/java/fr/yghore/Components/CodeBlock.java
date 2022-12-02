package fr.yghore.Components;

public class CodeBlock extends Component
{

    private final String language;

    public CodeBlock(Component text) {
        super(text);
        this.language = null;
    }

    public CodeBlock(Component text, String code)
    {
        super(text);
        this.language = code;
    }

    @Override
    public String toMarkDown() {
        return "```" + ((this.language == null) ? "" : this.language) + text + "````";
    }

}
