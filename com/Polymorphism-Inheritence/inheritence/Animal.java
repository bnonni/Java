// •	Write 2 classes to represent the relationship between a dog, a fish and an animal.
// •	The class Animal has 1 state: name
// •	The class Dog has its own state: the number of legs
// •	The class Fish has its own state: the number of fins

//super class
public class Animal{
 private String name;
}
//sub class -- java keyword 'extends' indicates the relationship
public class Dog extends Animal{
 private int num_of_legs;
}

public class Fish extends Animal{
 private int num_of_find;
}