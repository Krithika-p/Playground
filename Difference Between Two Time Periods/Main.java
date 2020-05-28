#include<iostream>
using namespace std;
struct time{
int h,m,s;
}t1,t2,d;

int main()
{
  //Type your code here.
  std::cin>>t1.h>>t1.m>>t1.s;
  std::cin>>t2.h>>t2.m>>t2.s;
  if(t2.s > t1.s)
    {
        --t1.m;
        t1.s += 60;
    }

    d.s = t1.s - t2.s;
    if(t2.m > t1.m)
    {
        --t1.h;
        t1.m += 60;
    }
    d.m = t1.m-t2.m;
    d.h = t1.h-t2.h;
  std::cout<<d.h<<":"<<d.m<<":"<<d.s;
}