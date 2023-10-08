a = [ [1, 1, 0, 1, 0], [1, 0, 1, 0] ]
tot, totsu = 0, 0
for i in a:         # a의 행 수만큼 반복
    for j in i:     # 리스트 i의 요소 수 만큼 반복
        tot += j
    totsu = totsu + len(i)
print(totsu, tot)