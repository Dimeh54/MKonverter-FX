package fr.yghore.Components;

public class Component
{


    protected String text;

    public Component(String text)
    {
        this.text = text;
    }

    protected Component(Component component)
    {
        this.text = component.getText();
    }

    public String toMarkDown()
    {
        return this.text;
    }

    public String getText()
    {
        return this.text;
    }


}
