#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   float mileage;
 int petrol,dis;
 std::cin>>mileage>>petrol>>dis;
 int res=mileage*petrol;
 if(res>=dis)
 {
   std::cout<<"Can reach";
 }
 else
 {
   std::cout<<"Cannot reach";
 }
}