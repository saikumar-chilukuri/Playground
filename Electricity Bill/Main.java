#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a;
  if(a<=200)
    std::cout<<"Rs."<<int(0.5*a);
  else if(a<=400)
cout<<"Rs."<<int((0.65*a)+100);
else if(a<=600)
cout<<"Rs."<<int((0.80*a)+200);
else
cout<<"Rs."<<int((1.25*a)+425);
}