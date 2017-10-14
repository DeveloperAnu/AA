/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linga
 */
public class Maruti extends Car
{
public void steering()
{
    System.out.println("This has manual steering");
}
public void brakes()
{
    System.out.println("hydrolic brakes");
}

public static void main(String args[])
{
    Maruti m=new Maruti();
    
    m.fuleTank();
    m.steering();
    m.brakes();
}
}
