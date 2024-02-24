f = open("새파일.txt", 'a')

for i in range(11,21):
    data = "%d번째 줄이 추가되었다.\n" % i
    f.write(data)

f.close()
f = open("새파일.txt", 'r')
data = f.read()
print(data)
f.close()