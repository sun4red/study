str = 'Sinagong'
n = len(str)
st = list()
for k in range(n):
    st.append(str[k])
for k in range(n-1, -1, -1):    # range(start, end, step)
    print(st[k], end = '')      # end를 넣으면 줄을 내리지 않고 옆에 이어서 작성
