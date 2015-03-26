/*
* g++ -c firstlib.cpp -o firstlib.o
* ar rcs libFirstLib.a firstlib.o
* g++ main.cpp -L. -lFirstLib -o main
* ./main
*/
#include <iostream>
#include <string>
#include "firstlib.h"
using namespace std;
void printGreeting()
{
cout << "Welcome to C++ Library Programming" << endl;
}

void weatherForecast(int ndays)
{
 if(ndays > 3 || ndays < 0)
 {
  cout<< "Sorry, incompatitible amount of days"<<endl;
 }
 else
 {
  for(int i =0; i<ndays;i++)
  {
   cout<< "on day " << i<<" The weather will be: \n"<<endl;
   if(i == 1)
   cout<< "High in degrees C(<10) and no rainfall, \nwindspeed of 23 \ndirection of northwest\n"<<endl;
   else if(i ==2)
   cout<<"Low in degrees c(>10) and high rainfall,\n windspeed of 32 \ndirection of south\n"<<endl;
   else
	cout<<"Mid level degrees c(10) and no rainfall, \nwindspeed of 10 \ndirection of north\n"<<endl; 
   }
 }
}

void getMyLocation(string& ref)
{
 ref = "Dublin, Ireland";
}


