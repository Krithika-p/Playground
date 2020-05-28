#include<iostream>
int main()
{
int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {for(int j=1;j<=i-1;j++)
  {
   std::cout<<i<<"*";
  }
   std::cout<<i<<"\n";
  
  }
   for(int i=n;i>0;i--)
  {for(int j=1;j<=i-1;j++)
  {
   std::cout<<i<<"*";
  }
   std::cout<<i<<"\n";
  
  }
}