#include<iostream>
using namespace std;
struct College

{

char name[100];

char city[100];

int establishmentYear;

float passPercentage;

};

#include<stdio.h>

int main()
{
struct college{

char name[100];

char city[100];

int establishmentYear;

float passPercentage;

};

int n,i,j;

printf("Enter the number of colleges \n");

std::cin>>n;
  struct college stud[n];

j=1;

for(i=0;i<n;i++)
{printf("Enter the details of college %d \n",j);

printf("Enter name \n");

scanf("%s",stud[i].name);

printf("Enter city \n");

scanf("%s",stud[i].city);

printf("Enter year of establishment \n");

scanf("%d",&stud[i].establishmentYear);

printf("Enter pass percentage \n");

scanf("%f",&stud[i].passPercentage);
j++;}

j=1;

printf("Details of colleges \n");

for(i=0;i<n;i++)
{printf("College:%d \n",j);

printf("Name:%s \n",stud[i].name);

printf("City:%s \n",stud[i].city);

printf("Year of establishment:%d \n",stud[i].establishmentYear);

std::cout<<"Pass percentage:"<<stud[i].passPercentage<<"\n";

j++;

}

return 0;

}