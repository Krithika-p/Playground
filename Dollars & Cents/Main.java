#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,ds=0,cs=0;
  cin>>d1>>c1>>d2>>c2;
  ds=d1+d2;
  cs=c1+c2;
  if(cs>=100)
  {
   ds=ds+1;
   cs=cs-100;
  }
  cout<<ds<<"\n"<<cs;
}