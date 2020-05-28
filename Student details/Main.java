#include<iostream>
#include<string.h>
using namespace std;
struct student{
char name[200];
char dept[50];
int y;
float cgpa;
}t;
int main()
{int n,i,j;
 std::cout<<"Enter the number of students";
 std::cin>>n;
  struct student s[n];
 for(i=0;i<n;i++)
 {
 std::cout<<"\nEnter the details of student "<<i+1;
   std::cout<<"\nEnter name";
   scanf("%s",&s[i].name);
   std::cout<<"\nEnter department";
   std::cin>>s[i].dept;
    std::cout<<"\nEnter year of study";
   std::cin>>s[i].y;
      std::cout<<"\nEnter cgpa";
   std::cin>>s[i].cgpa;
}
 for(i=0;i<n;i++)
     {
          for(j=i+1;j<n;j++)
          {
               if(strcmp(s[i].name,s[j].name)>0)
               {
                    t=s[i];
                    s[i]=s[j];
                    s[j]=t;
               }
          }
     }
 
 
 std::cout<<"\nDetails of students";
 
for(i=0;i<n;i++)
 {
     std::cout<<"\nStudent "<<i+1;
     std::cout<<"\nName:"<<s[i].name;
     std::cout<<"\nDepartment:"<<s[i].dept;
     std::cout<<"\nYear of study:"<<s[i].y;
     std::cout<<"\nCGPA:"<<s[i].cgpa;}}