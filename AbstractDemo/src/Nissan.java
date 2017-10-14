/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linga
 */
public class Nissan extends Car


{

public void steering()
{
    System.out.println("power steering");
}

public void brakes()
{
    System.out.println("gas brakes");
}

public static void main(String args[])
{
    Nissan n=new Nissan();
    Car c_ref;
    c_ref=n;
    c_ref.brakes();
    n.steering();
    n.fuleTank();
}
}
