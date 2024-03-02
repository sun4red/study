import time
import threading
def long_task():
    for i in range(5):
        time.sleep(1)
        print("working:%s\n" % i)

print("Start")

threads = []

for i in range(5):
    t = threading.Thread(target=long_task) # 스레드 생성
    threads.append(t)

for t in threads:
    t.start() # 스레드를 실행

for t in threads:
    t.join()
#  이 부분이 없으면 end 출력 문장이 먼저 실행되고 스레드의 결과가 출력

print("End")