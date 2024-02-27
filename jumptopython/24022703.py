try:

    print("프로그램 시작지점")

    f = open("없는파일이지롱", 'r')

    print("그냥 통과")

except FileNotFoundError:
    pass

print("프로그램 종료지점")