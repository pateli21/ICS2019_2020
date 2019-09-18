import turtle
t = turtle.Turtle()


def convertTemp(fahren):
    celcius = float((fahren - 32) * (5/9))
    celcius = round(celcius, 2)
    print (str(fahren) + "°F is " + str(celcius) + "°C.")

def convertLand(acres):
    barns = float(acres * (4.047*(10**31)))
    barns = format(barns, ".2e")
    if acres == 1:
        print (str(acres) + " acre is " + str(barns) + " barns.")
    else:
        print (str(acres) + " acres is " + str(barns) + " barns.")


fahren = int(input("How many fahrenheit do you want to convert into celcius? "))
convertTemp(fahren)

acres = int(input("How many acres do you want to convert into barns? "))
convertLand(acres)


def polygon(sides):
    sumInt = (sides - 2) * 180
    sumEachTurn = 180 - (sumInt / sides)
    for i in range(sides):
        t.forward(25)
        t.left(sumEachTurn)


sides = int(input("How many sides do you want your polygon to have? "))
polygon(sides)
screen = t.getscreen()
screen.mainloop()
