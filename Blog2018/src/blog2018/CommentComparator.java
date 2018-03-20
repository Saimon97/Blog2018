/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog2018;

import java.util.Comparator;

/**
 *
 * @author Student
 */
public class CommentComparator implements Comparator<Comment>{

    @Override
    public int compare(Comment o1, Comment o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
     
    }
    
    
    
}
