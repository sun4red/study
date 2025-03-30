a = b = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
b[-1] = 5
b = set(a)
c = list(b)
print(a)
print(b)
print(c)
# 주소가 같은가
print(a is b)
