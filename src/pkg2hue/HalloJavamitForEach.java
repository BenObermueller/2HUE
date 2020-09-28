/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2hue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ben Obermüller
 */
public class HalloJavamitForEach {
    List<String> list = new ArrayList<>();
    
    public HalloJavamitForEach() {
        list.add("Cum");
        list.add("Piss");
        list.add("CumBabay");
    }
    
    
    
    public void printMyCumList(){ 
        for(String s: this.list){
            System.out.println(s);
        }
    }
    
    public void printMyCumList2(){
        this.list.forEach((String s) -> System.out.println(s));
    }
}
