/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal_inteface;

/**
 *
 * @author amsia
 */
interface Swimmer
{
    void swim();
}
interface Player
{
    void play();
}
public abstract class animal implements Swimmer,Player{
}
class dog extends animal
{
    @Override
    public void swim()
    {
        System.out.println("Dog is swimming");
    }
    @Override
    public void play()
    {
        System.out.println("Dog is playing");
    }
}
class cat extends animal
{
    @Override
    public void swim()
    {
        System.out.println("Cat is swimming");
    }
    @Override
    public void play()
    {
        System.out.println("Cat is playing");
    }
}
