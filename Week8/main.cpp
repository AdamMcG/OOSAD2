#include <iostream>
#include "firstlib.h"
using namespace std;
int main()
{
printGreeting();
weatherForecast(0);
weatherForecast(4);
weatherForecast(2);
weatherForecast(3);
string a = "";
getMyLocation(a);
cout<<a <<endl;
return 0;
}
