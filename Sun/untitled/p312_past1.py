lol = [[1,2,3],[4,5],[6,7,8,9]]
print (lol[0])
# [1,2,3]
print (lol[2][1])
# 7
for sub in lol:
    for item in sub:
        print(item, end = ' ')
    #     배열 내 아이템 공백 두고 출력
    print()
    #  배열 출력 후 줄 내림