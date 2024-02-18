msg = "Today is {0}. I'm feel {feeling}.".format(18, feeling = "good")
print (msg)


# 문자열 자리수 10, 왼쪽 정렬
msg = "start" + "{0:<10}".format("hi") + "end"
print(msg)

# 문자열 자리수 10, 오른쪽 정렬
msg = "start" + "{0:>10}".format("hi") + "end"
print(msg)

# 문자열 자리수 10, 가운데 정렬
msg = "start" + "{0:^10}".format("hi") + "end"
print(msg)

msg = "{0:=^10}" .format("hi")
print(msg)

y = 3.141592
msg = "start|" + "{0:10.4f}".format(y) + "|end"
print(msg)

# f 포매팅
name = "홍길동"
age = "20"
msg = f'{name}은 의적이고 나이는 {age}이다'
print(msg)

# 딕셔너리
d = {'name':'신사임당', 'age':'30'}
msg = f'{d["name"]}은 {d["age"]}세 이다'
print(msg)

msg = f'{name:!<10}'
print(msg)

msg = f'{name:!^20}'
print(msg)

a = "hobby"
cnt = a.count("b")
print(cnt)

idx = a.index("b")
print(idx)

