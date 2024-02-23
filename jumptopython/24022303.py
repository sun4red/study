def print_kwargs(**kwargs):
    print(kwargs)

print_kwargs(a=1)

# 딕셔너리 형태로 저장

def t1 (a,b):
    return a*b, a+b

r1 = t1(3,4)
print (r1)

r1, r2 = t1(6,7)
print(r1, r2, end=" ")

def t2 (a, b, c = True):
    print(a)
    if c:
        print(b)
    else:
        print(a)

t2(1,3)

t2(5,4,False)


func = lambda x, y, z: x*y + z
result = func(1,5,7)
print (result)