#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,h,i;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int d1=(a*b)/100;
  int t1=a-d1+c;
  int d2=(d*e)/100;
  int t2=d-d2+f;
  int d3=(g*h)/100;
  int t3=g-d3+i;
  std::cout<<"In Flipkart Rs."<<t1;
  std::cout<<"\nIn Snapdeal Rs."<<t2;
  std::cout<<"\nIn Amazon Rs."<<t3<<"\n";
  
  if(t1<=t2 && t1<=t3) {
    std::cout<<"He will prefer Flipkart";
  } else if(t2<=t3 && t2<=t1){
    std::cout<<"He will prefer Snapdeal";
  } else {
    std::cout<<"He will prefer Amazon";
  }
}