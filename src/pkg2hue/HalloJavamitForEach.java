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

    public HalloJavamitForEach() {
    }
    
    
    List<String> list = new ArrayList<>();
    
    public void printMyCumList(){
        this.list.add("Cum");
        this.list.add("Piss");
        for(String s: this.list){
            System.out.println(s);
        }
    }
}
