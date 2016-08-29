package practice.abstractfactory;

import practice.abstractfactory.factory.AbstractFactoryMaker;
import practice.abstractfactory.factory.LookAndFeel;
import practice.abstractfactory.products.Button;
import practice.abstractfactory.products.EditBox;

public class Client {

    public static void main(String args[]){
        LookAndFeel lookAndFeelWindows= AbstractFactoryMaker.getLookAndFeelFactory("windows");
        Button windowsButton= lookAndFeelWindows.createButton();
        EditBox windowsEditBox=lookAndFeelWindows.createEditBox();
        windowsButton.click();
        windowsEditBox.enterValue();

    }
}
