a = -4.5
print(abs(a))

b = [1,3,4]
print(all(b))

b.append(0)
print(b)
print(all(b))

c = [1,2,3,0]
print(any(c))
c = [0,""]
print(any(c))

print(chr(97))
print(chr(44032))

print(dir([1,2,3]))
print(dir({'1':'a'}))

print(divmod(7,3))
# 몫과 나머지를 튜플로 리턴

for i, name in enumerate(['body', 'foo', 'bar']):
    print(i, name)
# 열거, 순서가 있는 데이터를 입력받아 인덱스값을 포함하는 객체로 리턴

print(eval('3 + 4'))
# 이런게 왜있지?

def positive(l):
    result = []
    for i in l:
        if i>0:
            result.append(i)
    return result

print(positive([1,-3,2,0,-5,6]))

def positive(x):
    return x>0

print(list(filter(positive, [1,-3,0,2,-5,6])))

print(hex(234))
print(hex(3))
print(hex(30))


print(id(a))

i = '3'
ii = int(i)
print(i, ii)

class Person: pass
p = Person()
print(isinstance(p, Person))

def two_times(numberList):
    result = []
    for number in numberList:
        result.append(number * 2)
    return result

result = two_times([1,2,3,4])
print(result)
# map(f,iterable) 함수와 반복가능한 데이터를 입력으로 받고, 함수 f 를 적용한 결과를 리턴

print(max("python"))
# 문자열의 경우 유니코드값이 가장 큰 문자를 리턴

print(oct(34))

print(ord('a'))

# ord <=> chr

# range(a,b,c)
# a 와 b 사이에 c만큼의 거리를 두고 리턴
print(list(range(1,10,2)))

print(list(zip([1,2,3],[4,5,6])))
print(list(zip([1,2,3],[4,5,6],[7,8,9])))
print(list(zip("abc","def")))
# 문자열을 리스트로 만드는게 신기