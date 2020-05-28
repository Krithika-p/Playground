#include<iostream>

using namespace std;
int main()
{
  //Type your code here.
  int rail;
  string door;
  cin>>door>>rail;
  string s("front");
  int c= door.compare(s);
  if(c==0)
  {
    if(rail==1)
    {cout<<"Left Handed";}
    else
    {cout<<"Right Handed";}  
  }
  else
  {
    if(rail==1)
    {cout<<"Right Handed";}
    else
    {cout<<"Left Handed";}
  }
}