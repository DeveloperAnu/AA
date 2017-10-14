/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linga
 */
public class StringImmutable {
    
    public static void main(String args[]){
        
        String s = "hello";
        String s1="anusha";
        String s2= s.concat(s1);
        
        System.out.println("print reference value of s:"+s.hashCode());
        System.out.println("the value of s1:"+s1.hashCode());
        System.out.println("the hashcode of s2:"+s2.hashCode());
        
    }
    
}
