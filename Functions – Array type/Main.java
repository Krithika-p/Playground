#include<iostream>
using namespace std;
string at(int n,int *a)
{
int o,e;
  o=e=0;
  for(int i=0;i<n;i++)
  {
   if(a[i]%2==0)
   {e++;}
    else
    {o++;}
 }
  if(e>0 && o>0)
  {return "Mixed";}
  else if(e>0)
  {return "Even";}
  else
  {return "Odd";}

}


int main()
{
  //Type your code here.
  int n;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  int a[n];
  std::cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
  {std::cin>>a[i];}
  std::cout<<"\nThe array is "<<at(n,a);  
}