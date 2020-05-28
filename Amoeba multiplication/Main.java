#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int month;
  std::cin>>month;
  int i=0,a[month];
  while(i<=month)
  {
   if(i==0)
   {a[i]=0;
   }
    else if(i==1)
    {a[i]=1;}
    else
    {a[i]=a[i-1]+a[i-2];}
    i++;
   }
   std::cout<<a[month-1];
}