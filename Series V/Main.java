#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=11;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {int p=pow(s,2);
   std::cout<<p<<" ";
   s=s+4;
  }
}