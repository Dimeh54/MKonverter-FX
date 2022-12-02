package fr.yghore.Components;

public class Italic extends Component
{


    public Italic(Component text) {
        super(text);
    }

    @Override
    public String toMarkDown() {
        return "__" + text + "__";
    }

}
