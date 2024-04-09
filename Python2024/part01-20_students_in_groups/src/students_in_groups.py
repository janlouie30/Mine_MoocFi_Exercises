# Write your solution here
students = int(input("How many students on the course? "))
groupSize = int(input("Desired group size? "))

groups = 0
if students % groupSize > 0:
    groups += 1

print(f"Number of groups formed: {(students // groupSize) + groups}")
print(f"Modulo: {students % groupSize}")