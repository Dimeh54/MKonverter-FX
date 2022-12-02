package fr.yghore.Components;

public class CodeLine extends Component
{


    CodeLine(Component text) {
        super(text);
    }



    @Override
    public String toMarkDown() {
        return "``" + this.text + "``";
    }

}
