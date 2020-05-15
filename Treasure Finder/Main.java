#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,i,j,k;
  std::cin>>a>>b>>c;
  if(a>b&& a>c){
    if(b>c){
      k = b;
    } else{
      k = c;
    }
  } else if(b>a&& b>c){
      if(a>c){
        k = a;
      } else {
        k = c;
      } 
  } else if(a>b){
    k=a;
  } else{
    k=b;
  }
  std::cout<<"The treasure is in box which has number "<<k<<"\n";
  
  for(i=1;i<=5;i++) {
    if(a%i ==0 && b%i==0 && c%i==0){
      j=i;
    }
  }
  std::cout<<"The code to open the box is "<<j;
}