/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocollection;

import java.time.Year;
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
        Auto a2 = new Auto ("Ford", "Transit", 2009, 3000, "Diesel");
        Auto a3 = new Auto ("Fiat", "500", 2015, 500, "Petrol");
        Auto a4 = new Auto ("VW", "Passat", 2013, 2000, "Petrol");
        Auto a5 = new Auto ("Scoda", "Octavia", 2017, 1600, "Diesel");
        
        List<Auto> autos = new ArrayList<>();
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);
        autos.add(a4);
        autos.add(a5);
        
        System.out.println("Autos sorted by models: ");
        class AutoComparator implements Comparator<Auto>{
            public int compare(Auto a1, Auto a2){
                return a1.getModel().compareTo(a2.getModel());
            }
        }
        List model2 = autos.stream()
                .sorted(new AutoComparator())
                .collect(Collectors.toList());
        model2.forEach((x) -> System.out.println(x));
        
        System.out.println(" ");
        System.out.println("Autos with motor capacity higher than 1500: ");
         List model = autos.stream()
                .filter(auto -> auto.getMotorCapacity() > 1500)
                .collect(Collectors.toList());
        model.forEach((x) -> System.out.println(x));
//        for(Object auto : model)
//            System.out.println(auto);
        
        System.out.println(" ");
        System.out.println("Autos older than 10 years: ");
        List model1 = autos.stream()
                .filter(auto -> Year.now().getValue() - auto.getYear() > 10)
                .collect(Collectors.toList());
        model1.forEach((x) -> System.out.println(x)); 
//        for(Object auto : model1)
//            System.out.println(auto);
        
        System.out.println(" ");
        System.out.println("Autos filtred by fuel type: ");
        Map<String, List<Auto>> auto = autos.stream()
                .collect(Collectors.groupingBy(a -> a.getType()));
        auto.forEach((key, value) -> {System.out.println(key + ": " + value);});
    }
}