#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,ev=0,odd=0;
  std::cin>>n;
  while(n!=0)
  {
   int rem = n%10;
   if(rem%2==0)
   {ev+=rem;}
    else
    {odd+=rem;}
    n=n/10;
  }
  if(ev==odd)
  {std::cout<<"Yes";}
  else
  {std::cout<<"No";}
}