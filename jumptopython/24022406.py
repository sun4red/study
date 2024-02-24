def cut():
    print("="*20)


# 1.
def is_odd(number):
    if number%2 == 1:
        return True
    else:
        return False

# 2.
def avg_numbers(*args):
    result = 0
    for i in args:
        result += i
    return result/len(args)

r1 = avg_numbers(2,3,30,50)
print(r1)

# 3.
input1 = input("첫 번째 숫자를 입력하세요: ")
input2 = input("두 번째 숫자를 입력하세요: ")

total = input1 + input2
# 수정
total = int(input1) + int(input2)
print("두 수의 합은 %s입니다." % total)

# 7.
f=open("test.txt", "w")
data = "I'm studing Java\n And It's interesting"
f.write(data)
f.close()

f=open("test.txt", "r")
data = f.read()
f.close()
print(data)
data = data.replace("Java", "Python")
f=open("test.txt", "w")
f.write(data)
f.close()


f=open("test.txt", "r")
datacheck = f.read()
f.close()
print(datacheck)
