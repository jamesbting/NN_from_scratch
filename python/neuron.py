inputs = [1,2,3,2.5]
weights = [0.2,0.8,-0.5,1.0]
bias = 2

output = 0
for i in range(0,len(inputs)):
    output += inputs[i]*weights[i]

output += bias
print(output)