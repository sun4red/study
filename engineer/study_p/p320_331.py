def calc(x, y):
    x += 3
    y /= 3
    print(x, y)
    return x
# 나누기 이후 double형으로 표기

a, b = 3, 12
a = calc(a, b)
print(a, b)
