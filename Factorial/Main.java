#include<iostream>
int fact(int n)
{
int f;
  if(n==1)
  {return 1;}
  else
  {return n*fact(n-1);}
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int f = fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<f;
}