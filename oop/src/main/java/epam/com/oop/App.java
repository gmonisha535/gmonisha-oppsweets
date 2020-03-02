package epam.com.oop;

import java.io.*;
import java.util.*;
public class App {
    public static void main( String[] args )
    {
        List<Sweets> ls=new ArrayList<>();
        Sweets s1=new Choco("silk","Fruit n Nut",120,150);
        ls.add(s1);
        Sweets s2=new Choco("dark fantacy","Oreo",95,100);
        ls.add(s2);
        Sweets s3=new Candy("milky bar","Milk",100,20);
        ls.add(s3);
        Sweets s4=new Candy("lollypop","Alpenlebae",15,5);
        ls.add(s4);
        ls.add(new Candy("ChocolateTruffle","Chocolate",300,150));
        ls.add(new Candy("Twizzilers","Fruits",150,90));
        ls.add(new Candy("CoffeeCrispy","Coffee",50,50));
        ls.add(new Candy("Chocolatefishy","Chocolate",500,300));
        ls.add(new Candy("HersheyBar","Milk",200,100));
        ls.add(new Candy("Lindt","PureChoco",30,45));
        List<Sweets> l1=new ArrayList<>();
		for(int i=0;i<ls.size();i++) {
        	if(ls.get(i) instanceof Choco){
        		l1.add(ls.get(i));
        	}
        }
        int sw=0;
        for(int j=0;j<ls.size();j++){
        	sw=sw+ls.get(j).weight;
        }
        System.out.println("Total weight in the gift is "+sw);
        Collections.sort(l1,new sortByCost());
        System.out.println("Cost increasing order is ");
        for(int i=0;i<l1.size();i++) {
        	System.out.println(l1.get(i).cost);
        }
        int ca0=0;
        int ca50=0;
        int ca100=0;
        for(int j=0;j<ls.size();j++){
        	if(ls.get(j) instanceof Candy) {
        	if(ls.get(j).cost>=0 && ls.get(j).cost<50){
        		ca0++;
        	}
        	else if(ls.get(j).cost>=50 && ls.get(j).cost<100){
        		ca50++;
        	}
        	else{
        		ca100++;
        	}
        }
        }
        System.out.println("Total count of candies in the gift above 0 are "+ca0);
        System.out.println("Total count of candies in the gift above 50 are "+ca50);
        System.out.println("Total count of candies in the gift above 100 are "+ca100);
    }
}
