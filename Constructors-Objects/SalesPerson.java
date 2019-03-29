/*
author: Bryan Nonni
date: 09-12-2018
project: Project 6, Question 1
description: 

Write 2 classes in this problem.
A. Write a Java class called SalesPerson that has
	2 states: name and sales and 
 1 default constructor
	1 constructor with given name and sales
	2 getters and 
	2 setters and 
	1 computeBonus method that return $100 if sales > $1000, otherwise $0.
	1 toString method

B. Write a Java class called TestSalesPerson to test the constructors, getters, setters, computeBonus method, and the toString method.

C. Copy the output from jGrasp to here:
*/
public class SalesPerson{
 //2 states: name and sales and 
 private String name;
 private double sales;

 //1 default constructor
 public SalesPerson(){
  name = "";
  sales = 0.0;
 }
 
 //1 constructor with given name and sales
 public SalesPerson( String name, double sales ){
  this.name = name;
  this.sales = sales;
 }
 //2 getters
 public String getName(){
  return name;  
 }
 public double getSales(){
  return sales;
 }

 //2 setters
 public void setName(String name){
  this.name = name;
 }
 public void setSales(double sales){
  this.sales = sales;
 }

 //1 computeBonus method that return $100 if sales > $1000, otherwise $0.
 public double computeBonus(){
  if(sales > 1000){
   return 100.00;
  }else{
   return 0.00;
  }
 }
 //1 toString method
 public String toString(){
  return "[name= "+name+",sales="+sales+"]"; 
 }

}