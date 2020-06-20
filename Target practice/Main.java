#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,s,a=0;
  cin>>n;
  while(sum<n)
  {
    cin>>s;
    sum=sum+s;
    a++;
  }
cout<<"The number of turns is "<<a;

}