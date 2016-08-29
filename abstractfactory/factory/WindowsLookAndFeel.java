package practice.abstractfactory.factory;

import practice.abstractfactory.products.Button;
import practice.abstractfactory.products.EditBox;
import practice.abstractfactory.products.WindowsButton;
import practice.abstractfactory.products.WindowsEditBox;

public class WindowsLookAndFeel extends LookAndFeel{
    @Override
    public Button createButton() {
        return new WindowsButton();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public EditBox createEditBox() {
        return new WindowsEditBox();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
