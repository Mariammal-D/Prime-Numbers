n=int(input("Enter the number you want to check:"))
flag=0
for i in range(0,n):
     if(i%n==0):
         flag=1
     i=i+1
if(flag==0):
    print(n," is a prime number")
else:
    print(n," is not a prime number")
