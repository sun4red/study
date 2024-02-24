f = open("새파일.txt", 'w')
f.close()

f = open("새파일.txt", 'w')
for i in range(1,11):
    data = "%d번째 줄 입력\n" % i
    f.write(data)
f.close()
