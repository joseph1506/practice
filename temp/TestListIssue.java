package practice.temp;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class TestListIssue {

    public static void main(String args[]){
        List<String> names= newArrayList();
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");

        for(String name:names){
           // for(int i=0;i<names.size();i++){
            System.out.println("Name------>"+name);
            names=newArrayList();
        }

        System.out.println("Size of List---->"+names.size());
    }


}
