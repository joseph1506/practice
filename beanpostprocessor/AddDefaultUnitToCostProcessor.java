package practice.beanpostprocessor;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class AddDefaultUnitToCostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

         Class objectClass=bean.getClass();
         Field[] objectFields=objectClass.getDeclaredFields();

        if(objectClass.equals(practice.beanpostprocessor.Commodity.class)){
            System.out.println("");
        }


         for(Field field:objectFields){
             if(field.getType().equals(String.class) && field.isAnnotationPresent(practice.beanpostprocessor.AddUnit.class)){
                 try {
                     field.setAccessible(true);
                     String value=(String)field.get(bean);
                     if(StringUtils.isNotEmpty(value)){
                         value=value+ "INR";
                         field.set(bean,value);
                     }
                 } catch (IllegalAccessException e) {
                     e.printStackTrace();
                 }
             }
         }
         return bean;
    }
}
