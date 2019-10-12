/*
author: Bryan Nonni
program: create a class with states
date: 09/10/2018
*/

public class StatesMutatorsAccessors{
 //2 states: x and y
 private int x;
 private int y;
 //2 mutators; "set" indicates a mutator
 public void setX(int dx){
  x = dx;
 }
 public void setY(int dy){
  y = dy;
 }
 //2 accessors; "get" indicates an accessor method
 public int getx(){
  return x;
 }
 public int getY(){
  return y;
 }
 public void translate(int dx, int dy){
  x = x + dx;
  y = y + dy;
 }
}