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


### Structural Patterns
path นี้จะเป็นการเปรียบเทียบระหว่าง
- Decorator Pattern
- Adapter Pattern
- Facade Pattern
- Proxy Pattern
- Bridge Pattern
