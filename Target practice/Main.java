#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int target;
  std::cin>>target;
  int sum=0,count=0;
  do{int n;
  std::cin>>n;
  sum+=n;
  count++;
  }while(sum<target);
  std::cout<<"The number of turns is "<<count;
}