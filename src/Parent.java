 class Parent
{
    public void show()
    {
        System.out.println("this is parent class");
    }
}
class child extends Parent
{
    public void display()
    {
        System.out.println("this is child class");
    }
}
class shrisht extends child
{
    public void music()
     {
         System.out.println("shrisht dev is sing a song");
     }
}
  class test
  {
      public static void main(String[] args)
      {
           shrisht s=new shrisht();
            s.show();
            s.music();



      }
  }
