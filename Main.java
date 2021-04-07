import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main 
{
  public static void main(String[] args)
  {
    ArrayList<Person> people = new ArrayList<Person>();
    Person person1 = new Person("Sam", 21, "Blue");
    Person person2 = new Person("A", 87, "Pink");
    Person person3 = new Person("B", 13, "Yellow");
    Person person4 = new Person("C", 55, "Black");
    Person person5 = new Person("D", 4, "Green");
    people.add(person1);
    people.add(person2);
    people.add(person3);
    people.add(person4);
    people.add(person5);

    String name = "", age = "", color = "";
    FileWriter toWriteFile;

    try 
    {
      toWriteFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(toWriteFile);
      int tempNum;
      String tempStr = "";
      for (int i = 0; i < 5; i++) 
      {
        output.write(people.get(i).getName());
        tempNum = people.get(i).getAge();
        tempStr = Integer.toString(tempNum);
        output.newLine();
        output.write(tempStr);
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
        
      } 
      output.close();
    }
    catch (IOException excpt)
    {
      excpt.printStackTrace();
    }

    try
    {
      //System.out.println("its getting Here");
      FileReader myFile;
      myFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(myFile);

      while (reader.ready())
      {
        //System.out.println("Here too");
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();
        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
        //System.out.println(name + "\t" + age + "\t" + color);
      }
      reader.close();
    }

    catch(IOException excpt)
    {
      excpt.printStackTrace();
    }
  }
}
