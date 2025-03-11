
package com.mycompany.mavenproject2;


public class Mavenproject2 {

    public static void main(String[] args) {
        
        double tax =0.2,total=0.0;
        
        System.out.println("Hello World!");
        
        Customer c1=new Customer();
        c1.name="pinkey";
        c1.size="S";
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description="blue jacket";
        item1.price=20.9;
        item2.size="M";
        
        item2.description="Orange tshirt";
        item2.price=10.5;
        item2.size="S";
        
        System.out.println("item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
        System.out.println("item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
        
        total= (item1.price + item2.price *2)*(1+tax);
        
        System.out.println("Total=" +total);
        
        int measurement= 3;
        
        switch(measurement){
            
            case 1,2,3:
                c1.size="S";
                break;
            case 4,5,6:
                c1.size="M";
                break;
            case 7,8,9:
                c1.size="L";
                break;
                default:
                c1.size="XL";
        }
    }
}
