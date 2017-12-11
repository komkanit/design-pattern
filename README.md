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

### Factory Pattern
Factory Pattern คือรูปแบบที่จำลองโรงงานสร้างของขึ้นมา โดยที่เราสามารถสั่งสร้างของได้โดยไม่ต้องสนใจโลจิกการสร้างของในfactory ทำให้ง่ายต่อการสร้างobject
เนื้อหาจากไฟล์
1. สร้าง interface `Shape.java` และสร้างคลาสobjectที่จะสร้างขึ้นมา `Circle.java ,Rectangle.java ,Square.java` ให้object ทุกตัว implements Shape
2. สร้าง factory `ShapeFactory.java` factoryจะเป็นตัวสร้างobjectทั้ง3ตัวโดยจะรับargumentเป็นเงื่อนไขการสร้าง
3. สร้าง FactoryPatternDemo `FactoryPatternDemo.java` เมื่อต้องการจะใช้objectไหนก็สั่งสร้างผ่าน ShapeFactory และนำไปใช้ได้เลย
https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
```
output
Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
```

