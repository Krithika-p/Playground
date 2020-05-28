#include<iostream>
int main()
{
 int n,m,s,sum=0;
  std::cin>>n>>m;
  s=n+m;
  for(int i=1;i<s;i++)
  { if(s%i==0)
  {sum=sum+i;}
  }
  if(sum==s)
  {std::cout<<"They can read the message";}
  else
  {std::cout<<"They can't read the message";}
  return 0;
}