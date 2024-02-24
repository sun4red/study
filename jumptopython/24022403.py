f = open("새파일.txt", 'r')
while True:
    line = f.readline()
    if not line: break
    print(line)
f.close()

print("="*20)

f = open("새파일.txt", 'r')

lines = f.readlines()
for line in lines:
    line = line.strip() # 줄바꿈 제거
    print(line)
f.close()

print("="*20)

f = open("새파일.txt", 'r')

data = f.read()
print(data)
f.close()