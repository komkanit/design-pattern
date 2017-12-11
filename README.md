# design-pattern
Used of Software engineer final test.

## Note

### Observer Pattern
เป็น Pattern ที่เชื่อมโยง Object กันแบบ One-to-Many เมื่อ​ Subject มีการเปลี่ยนแปลง เหล่า Observer ทั้งหลายที่ Subscribe ก็จะรับรู้การเปลี่ยนแปลงนั้น เหมือนเป็น เหมือนเป็น Hub ข้อมูลกลาง และส่งข้อมูลใหเ Object อื่นๆใช้
https://www.algorithmtut.com/algorithm-observer-design-pattern/
https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
เนื้อหาในโค๊ดคร่าวๆ
1. ไฟล์ `Subject.java` method `attach` จะทำหน้าที่สร้าง Subscribe พอ `setState` จะสั่งให้ Subscribe ทั้งหมด `update`
2. ไฟล์ `BinaryObserver.java` มี method `update` ที่เอาทำจากข้อ 1
3. ไฟล์ `ObserverPatternDemo.java` เป็น main หลัก พอสั่ง `setState` method ทั้งหมดจะ `update`
```
output
First state change: 15
Octal String: 17
Binary String: 1111
Second state change: 10
Octal String: 12
Binary String: 1010
```


### Decorator Pattern
Decorator Pattern คือรูปแบบที่ช่วยให้เราสามารถเพิ่มเติม state และ พฤติกรรมใหม่ เข้าไปใน object แบบ dynamic ได้ นั่นคือการที่เราสามารถเพิ่ม state และ พฤติกรรมใหม่ เช่นนี้เข้าไปได้ เราจึงไม่จำเป็นต้องกลับไปแก้ไข code method หรือ state ของ object เดิมเลย
https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
1. create `Shape.java`
2. create `Rectangle.java` and `Circle.java` and override method `draw`
3. create `ShapeDecorator.java` คือ Class ที่จะเอามาคลุม `Shape` ทำให้เราสามารถ custom ได้
4. create `RedShapeDecorator.java` extend `ShapeDecorator` เพื่อสร้าง Shape สีแดง
5. `DecoratorPatternDemo.java` เป็น main หลัก `Shape redCircle = new RedShapeDecorator(new Circle());` จะเป็นการสร้างวงกรมสีแดงขึ้นมา

```
output
Circle with normal border
Shape: Circle

Circle of red border
Shape: Circle
Border Color: Red

Rectangle of red border
Shape: Rectangle
Border Color: Red
```

### Singleton Pattern
เป็น Pattern ที่จำกัดจำนวนของ Object ที่ถูกสร้างขึ้นในระบบ ซึ่งจะเป็นประโยชน์เมื่อระบบต้องการจะมี Object นั้นเพียงตัวเดียวเพื่อป้องกันไม่ให้เกิดการทำงานซ้ำซ้อนกันเช่น class สำหรับการเก็บข้อมูล หรือเป็น Model ที่มีการเรียกใช้งานทั้งระบบ
https://medium.com/20scoops-cnx/singleton-pattern-%E0%B8%84%E0%B8%B7%E0%B8%AD%E0%B8%AD%E0%B8%B0%E0%B9%84%E0%B8%A3-b7b28182654f
https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
เนื้อหาโค้ดคร่าวๆ
1. ไฟล์ `SingleObject` ในไฟล์จะมีตัวแปร `instance` เป็นตัวแปรแบบ static และจะอนุญาติให้สร้าง object ได้จากการ `getInstance()` เท่านั้น และ object นี้สามารถถูกสร้างได้แค่ครั้งเดียวจากการเช็คใน `getInstance` ว่าเคยถูกสร้างหรือยัง
2. ไฟล์ `SingletonDemo` เป็นไฟล์ main ของโปรแกรม จะแสดงข้อความ
```
Hello World, This is singleton pattern.
```

### Facade Pattern
Facade Pattern คือ pattern ที่ช่วยลดความซับซ้อนของระบบ และหน้า interface ของ client โดยนำระบบย่อยมารวมใน class เดียว แล้วให้ client เรียกใช้ class นั้นเพียง class เดียว (source: http://enos.itcollege.ee/~jpoial/java/naited/Java-Design-Patterns.pdf)

1. ไฟล์ `Runserver.java` แสดงให้เห็นว่่าหากไม่นำ Facade Pattern มาใช้ client ต้องรันคำสั่งมากมายเพื่อ start/stop server
2. ไฟล์ `ScheduleServerFacade.java` รวมคำสั่งที่ต้องรันเพื่อ start/stop server ไว้ในคำสั่งเดียว
3. ไฟล์ `TestFacade.java` หน้า interface ของ user เหลือเพียงแค่คำสั่ง start/stop server
