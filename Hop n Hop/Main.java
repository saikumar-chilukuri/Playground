#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a1=3,b1=4,a2,b2;
  double p1,p2,p3,s;
  std::cin>>a2>>b2;
  p2 = pow((a2-a1),2);
  p3 = pow((b2-b1),2);
  p1 = p2+p3;
  s = sqrt(p1);
  std::cout<<int(s);
  //Type your code here.
}