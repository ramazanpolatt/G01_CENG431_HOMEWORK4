package com.company;

import com.company.Decorator.AbstractPizzaDecorator;
import com.company.Decorator.BasilLeaves;
import com.company.Decorator.Salami;
import com.company.Pizza.IPizza;
import com.company.Pizza.Pizza;
import com.company.Pizza.PizzaType;
import com.company.PizzaStore.AbstractPizzaStore;
import com.company.PizzaStore.MamaJonesPizzaStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


/*

        AbstractPizzaStore pizzaStore = new MamaJonesPizzaStore();
        int count=0;
        for (String info:pizzaStore.getAvailablePizzas()
             ) {
            count+=1;
            System.out.println(count+"-)  "+info);
        }
        IPizza selectedPizza= pizzaStore.orderPizza(0);

        count=0;
        for (String info:pizzaStore.getAvailableToppings()
        ) {
            count+=1;
            System.out.println(count+"-)  "+info);
        }



        selectedPizza=pizzaStore.addTopping(selectedPizza,0);
        System.out.println(selectedPizza);
        selectedPizza=pizzaStore.addTopping(selectedPizza,1);
        System.out.println(selectedPizza);
*/

        PizzaStoreApp pizzaStoreApp = new PizzaStoreApp();
        pizzaStoreApp.showAvailablePizzaStores();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a pizzaStore");
        int pizzaStoreIndex= scanner.nextInt();
        pizzaStoreApp.selectPizzaStore(pizzaStoreIndex);
        pizzaStoreApp.showAvailablePizzas();

    }
}
