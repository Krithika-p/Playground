#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  std::cin>>r>>c>>n;
  int l=c*r-c;
  if(((n>c)&&(n<=(c*2)))||((n<=l)&&(n>=(l-c))))
  {std::cout<<"It is a mango tree";}
  else
  {std::cout<<"It is not a mango tree";}
}