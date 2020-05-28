#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t,ht;
  cin>>n>>t;
  if(n<=3)
  {
    if(n==3)
      {
      ht=2*t;
      cout<<ht;
      }
    else if(n==2)
      {
      ht=((t*50)/100)+t;
      cout<<ht;
      }
    else
     { cout<<t;}
   }
  else
  {cout<<"Number of items is more";}
}