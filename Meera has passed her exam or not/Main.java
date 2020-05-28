#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n],f,flag=0;
  for(int i=0;i<n;i++)
    {std::cin>>a[i];}
  std::cin>>f;
  for(int j=0;j<n;j++)
  {
    if(a[j]==f)
    {flag=1;
    break;}
  }
  if(flag==1)
  {std::cout<<"She passed her exam";}
  else
    std::cout<<"She failed";
  
}