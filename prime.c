#include<stdio.h>
int main()
{
  int n,i,flag=0;
  printf("Enter the number you want to check:");
  scanf("%d",&n);
  for(i=0;i<=n/2;i++)
  {
    if(i%n==0)
    {
      flag=1;
    }
  }
  if(flag==0)
  {
    printf("%d is a prime number",n);
  }
  else
  {
    printf("%d is not a prime number",n);
  }
 return 0;
}
