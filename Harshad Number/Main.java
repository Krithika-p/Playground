#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int sum=0,rem=0,nu=n;
  while(nu!=0)
  {
   rem=nu%10;
   sum=sum+rem;
   nu=nu/10;
  }
  if((n%sum)==0)  
  {cout<<"Harshad Number";}
  else
   {cout<<"Not Harshad Number";}
        
  
}