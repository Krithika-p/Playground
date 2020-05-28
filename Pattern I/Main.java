#include<iostream>
int main()
{
 int s;
 std::cin>>s;
 int n=s;
 for(int i=1;i<=4;i++)
 {
  for(int j=1;j<=i;j++)
  {std::cout<<n;}
  n++;
  std::cout<<"\n";
  }
  n--;
  for(int i=4;i>=1;i--)
 {
  for(int j=1;j<=i;j++)
  {std::cout<<n;}
  std::cout<<"\n";
  n--;
 }
}