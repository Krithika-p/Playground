#include<iostream>
  int fib(int);

int main () 
{ 
    int n;
    std::cin>>n;
    std::cout << "The term "<<n<<" in the fibonacci series is "<<fib(n); 
    getchar(); 
    return 0; 
}
int fib(int n) 
{ int res;
    if (n <= 1) 
        res=n; 
    else if(n==3)
        res=1;
   else
       res=(fib(n-2) + fib(n-1)); 
  return res;
} 
  