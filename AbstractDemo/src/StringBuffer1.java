/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linga
 */
public class StringBuffer1 {
    
    public static void main(String args[]){
        
        StringBuffer s=new StringBuffer("hello");
        StringBuffer s1=new StringBuffer("how r u ?");
        
        s = s.append(s1);
        
        System.out.println("print hashcode of s:"+s.hashCode());
        System.out.println("print hashcode of s1:"+s1.hashCode());
        System.out.println("the hashcode of s:"+s.hashCode());
        
        
        
    }
    
}
