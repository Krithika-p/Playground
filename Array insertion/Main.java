#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  std::cout<<"\nEnter the elements in the array";
  int a[n+1];
  for(int i=0;i<n;i++)
  {std::cin>>a[i];}
  std::cout<<"\nEnter the location where you wish to insert an element";
  int pos;
  std::cin>>pos;
  
  
  if(pos<n && pos>0)
  {std::cout<<"\nEnter the value to insert";
   int val;
  std::cin>>val;
  for(int j=n-1;j>=pos-1;j--)
  {a[j+1]=a[j];
  }
   a[pos-1]=val;
 
std::cout<<"\nArray after insertion is";
  for(int i=0;i<=n;i++)
  {std::cout<<"\n"<<a[i];}
  }
  else
  {std::cout<<"\nInvalid Input";}
  
}