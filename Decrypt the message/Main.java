#include<iostream>
using namespace std;
int main()
{
int n1,n2,i,r,c=0;
  cin>>n1 >>n2;
  int n=n1+n2;
for(i=1;i<n;i++)
{
  r=n%i;
  if(r==0)
  {
    c=c+i;
  }
}
  
  if(c==n)
  {
    cout<<"They can read the message";
  }
else
{
cout<<"They can't read the message";

}
}