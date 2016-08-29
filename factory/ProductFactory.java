package practice.factory;

import org.apache.commons.lang.StringUtils;

public class ProductFactory {
    public static Product createProduct(String productType){
        if(StringUtils.isNotEmpty(productType) && productType.equalsIgnoreCase("Product1")){
            return new Product1();
        } else{
            return new Product2();
        }
    }
}
