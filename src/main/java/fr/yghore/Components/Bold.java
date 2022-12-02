package fr.yghore.Components;

public class Bold extends Component
{


    public Bold(Component text) {
        super(text);
    }



    @Override
    public String toMarkDown() {
        return "**" + text + "**";
    }

}
