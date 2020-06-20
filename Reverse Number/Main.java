#include<iostream>
using namespace std;
int main() 
{
	int n,i,s=0;
  cin>>n;
  while(n>0)
  {
    i=n%10;
    s=s*10+i;
    n=n/10;
  }
    cout<<s;
	return 0;
}