class A1
  
  
  def initialize
    puts "this is my constructor"
  end
  
  def initialize(a,b)
    
    puts a%b
  end
  def hello()
    
    puts"this is the class method hello"
    
  end
  
  def sum(a,b)
    
    return a+b
  end
  
  def sub(a,b)
    c=a-b
    return c
  end
  
  def div(a,b)
    c=a/b
    return c    
  end
  
  def mul(a,b)
    c=a*b
    return c
  end
  
  def reverseTable(a)
    i=10
    while(i>=1)
      puts a*i
      i=i-1
    end
  end
  
  def table(a)
      i=1
      while(i<=10)
        puts a*i
        i=i+1
      end
  end
  
 #triple dot means excluding last value
  
 #double dot means including last value
  
  def forLoopTripleDot(a)
    
    for i in 1...10
      puts i*a
    end
    
  end
  
  def forLoopDoubleDot(a)
      
      for i in 1..10
        puts i*a
      end
      
  end
  
  
end