#include<iostream>
using namespace std;
int main()
{
 int n,n1,s=0,s1=0;
  cin>>n;
  while(n>0)
  {
	n1=n%10;
    if(n1%2==0)
    {
		s=s+n1;
    }
    else
    {
      s1=s1+n1;
    }
    n=n/10;
  }
  if(s==s1)
  {
	cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}
