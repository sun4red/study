import os
print(os.environ)

import zipfile

with zipfile.ZipFile('ziptest.zip', 'w') as myzip:
    myzip.write("새파일.txt")
    myzip.write("test.txt")

with zipfile.ZipFile('ziptest.zip') as myzip:
    myzip.extractall()