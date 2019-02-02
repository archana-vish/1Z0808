package com.oca.lamdas;

import java.util.*;

public class RemoveIf {
	
	int value;
	RemoveIf(int value){
        this.value = value;
    }
    public String toString(){ return ""+value; }
    
    public static void main(String[] args) {
    	RemoveIf[] dataArr = new RemoveIf[]{ new RemoveIf(1), new RemoveIf(2), new RemoveIf(3), new RemoveIf(4) };

        List<RemoveIf> dataList = new ArrayList<>();
        dataList.add(new RemoveIf(1));
        dataList.add(new RemoveIf(2));
        dataList.add(new RemoveIf(3));
        dataList.add(new RemoveIf(4)); //1



            dataList.removeIf( (RemoveIf d) -> { return d.value%2 ==  0; } );  //2

        
        System.out.println("Removed "+dataList+", "); //3
   }      

}
