hash1= Hash.new()

#approach-1

hash1={"key1"=>"value1", "K2"=>23, "45"=>67.99}
  
  #find length of hash
  
  puts hash1.length()
  #pick data from hash
  
  puts hash1["key1"]
    
#approach-2
    
    hash1["K4"]="testing"
puts hash1.length()

hash1["key1"]="hey"
  
puts hash1["key1"]
