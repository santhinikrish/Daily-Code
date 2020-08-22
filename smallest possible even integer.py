'''
Example Input/Output 1:
Input: 137 4276
Output: 1234776
Explanation:
The smallest possible even integer using all the digits in 137 and 4276 is 1234776.
Hence the output is 1234776

Example Input/Output 2:
Input: 1357 97531
Output: -1

Example Input/Output 3:
Input: 3004 560
Output: 3000456
'''

a,b=input().split()
n=sorted(a+b)
z=n.count("0")
n=n[z:]
for i in range(z):
    n.insert(1,"0")
eve="-1"
for j in "86420":
    if j in n:
        n.remove(j)
        eve=j
        break
if eve=="-1":
    print(-1)
else:
    print(''.join(n)+eve)
