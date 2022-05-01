def printAllSubstrings(s, n):
 
    # Fix start index in outer loop.
    # Reveal new character in inner loop till end of string.
    # Prtill-now-formed string.
    ls=[]
    dic={};
    for i in range(n):
    
        
        temp=""
        for j in range(i,n):
            ns=""
            temp+=s[j]
            if(temp.count('1')%2==0):
                ns=temp[::-1]
            if(ns not in ls):
                ls.append(temp)
                


         #   print(temp)

    print(len(set(ls)))
    print(set(ls))
    for s in set(ls):
        if(len(s) in dic):
            dic[len(s)].append(s)
        else:
            dic[len(s)]=[s]
    for i in dic:
        if(i>2):

 
# Driver program to test above function
 
l =["001110","01010","11111","1110","111100"]#"10001","10101","01111","11001","01101","10110","10010","10111","11001"]
t=input()
for i in range(t):
    s=raw_input()
    printAllSubstrings(s, len(s))
 
