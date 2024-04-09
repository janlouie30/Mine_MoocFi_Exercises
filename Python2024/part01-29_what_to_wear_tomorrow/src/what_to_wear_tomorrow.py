# Write your solution here
print("What is the weather forecast for tomorrow?")
temp = int(input("Temperature: "))
yn = input("Will it rain (yes/no): ")

if temp > 20:
    print("Wear jeans and a T-shirt")

if temp <= 20 and temp >= 15:
    print("Wear jeans and a T-shirt")
    print("I recommend a jumper as well")

if temp < 15 and temp >= 10:
    print("Wear jeans and a T-shirt")
    print("Take a jacket with you")
    print("I recommend a jumper as well")

if temp < 10:
    print("Wear jeans and a T-shirt")
    print("I recommend a jumper as well")
    print("Take a jacket with you")
    print("Make it a warm coat, actually")
    print("I think gloves are in order")

if yn == "yes":
    print("Don't forget your umbrella!")