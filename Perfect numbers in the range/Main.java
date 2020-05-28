#include<iostream>
int main()
{
 int f,l,sum;
  std::cin>>f>>l;
  for(int i=f;i<l;i++)
  {sum=0;
    for(int j=1;j<i;j++)
    { 
      if(i%j==0)
      {sum=sum+j;}
    }
   if(sum==i)
   {std::cout<<i<<" ";}
  }
  return 0;
}