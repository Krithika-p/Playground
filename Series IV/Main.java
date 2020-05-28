#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
   
    s=i*i;
    if(s%2==0)
    {s=s-2;}
    else
    {s=s-1;}
    std::cout<<s<<" ";
  }
}