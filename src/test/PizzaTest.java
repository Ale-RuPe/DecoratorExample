package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import decorator.Barbeque;
import decorator.FarmHouse;
import decorator.FreshTomato;
import decorator.Margheritta;
import decorator.Paneer;
import decorator.Pizza;
import decorator.PizzaA;

public class PizzaTest {

    @Test
    public void MargheritaTest() {
        // create new margherita pizza 
        PizzaA pizza = new Margheritta(); 
        assertEquals(pizza.getDescription(), "Margheritta");
        assertTrue(pizza.getCost() == 100);
    }

    @Test
    public void FreshTomatoTest() {
        // create new FarmHouse pizza 
        Pizza pizza2 = new FarmHouse(); 
        //descripcion : "FarmHouse" - x
        // decorate it with freshtomato topping 
        pizza2 = new FreshTomato(pizza2);
        //"farm house, fresh tomato"
        //cost: x + y
        //decorate it with paneer topping 
        pizza2 = new Paneer(pizza2); 
        //"farm house, fresh tomato"
        //cost: x + y + z
        assertEquals(pizza2.getDescription(), "FarmHouse, Fresh Tomato , Paneer ");
        assertTrue(pizza2.getCost() == 310);
    }

    @Test
    public void NullTest() {
      Pizza pizza3 = new Barbeque(null);    //no specific pizza 
      assertNotNull(pizza3);
      //causes NullPointerException
      //pizza3.getDescription()
    }
}