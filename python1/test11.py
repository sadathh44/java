number=6
sum=0
for i in range(1,6):
    if(number%i==0):
        sum+=i
if sum==number:
    print("its a perfect number")
else:
    print("it aint")