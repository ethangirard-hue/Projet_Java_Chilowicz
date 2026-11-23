package org.example;

public class list {
    public String element;
    private Integer LengthList=0;

    list(String element){
        this.element=element;
    }

    public  String add(list my_list , String NewElement){
        LengthList++;
        return element+NewElement;
    }

    public Integer len(list my_list){
        return LengthList;
    }
}
