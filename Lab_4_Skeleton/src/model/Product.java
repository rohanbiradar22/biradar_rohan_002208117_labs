/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import static com.sun.tools.javac.code.Directive.ExportsFlag.value;
import java.util.ArrayList;
import java.util.List;
import static javax.management.Query.value;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;

    private ArrayList<Feature> features;
    
    private static  int count = 0;
    private Object value;

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public static int getCount() {
        return count;
    }
    public Feature addNewFeature() {
        Feature newFeature = new Feature(this, name, value);
        features.add(newFeature);
        return newFeature;
    }
    

    public static void setCount(int count) {
        Product.count = count;
    }
//    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Product [ID: " + id + ", Name: " + name + ", Price: " + price + "]";
        
    }

    
    
    
    
}
