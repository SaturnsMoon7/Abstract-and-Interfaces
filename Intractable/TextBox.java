package Intractable;

public class TextBox extends Intractable
{
    @Override
    public void OnMouseClick()
    { System.out.println("Textbox has been clicked"); }

    public void OnKeyPress()
    { System.out.println("Textbox has been pressed by key"); }
}