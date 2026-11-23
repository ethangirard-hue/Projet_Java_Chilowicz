package org.example;

public class list {
    public String [] element;
    private Integer LengthList=0;

    list(String element){
        this.element=element.split(",");
    }

    public String[] empty_list(){
        return new String[0];
    }

    public  String append(list my_list , String[] NewElement){
        LengthList=LengthList+NewElement.length;
        for (int i=0;i<LengthList;i++){
            return  my_list.element[i]+NewElement[i];
        }
        return "";
    }

    public Integer len(list my_list){
        return LengthList;
    }
}
