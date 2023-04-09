number = int(input("Enter a number: "))

if number < 0:
  print("Invalid number")
elif number % 2 == 0:
  print("Even")
else:
  print("Odd")
