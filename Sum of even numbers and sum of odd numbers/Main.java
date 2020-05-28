#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a[n],sume=0,sumo=0;
  for(int i=0;i<n;i++)
  {std::cin>>a[i];
   if(a[i]%2==0)
     sume+=a[i];
   else
     sumo+=a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<sume;
  std::cout<<"\n"<<"The sum of the odd numbers in the array is "<<sumo;
  
}