#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int a,b,a1,b1;
 std::cin>>a>>b;
 if(a>b){
   a1=a+1900;
   b1=b+2000;
   std::cout<<b1-a1;
 } else {
   a1=a+2000;
   b1=b+2000;
   std::cout<<b1-a1;
 }
}