class Person
{
  String name;
  int age;
  String color;

  Person()
  {
    name = "";
    age = 0;
    color = "";

  }

  Person(String setName, int setAge, String setColor)
  {
    name = setName;
    age = setAge;
    color = setColor;
  }

  String getName()
  {
    return name;
  } 

  int getAge()
  {
    return age;
  }

  String getColor()
  {
    return color;
  }
}