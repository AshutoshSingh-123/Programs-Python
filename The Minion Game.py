def minion_game(string):
    # your code goes here
   
    # your code goes here
    
    
    c1,c2=0,0
       
    for i in range(len(string)):
        
        if (string[i]!='a' and string[i]!='e' and string[i]!='i' and string[i]!='o' and string[i]!='u' and string[i]!='A' and string[i]!='E' and string[i]!='I' and string[i]!='O' and string[i]!='U'):
            
            
               
                c1=c1+1+(len(string)-i-1)
        else:
            
                
                c2=c2+1+(len(string)-i-1)

    
    # print(c1,c2)
    if(c1>c2):
         print("Stuart",c1)
    elif(c1<c2):
         print("Kevin",c2)
    else:
        print("Draw")


if __name__ == '__main__':
    s = input()
    minion_game(s)
