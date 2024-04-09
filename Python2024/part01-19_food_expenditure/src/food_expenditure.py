# Write your solution here
timeWeek = int(input("How many times a week do you eat at the student cafeteria? "))
price = float(input("The price of a typical student lunch? "))
groceriesWeek = float(input("How much money do you spend on groceries in a week? "))

print("Average food expenditure")
print(f"Daily: {((timeWeek * price) + groceriesWeek)/7} euros")
print(f"Weekly: {(timeWeek * price) + groceriesWeek} euros")