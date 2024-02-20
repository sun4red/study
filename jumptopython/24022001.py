a = [1,2,3]
print(a)
print(id(a))

b = a
print(id(a))

a.append(4)
print(a)
print(id(a))
print(b)
print(id(b))


print("======")

c = b.copy()
print(id(b))
print(c)
print(id(c))
a.append(5)
print(b)
print(c)
print("a주소 : " + str(id(a)) + " 값 : " + str(a))
print("b주소 : " + str(id(b)) + " 값 : " + str(b))
print("c주소 : " + str(id(c)) + " 값 : " + str(c))

print(a is b)
print(a is c)
print(b is c)

cut = '='*30
print(cut)

a = [1,4,6,7,8,3,20,4]
print(a)
print(id(a))
b = a[:]
print(b)
print(id(b))
a.append(345)
print(a)
print(id(a))
print(b)
print(id(b))

a, b = ('python', 'hello')
print(a)
print(b)
a, b = b, a
print(a)
print(b)
