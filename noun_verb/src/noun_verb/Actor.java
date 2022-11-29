/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noun_verb;

/**
 *
 * @author amsia
 */
public class Actor {
   String name;
   String DOB;
   String Place_of_birth;
   String Other_names;
   String Occupation;
   int active_years;
   String spouse;
   String Children;
   String awards;
   void acting()
   {
       System.out.println(name+" can do Acting.");
   }
   void dancing()
   {
       System.out.println(name+" can do Dancing.");
   }
   void singing()
   {
       System.out.println(name+" can do Singing.");
   }
   class Singer extends Actor
   {
       Singer(){
           super.name="Prakash";
           super.Occupation="Acting";
       }
       Singer(String name1,String Place_of_birth1)
       {
           super.name=name1;
           super.Place_of_birth=Place_of_birth1;
       }
   }
}
