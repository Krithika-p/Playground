#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b1,b2,b3,c,b,l;
  cin>>b1>>b2>>b3;
  if(b1>b2 && b1>b3)
  { l=b1;
    if(b2>b3)
      {b=b2;}
    else
      {b=b3;}
  }
  else if(b2>b1 && b2>b3)
  {l=b2;
    if(b1>b3)
    {b=b1;}
    else
    {b=b3;}
  }
  else{l=b3;
      if(b1>b2)
      {b=b1;}
       else
       {b=b2;}
      }
  cout<<"The treasure is in box which has number "<<b;
  for(int i=1;i<l;i++)
  {
  if(b1%i==0 && b2%i==0 && b3%i==0)
  {c=i;}
  }
  cout<<"\nThe code to open the box is "<<c;
}