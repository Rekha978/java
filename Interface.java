interface Animal
{
    void sound();
}
class Dog implements Animal
{
    @Override
    public void sound()
    {
        System.out.println("The dog is barking");
    }
}
class Interface{
    public static void main(String args[])
    {
        Animal myDog=new Dog();
        myDog.sound();
    }
}
