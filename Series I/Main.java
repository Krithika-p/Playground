#include<iostream>
int main()
{
 int n;
  float s=0.5;
  std::cin>>n;
 for(int i=1;i<=n;i++)
 {
   std::cout<<s<<" ";
   s=s*3;
 }
}