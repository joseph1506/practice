package practice.abstractfactory.factory;

import practice.abstractfactory.products.Button;
import practice.abstractfactory.products.EditBox;
import practice.abstractfactory.products.LinuxButton;
import practice.abstractfactory.products.LinuxEditBox;

public class LinuxLookAndFeel extends LookAndFeel{

    @Override
    public Button createButton() {
        return new LinuxButton();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public EditBox createEditBox() {
        return new LinuxEditBox();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
