def calc(check, *value):
    # *value 가변 파라미터
    num = 0
    for i in value:
        num = num + i
    if check:
        return num, set(value), check
        # 반환은 한번에, Tuple로 ()
    else:
        return set(value)


k = calc(1, 1, 2, 3, 4, 1, 2)
print(k)
