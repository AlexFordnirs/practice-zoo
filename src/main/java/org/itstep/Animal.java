package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class  Animal
{ public static void main(String[] args) {}
   private   String name;
    private  String eat;
    private  String hesh;
    private  double weight;
    private  int aviary_number;
    private  int time_spent_in_the_zoo;
public Animal(String name,String eat,String hesh,double weight,int aviary_number,int time_spent_in_the_zoo)
{
    this.name=name;
    this.eat=eat;
    this.hesh=hesh;
    this.weight=weight;
    this.aviary_number=aviary_number;
    this.time_spent_in_the_zoo=time_spent_in_the_zoo;
}
    private ArrayList<Animal> Animals_name = new ArrayList<Animal>();
    public void SetInfo()
    {
        Animals_name.add(new Animal(name,hesh,eat,weight,aviary_number,time_spent_in_the_zoo));
    }
    public  void SoutInfo()
    {
        for (Animal i:Animals_name)
        {
            System.out.println(i);
        }
    }
}
/*class Info extends Animal
{
    ArrayList<String> Animals_name = new ArrayList<String>();

    public Info(String name, String eat, String hesh, double weight, int aviary_number, int time_spent_in_the_zoo) {
        super(name, eat, hesh, weight, aviary_number, time_spent_in_the_zoo);
    }
    void infoSet()
    {Animal an= new Animal( name,  eat,  hesh,  weight,  aviary_number,  time_spent_in_the_zoo);
        Animals_name.add()
    }
}*/
