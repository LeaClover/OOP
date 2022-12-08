package com.gb;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gb.data.BottleMachine;
import com.gb.data.Drinks;
import com.gb.data.HotDrinks;
import com.gb.data.HotDrinksMachine;
import com.gb.data.HotMeal;
import com.gb.data.HotMealMachine;
import com.gb.data.Machine;
import com.gb.data.Product;
import com.gb.data.SnackMachine;
import com.gb.data.Snacks;

public class Main {
    
    public static void main(String[] args) throws Exception{

        StringBuilder sb = new StringBuilder();

        sb.append("123");
        FileWriter fw = new FileWriter("Text.csv");
        fw.write(sb.toString());
        fw.close();

        // List<Product> list = new ArrayList<Product>(Arrays.asList(
        //     new Snacks("Twix", 1.5, "Choco"),
        //     new Snacks("Mars", 1.25, "Choco")
        // ));
        
        // Machine snackM = new SnackMachine(list);
        // String key = "Mars";
        // System.out.println(snackM.getProduct(key));

        // List<Product> listB = new ArrayList<Product>(Arrays.asList(
        //     new Drinks("Sprite", 2.5, 0.5),
        //     new Drinks("Coca-Cola", 1.5, 0.33)
        // ));

        // Machine bottleMachine = new BottleMachine(listB);
        // String keyB = "Sprite";
        // System.out.println(bottleMachine.getProduct(keyB));

        // List<Product> listHotDrinks = new ArrayList<Product>(Arrays.asList(
        //     new HotDrinks("Latte", 1.5, 0.4, 95),
        //     new HotDrinks("Tea", 1.0, 0.35, 100),
        //     new HotDrinks("Capuccino", 1.25, 0.4, 95)
        // ));

        // HotDrinksMachine hotDrinksMachine = new HotDrinksMachine(listHotDrinks);
        // String keyHD = "Tea";
        // Double vol = 0.35;
        // int temp = 100;
        // System.out.println(hotDrinksMachine.getProduct(keyHD, vol, temp));

        // List<Product> listHotMeal = new ArrayList<Product>(Arrays.asList(
        //     new HotMeal("Spaghetti Bolognese", 4.5, "Meat"),
        //     new HotMeal("Teriyaki Chicken", 3.25, "Chicken"),
        //     new HotMeal("Ratatouille", 2.75, "Vegetable")
        // ));

        // Machine hotMealMachine = new HotMealMachine(listHotMeal);
        // String keyHM = "Ratatouille";
        // System.out.println(hotMealMachine.getProduct(keyHM));
    }
}
