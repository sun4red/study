def gugu(n):
    result = []
    i = 1
    while i < 10:
        result.append(n*i)
        i = i + 1
    return result

g2 = gugu(2)
print(g2)

# 3, 5 배수의 수 합

result = 0
for n in range(1,1000):
    if n%3 == 0 or n %5 ==0:
        result += n
print(result)

# 페이징

def get_total_page(m,n):
    # 총 m개의 글, 한 페이지에 표시되는 n개의 글
    if m%n == 0:
        return m//n
    else:
        return m//n+1

print(get_total_page(30, 10))
print(get_total_page(45, 10))
print(get_total_page(80, 7))