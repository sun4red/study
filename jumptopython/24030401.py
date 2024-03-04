import json
data = {'name':'홍길동', 'birth':'0525','age':30}
with open('myinfo.json', 'w') as f:
    json.dump(data, f)

# with 파일 열때 사용
# close() 메소드를 사용하지 않아도 자동으로 닫아줌
with open('myinfo.json') as f:
    data = json.load(f)
# 딕셔너리로 리턴
print(data)