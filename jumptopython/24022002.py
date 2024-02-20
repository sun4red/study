cut = '='*20

# 1.
l1 = [80, 75, 55]
s = 0
for a in l1:
    s += a

cnt = len(l1)
print(s/cnt)

print(cut)

# 2.
n = 13
if(n%2 == 0):
    print("n은 짝수")
else:
    print("n은 홀수")

print(cut)

# 3.
pin = '881120-1068234'
yymmdd = pin[:6]
num = pin[7:]
print(yymmdd)
print(num)
