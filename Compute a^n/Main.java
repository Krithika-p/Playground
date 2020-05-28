#include<iostream>
using namespace std;
int pow(int a,int n)
{ int res;
  if(n==0)
  {return res;}
  else if(a<=1 || n==1)
    res= a;
  else
    res= a*pow(a,n-1);
  

}
int main()
{
  //Type your code here.
  int a,n;
  std::cout<<"Enter the value of a";
  std::cin>>a;
  std::cout<<"\nEnter the value of n";
  std::cin>>n;
  std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}