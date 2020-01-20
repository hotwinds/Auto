/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocollection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Comparator;

/**
 *
 * @author Александр
 */
public class AutoCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto ("Volvo", "CX90", 2016, 2500, "Petrol");
        Auto a2 = new Auto ("Ford", "Transit", 2012, 3000, "Diesel");
        Auto a3 = new Auto ("Fiat", "500", 2015, 500, "Petrol");
        Auto a4 = new Auto ("VW", "Passat", 2013, 2000, "Petrol");
        Auto a5 = new Auto ("Scoda", "Octavia", 2017, 1600, "Diesel");
        
        List<Object> autos = new ArrayList<>();
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);
        autos.add(a4);
        autos.add(a5);
        
        
        List<String> type = autos.stream()
                .filter(Auto -> Auto.getType().equalsIgnoreCase("Diesel"))
                .map(auto -> auto.getType())
                .collect(Collectors.toList());
        
        
        Collections.sort(autos, getModel());
         for(Object temp : autos){
            System.out.println(temp);
         }
        //autos.sort(Comparator.Model());
//        List<String> Model = autos.stream()
//                .sorted()
//                .map(auto -> auto.getModel())
//                .collect(Collectors.toList());
//        System.out.println(Model);
        
//        List<String> Model = autos.stream()
//                .map(auto -> auto.getModel())
//                .collect(Collectors.toList());
//        System.out.println(Model);
        
        
//        Map<String, List<Auto>> auto = autos.stream()
//                .collect(Collectors.groupingBy(a -> a.getModel()));
//        System.out.println(auto);
        
        

    }
    
}
