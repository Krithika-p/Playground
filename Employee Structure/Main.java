#include<iostream>
using namespace std;
struct emp{
char name[200];
int id;
int age;
char des[50];
int sal;
};

int main()
{
  //Type your code here.
  struct emp e;
  std::cout<<"Enter name:";
  std::cin>>e.name;
    std::cout<<"\nEnter ID:";
  std::cin>>e.id;
  std::cout<<"\nEnter age:";
  std::cin>>e.age;
  std::cout<<"\nEnter designation:";
  std::cin>>e.des;
  std::cout<<"\nEnter Salary:";
  std::cin>>e.sal;
  std::cout<<"\nEmployee Details";
  std::cout<<"\nName of the Employee : "<<e.name;
  std::cout<<"\nID of the Employee : "<<e.id;
  std::cout<<"\nAge of the Employee : "<<e.age;
  std::cout<<"\nDesignation of the Employee : "<<e.des;
  std::cout<<"\nSalary of the Employee : "<<e.sal;

}