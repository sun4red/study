print (1 + 1)

a = 3
b = 2
print(a+b)

if(a>b):
    print ("a>b")
else:
    print ("a<b")

print("if문 끝")

for a in [2, 4, 6, 3]:
    if(a%2==0):
        print(a)

def itsmyfunc(a, b):
    return a * b + 3

a = 3
b = 4

print(itsmyfunc(a, b))


"""
this is 주석
주석
주석
"""
# 이것 또한 주석

c = a ** b
print(c)

print(7//4)

txt = "\"Here is a new challenger\""

print(txt)

multline = '''line1
line2
line3
'''
print (multline)

print(txt[6:-6])
print(txt[-7:-2])

# 문자열 포매팅
ea = 5
msg = "현재 보유 펜 개수 : %d개" % ea
print (msg)

# 정렬이 필요할때
msg = "%10s" % "hi"
print(msg)
msg = "%-10sbye" % "front"
print(msg)


name1 = "apple"
name2 = "pie"

msg = "name1 = {0}, name2 = {1}".format(name1, name2)
print(msg)