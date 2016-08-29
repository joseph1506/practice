package practice.abstractfactory.factory;

import org.apache.commons.lang.StringUtils;

public class AbstractFactoryMaker {
    public static LookAndFeel lookAndFeel=null;

    public static LookAndFeel getLookAndFeelFactory(String os){
        if(StringUtils.isNotEmpty(os) && os.equalsIgnoreCase("windows")){
            return new WindowsLookAndFeel();
        }else if(StringUtils.isNotEmpty(os) && os.equalsIgnoreCase("linux")){
            return new LinuxLookAndFeel();
        }
        return lookAndFeel;
    }


}
