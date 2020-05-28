#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int k,n=0,d,s,r,sum=0;
  std::cin>>k;
  int sq=pow(k,2);
  int i=sq;
  while(i!=0)
  {
   int rem=i%10;
    n++;
    i=i/10;
  }
  if(n>1)
  {d=pow(10,int(n/2));
  s=k;
  r=s%d;
  s=s/d;
  sum=r+s;
  }
  else
  {sum=sq;} 
  if(sum == k)
  {std::cout<<"Kaprekar Number";}
  else
  {std::cout<<"Not a Kaprekar Number";}
  

}