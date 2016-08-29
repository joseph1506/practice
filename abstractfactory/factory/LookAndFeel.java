package practice.abstractfactory.factory;

import practice.abstractfactory.products.Button;
import practice.abstractfactory.products.EditBox;

public abstract class LookAndFeel {
    public abstract Button createButton();
    public abstract EditBox createEditBox();

}
