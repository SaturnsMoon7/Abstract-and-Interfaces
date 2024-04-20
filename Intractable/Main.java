package Intractable;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Practice Problem #2");
        System.out.println();

        Button newButton = new Button();
        newButton.OnMouseClick();
        newButton.OnMouseHover();

        System.out.println();
        
        TextBox newTextBox = new TextBox();
        newTextBox.OnKeyPress();
        newButton.OnMouseHover();
        System.out.println("Size of textbox is:" + newTextBox.getSize());

        System.out.println();
    }
}