/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog2018;

import java.time.LocalDateTime;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comment c = new Comment("adam","jakiś tekst", LocalDateTime.of(2018, 3, 20, 11, 19, 30, 0));
        Comment c1 = new Comment("pioter","jakiś tekst 2", LocalDateTime.of(2018, 3, 19, 11, 19, 30, 0));
        Comment c2 = new Comment("szymon","jakiś tekst 3", LocalDateTime.of(2018, 3, 18, 11, 19, 30, 0));
        
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        
        TreeSet set = new TreeSet();
        set.add(c);
        set.add(c1);
        set.add(c2);
        System.out.println(set);
    }
    
}
