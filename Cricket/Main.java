#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,x,y;
  std::cin>>a>>b>>x>>y;
  float m = a/6;
  float n = y/6;
  float p = y%6;
  float k = ((float)n + (float)p/10);
  float d = x/k;
  float f = b/m;
  std::cout<<m<<"\n";
  std::cout<<fixed<<setprecision(1)<<k<<"\n";
  std::cout<<d<<"\n"<<f<<"\n";
  if(d>f){
    std::cout<<"Eligible to Win";
  } else {
    std::cout<<"Not Eligible to Win";
  }
}