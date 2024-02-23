def add(a,b):
    return a+b

c = add(3,2)
print(c)

def cal(a,b,c):
    c = a + b
    return c
# 리턴값을 꼭 지정해줘야한다?
a = 4
b = 5
c = 0
print(a, end= " ")
print(b, end= " ")
print(c, end= " ")
c = cal(a,b,c)
# ?
print(a, end= " ")
print(b, end= " ")
print(c, end= " ")


# 전역 변수
global_var = 10

def func():
    # 함수 내에서 전역 변수를 읽음
    print("함수 내에서 전역 변수 값:", global_var)

def func_modify():
    # 함수 내에서 전역 변수를 수정
    global global_var
    global_var = 20
    print("함수 내에서 수정된 전역 변수 값:", global_var)

# 함수 호출 전에 전역 변수 출력
print("함수 호출 전 전역 변수 값:", global_var)

# 함수 호출
func()

# 함수 호출 후에 전역 변수 출력
print("함수 호출 후 전역 변수 값:", global_var)

# 전역 변수 수정 함수 호출
func_modify()

# 수정된 전역 변수 출력
print("함수 호출 후 수정된 전역 변수 값:", global_var)


def say():
    print("hi")

say()