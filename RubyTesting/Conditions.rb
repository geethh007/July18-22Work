#require 'A2'
#obj= A2.new
#obj.checkNature(-9)

require 'A1'
obj=A1.new(10,5)

s=obj.sub(20,30)
puts obj.mul(s,100)

r=obj.sum(20,10)
t=obj.sub(20,10)
puts obj.mul(r,t)

obj.table(9)
puts""
obj.reverseTable(9)

puts ""
obj.forLoopTripleDot(4)
puts ""
obj.forLoopDoubleDot(2)

puts""

#approach-1
  arr1= Array.new(5)
  arr2= Array.new(3)
 
  arr1=["Hello",23,"Testing", 23.45]
    arr1[3]=9.44
    puts arr1[3]
  
  #approach-2
    
    arr2[0]="hello"
    arr2[1]=20
    puts arr2

    arr1.each do |i|
      puts i
    end
