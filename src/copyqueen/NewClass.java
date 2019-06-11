/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyqueen;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * @author Tarun Narain
 */
public class NewClass {
        public static void main(String args[])
        {
        Field[] fields = java.awt.event.KeyEvent.class.getDeclaredFields();
for (Field f : fields) {
    if (Modifier.isStatic(f.getModifiers())) {
        System.out.println(f.getName());
    } 
}
        }
}
