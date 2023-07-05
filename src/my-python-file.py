import sys
 
def getDataFromJava(arg1,arg2,arg3):
    arg1_val=arg1
    arg2_val=arg2
    arg3_val=arg3
   
    print(arg1_val)
    print(arg2_val)
    print(arg3_val)
    
    return arg1_val, arg2_val, arg3_val

arg1 = sys.argv[1]
arg2 = sys.argv[2]
arg3 = sys.argv[3]

getDataFromJava(arg1,arg2,arg3)