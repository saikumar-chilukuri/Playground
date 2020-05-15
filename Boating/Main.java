#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f;
  std::cin>>a>>b>>c;
  d = b*75;
  e = c*30;
  f = d+e;
  if(f<=a){
    std::cout<<"Boat is stable";
  } else{
    std::cout<<"Boat will drow";
  }
}