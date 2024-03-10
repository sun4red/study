import os

for(path, dir, files) in os.walk("d:/"):
    for filename in files:
        ext = os.path.splitext(filename)[-1]
        # 파일 확장자의 이름을 기준으로 두 부분으로 나누어줌
        if ext == '.py':
            print("%s/%s" % (path, filename))