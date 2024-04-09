# Write your solution here
hourWage = float(input("Hourly wage: "))
workHours = float(input("Hours worked: "))
dayOfTheWeek = input("Day of the week: ")

dailyWages = (hourWage * workHours)
if dayOfTheWeek == "Sunday":
    dailyWages = 2 * (hourWage * workHours)

print(f"Daily wages: {dailyWages} euros")