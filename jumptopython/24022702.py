try:
    age = int((input("나이를 입력")))
except:
    print("잘못된 입력")
else:
    if age <= 18:
        print("미성년자입니다.")
    else:
        print("환영합니다.")