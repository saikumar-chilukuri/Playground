#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year;
  std::cin>>year;
  (year%4 == 0) ? std::cout<<year<<" is a leap year" : std::cout<<year<<" is not a leap year";
}