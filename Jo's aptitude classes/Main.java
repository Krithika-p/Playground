#include<iostream>
int gcd(int a, int x,int y,int z)
{int g;
  while(a>0)
  {
  if(x%a ==0 && y%a==0 && z%a==0)
  {g=a;
  break;}
    a--;
  }
 return g;
}
  
  
  int main()
{
int x,y,z,res,small;
std::cin>>x>>y>>z>>res;
  if(x<y && x<z)
  {small=x;}
  else if(y<x && y<z)
  {small=y;}
  else
  {small=z;}
  int gc=gcd(small,x,y,z);
    if(gc==res)
      std::cout<<"Answer is correct.";
    else
      std::cout<<"Answer is wrong.";
}