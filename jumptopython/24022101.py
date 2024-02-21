cut = "="*20

# 4.
pin = "881120-1068234"
if pin[7] == '1' or '3':
    print("남자")
else:
    print("여자")


print(cut)

# 5.
a = "a:b:c:d"
b = a.replace(':', '#')
print(b)


print(cut)

# 6.

a = [1,3,5,4,2]
a.sort()
a.reverse()
print(a)


print(cut)


# 7.

a = ['Life', 'is', 'too', 'short']
# result = a[0] + a[1] + a[2] + a[3]
# result = ''
# result.join(a)
result = " ".join(a)
# 공백을 넣어주고, 문자열을 이어준다.

print(result)

print(cut)

# 8.
a = (1,2,3)
a = a + (4,)
print(a)

# 9.
a = dict()
a['name'] = 'python'
a[('a',)] = 'python'
# a[[1]] = 'python'
# 리스트는 딕셔너리에 담을 수 없다.
# 딕셔너리에는 변하는 값(mutable)을 넣을 수 없다.
a[250] = 'python'

print(a)

print(cut)

# 10.
a = {'A':90, 'B':80, 'C':70}
result = a.pop('B')
print(result)
print(a)

print(cut)

# 11.
a = [1,1,1,2,2,3,3,3,4,4,5]
aSet = set(a)
# 되돌려주자
a = list(a)
print(aSet)
print(a)


print(cut)

# 12
a = b = [1,2,3]
a[1] = 4
print(b)
# a, b 변수가 동일한 객체를 가르키고이싿.