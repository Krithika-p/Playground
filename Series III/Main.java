#include<iostream>
int main()
{
int n,s=6;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
   std::cout<<s<<" ";
   s=s+(5*i);
  }
}