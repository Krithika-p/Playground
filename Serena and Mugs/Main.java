#include<iostream>
using namespace std;
int printresult(int r,int s)
{
if(r>s)
{std::cout<<"NO";}
else
  {std::cout<<"YES";}

}
int main()
{
  //Type your code here.
  int n,s,res=0;
  std::cin>>n>>s;
  int vm[n];
  for(int i=0;i<n;i++)
  {std::cin>>vm[i];}
  for(int j=0;j<n;j++)
  {
   res+=vm[j];
  }
  printresult(res,s);
  
}