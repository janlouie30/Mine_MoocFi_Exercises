# Write your solution here
num = int(input("Please type in a temperature (F): "))

celsius = (5/9) * (num - 32)
print(f"{num} degrees Fahrenheit equals {celsius} degrees Celsius")
if celsius < 0:
    print("Brr! It's cold in here!")