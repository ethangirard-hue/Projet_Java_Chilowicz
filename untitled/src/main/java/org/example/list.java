package org.example;

public class list {
    public String ListName;
    public String element=null;
    private Integer LengthList=0;

    list(String listName){
        this.ListName=listName;
    }

    public String[] empty_list(String NewName){
        return new String[0];
    }

    public  String append(list my_list , String[] NewElement){
        LengthList=LengthList+NewElement.length;
        return element;
    }

    public Integer len(list my_list){
        return LengthList;
    }
}
