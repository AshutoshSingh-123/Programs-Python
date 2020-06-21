# Enter your code here. Read input from STDIN. Print output to STDOUT
s=map(int,input().split())
l=list(s)
x=l[0]
y=l[1]
# print(l)
# for d in l:
#     print(d)
v=1

for i in range(int(x/2)):
    print(('-'*(int(y/2)-1-(i*3)))+'.|.'*v+('-'*(int(y/2)-1-(i*3))))
    v+=2
print('-'*(int((y-7)/2))+'WELCOME'+'-'*int(((y-7)/2)))
v=v-2
for i in range(int(x/2)):
    print(('-'*(int(3)+(i*3)))+'.|.'*v+('-'*(int(3)+(i*3))))
    v-=2
