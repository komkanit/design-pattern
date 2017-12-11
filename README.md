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
1. Decorator Pattern    - เปลี่ยน behavior คือไม่ได้เปลี่ยน interface แต่เปลี่ยน implementation พยายามจะ solve ปัญหาโดยการที่พยายามจะ compose ยังไงก็ได้แล้วแต่เรา ทำการ decorating ทุก component 
2. Adapter Pattern      - เราเปลี่ยนแปลงไปโดยที่ไม่สน behavior คือเปลี่ยน interface ที่เราอยากใช้ ให้เข้ากับ interface ของเรา
3. Facade Pattern       - ตัว facal จะเป็นตัว higher level interface ที่เอาไว้ให้เราใช้พวกที่ต่ำกว่านี้ ที่ซับซ้อนมากๆ ได้ง่ายขึ้น 
4. Proxy Pattern        - ตัว proxy จะเป็นตัวติดต่อกับ client แล้วค่อยส่งไปให้ real คือทำอะไรต้องผ่าน proxy ก่อน แต่ว่าทั้ง 2 อย่่างจะใช้ subject ร่วมกัน คือบาง common answer ทาง real ก็จะสามารถใช้ได้โดยตรง proxy เหมือนเป็น control access เปลี่ยน implementation แต่ interface ของ real กับ proxy เหมือนกัน
5. Bridge Pattern       - ตัวอย่างเช่นการที่เรามี 2 hierarchy ที่เหมือนๆกัน คนละ interface กัน เรียกว่า bridge เพราะมันคือการ bridge ข้ามไปอีก interface นึง ค่อนข้างจะ flexible
