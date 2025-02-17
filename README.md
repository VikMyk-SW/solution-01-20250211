# solution-01 (2025/02/11)
solution-01-20250211

#### Building application

```bash
./gradlew clean build
```

 ####  Running application
 ```bash
$ java -jar build/libs/solution-01-20250211-1.0-SNAPSHOT.jar
```

### Result (output)
```
----------------------------------------------
This desktop is a modern computer
The price of the piece is 700.0 euro.
Desktop Computer
----------------------------------------------
This laptop is a modern computer
The price of the piece is 900.0 euro.
Laptop
----------------------------------------------
This desk was manufactured in Estonia
The price of the piece is 100.0 euro.
Computer Desk
----------------------------------------------
This chair was manufactured in Estonia
The price of the piece is 200.0 euro.
Reading Chair

Order 1
2 items at  900.0 each (type: laptop, description: Laptop)
1 items at  700.0 each (type: desktop, description: Desktop Computer)
Total price: 2,500.0 euro.

Order 2
5 items at  200.0 each (type: chair, description: Reading Chair)
1 items at  700.0 each (type: desktop, description: Desktop Computer)
1 items at  100.0 each (type: computer, description: Computer Desk)
Total price: 1,800.0 euro.

```

