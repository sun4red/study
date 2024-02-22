import random

if 'a' in ['a', 2, 'c']:
    print("t")

if 'j' not in "python":
    print("t")
else:
    print("f")

print("="*20)

pocket = ['paper', 'cellphone']
card = True
if 'money' in pocket:
    print("택시")
elif card:
    print("카드결제")
else:
    print("걸어가")

print("="*20)

a = 0

while a<=10 :
    a+=1

    print("a=" + str(a))

# a++ 형식이 없네?

print("end")

a = 0
while a<100:
    a+=1
    b = random.randint(1,100)

    print('a=' + str(a))
    print('b=' + str(b))
    print('-'*10)
    if b == 100:
        print("break!")
        break
print("end")
