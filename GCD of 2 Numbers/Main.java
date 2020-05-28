#include<iostream>
int gcd(int s,int a,int b)
{
if(a%s==0 && b%s==0)
  return s;
else
  gcd(s-1,a,b);
  

}

int main()
{
  //Type your code here.
  int n1,n2;
  std::cin>>n1>>n2;
  int s;
  if(n1<n2)
  {s=n1;}
  else
   s=n2;
  std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd(s,n1,n2);
}