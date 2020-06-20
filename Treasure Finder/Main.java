#include<iostream>
using namespace std;
int main()
{ 
int a,b,c,d,i;
  cin>>a >>b >>c;
d=1;
i=1;
while(i<=a&&i<=b&&i<=c){
if(a%i==0&&b%i==0&&a%i==0)
d=i;
i++;
}
  if(a>b&&a>c)
  {

	if(b>c)
    {
	printf("The treasure is in box which has number %d\n",b);
    }
	else
    {
	printf("The treasure is in box which has number %d\n",c);
    }
  }

    if(b>a&&b>c)
    {

	if(a>c)
    {
	printf("The treasure is in box which has number %d\n",a);
    }
	else
    {
	printf("The treasure is in box which has number %d\n",c);

    }
    }
    if(c>a&&c>b)
    {

	if(b>a)
    {
	printf("The treasure is in box which has number %d\n",b);
    }
	else
    {
	printf("The treasure is in box which has number %d\n",a);
    }
    }
  cout<<"The code to open the box is " <<d;
}
  