# design-pattern
Used of Software engineer final test.

## Note

### Strategy Pattern

แยก behaviour ออกจาก class แม่
เพื่อไม่ให้มีผลกระทบกับ class ลูกเสมอไป	
behaviour ที่แยกออกมาเรียกว่า strategy

composition vs inheritance

inheritance สิ่งหนึ่งเป็นอีกสิ่งหนึ่ง คือการสืบทอดพฤติกรรมต่อจากแม่ให้ลูก

composition สิ่งหนึ่งมีอีกสิ่งหนึ่ง คือการใส่พฤติกรรมให้ class
 
*** ทั้งสองสิ่งไม่ได้แยกจากกันโดยสมบูรณ์ สามารถใช้เสริมกันได้

ตัวอย่างในไฟล์ strategy.java คือเราสร้าง class ชื่อ context เป็นตัวรับ behavior
โดยที่มี strategy 3 อย่างคือ +, -, *
แล้วเลือกว่าตอนเรียกใช้ context จะใส่ behaivior ไหนเข้าไป คือเราสามารถเปลี่ยนความสามารถของ class ในตอนที่ run time ได้

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


### Bridge Pattern
คือ แนวคิดในการยืมความสามารถจาก Class ภายนอกมาใช้งาน ใช้สำหรับแก้ปัญหาการ couple ระหว่าง abstraction กับ implementation โดย class หลักที่เราจะใช้งานจะถูกเรียกว่า Abstraction และ class ที่เราจะยืมความสามารถมาจะเรียกว่า Implementor วิธีนี้แก้คือเราสร้าง abstraction ขึ้นมาคั่น ระหว่าง target กับ client เพื่อให้ client เห็นแค่ abstraction อันใหม่ จากนั้นเราจะแก้ abstraction นี้ยังไงก็ได้ โดยการแก้นั้นจะไม่ส่งผลกระทบอะไรกับ target (ดูความสัมพันธ์ในลิ้งด้านล่างแบบเห็นละรู้เลย)
เนื้อหาในโค้ดคร่าวๆ
1. create 'DrawAPI.java' เป็นคำสั่งให้วาดวงกลม
2. create 'RedCircle.java' กับ 'GreenCircle.java' ไว้ implement DrawAPI มาใช้
3. create 'Shape.java' สร้างมารับค่าจะ user แล้วค่อยเรียกใช้คำสั่งจาก 'Circle.java'
4. create 'Circle.java' จะส่งคำสั่งกำหนดค่าและวาดรูปไปให้ Shape
5. create 'BridgePatternDemo.java' เรียกใช้ class Shape กับ DrawAPI เพื่อวาดวงกลมต่างสีกัน

```
output
Drawing Circle[ color: red, radius: 10, x: 100, 100]
Drawing Circle[  color: green, radius: 10, x: 100, 100]
```

อ้างอิงจาก http://manit-tree.blogspot.com/2012/07/design-pattern-bridge-pattern.html มีสรุปอยู่ด้านล่างเผื่ออ่านละยังงงอีก
อ้างอิงจาก https://2bedev.com/365days-of-program-day-53/ มีตัวอย่างที่คิดว่าสรุปแล้วเห็นภาพเลยอยู่ด้านล่างเว็บนี้ด้วย
https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm คำอธิบายโค้ดอยู่ในนี้


### Singleton Pattern
เป็น Pattern ที่จำกัดจำนวนของ Object ที่ถูกสร้างขึ้นในระบบ ซึ่งจะเป็นประโยชน์เมื่อระบบต้องการจะมี Object นั้นเพียงตัวเดียวเพื่อป้องกันไม่ให้เกิดการทำงานซ้ำซ้อนกันเช่น class สำหรับการเก็บข้อมูล หรือเป็น Model ที่มีการเรียกใช้งานทั้งระบบ

อ้างอิงจาก https://medium.com/20scoops-cnx/singleton-pattern-%E0%B8%84%E0%B8%B7%E0%B8%AD%E0%B8%AD%E0%B8%B0%E0%B9%84%E0%B8%A3-b7b28182654f
อ่านเพิ่ม https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm

เนื้อหาจากไฟล์
1. ไฟล์ `SingleObject` ในไฟล์จะมีตัวแปร `instance` เป็นตัวแปรแบบ static และจะอนุญาติให้สร้าง object ได้จากการ `getInstance()` เท่านั้น และ object นี้สามารถถูกสร้างได้แค่ครั้งเดียวจากการเช็คใน `getInstance` ว่าเคยถูกสร้างหรือยัง
2. ไฟล์ `SingletonDemo` เป็นไฟล์ main ของโปรแกรม จะแสดงข้อความ
```
Hello World, This is singleton pattern.
```

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

### Facade Pattern
Facade Pattern คือ pattern ที่ช่วยลดความซับซ้อนของระบบ และหน้า interface ของ client โดยนำระบบย่อยมารวมใน class เดียว แล้วให้ client เรียกใช้ class นั้นเพียง class เดียว (source: http://enos.itcollege.ee/~jpoial/java/naited/Java-Design-Patterns.pdf)

1. ไฟล์ `Runserver.java` แสดงให้เห็นว่่าหากไม่นำ Facade Pattern มาใช้ client ต้องรันคำสั่งมากมายเพื่อ start/stop server
2. ไฟล์ `ScheduleServerFacade.java` รวมคำสั่งที่ต้องรันเพื่อ start/stop server ไว้ในคำสั่งเดียว
3. ไฟล์ `TestFacade.java` หน้า interface ของ user เหลือเพียงแค่คำสั่ง start/stop server


### Command Pattern
Command pattern คือ pattern ที่มีการสร้างตัว request (object ตัวนึงขึ้นมาเพื่อห่อหุ้มข้อมูลและ command ต่างๆ) และส่งผ่านให้ invoker มาจัดการกับ request ที่รับไปยัง object ที่สอดคล้องกับ command ใน request นั้นๆ

อ้างอิงจาก https://www.tutorialspoint.com/design_pattern/command_pattern.htm
อ่านเพิ่ม https://2bedev.com/365days-of-program-day-61/

เนื้อหาจากไฟล์
1. ไฟล์ `Order.java` เป็น interface ของ command
2. ไฟล์ `Stock.java` เป็น request class
3. ไฟล์ `BuyStock.java` และ `SellStock.java` เป็น class ที่ implement มาจาก `Order` เพื่อ execute ตัว request ที่รับมาจาก `Broker`
4. ไฟล์ `Broker.java` เป็น invoker class มารับ request แล้วส่งไปเรียกใช้งานคำสั่งตามที่เหมาะสม
5. ไฟล์ `CommandDemo.java` เป็น Main ของโปรแกรม เรียกใช้ Broker มารับ request แล้วรัน command

```
Stock [ Name: ABC, Quantity: 10 ] bought
Stock [ Name: ABC, Quantity: 10 ] sold
```


### Proxy Pattern
proxy หมายความว่า ผู้แทน ดังนั้น pattern นี่คือการมอบหมายให้ class หนึ่งเป็นตัวแทนของอีก class หนึ่ง
ยกตัวอย่างเช่นการ Reverse proxy ที่ให้ server หนึ่งรับ request มาก่อนส่งให้ server หลัก
เพื่อช่วยลดภาระการทำงานของ server หลัก

ประโยชน์จากการใช้
1. Lazy-instantiate an object: ข้อมูลจะไม่ถูกโหลดจนกว่าเราจะเรียกใช้
2. Control access to the object: เช็คสิทธิการเข้าถึงก่อนเข้า real service ได้
3. Hide the fact object: สามารคืนค่าให้ client ก่อนโดยไม่ต้องผ่าน real service

อ่านเพิ่ม http://manit-tree.blogspot.com/2012/07/design-pattern-proxy-pattern.html

ในตัวอย่าง proxy.java จะเป็นการสร้าง RealImage กับ ProxyImage ที่ inherit มาจาก RealImage
ใน main เราประกาศ class ProxyImage ซึ่งจะมีการ load ข้อมูลจาก disk แค่ครั้งแรกที่ display
รอบถัดไปจะไม่ต้องโหลดมาใหม่อีก


### Structural Patterns
path นี้จะเป็นการเปรียบเทียบระหว่าง
##### 1.Decorator Pattern
    เปลี่ยน behavior คือไม่ได้เปลี่ยน interface แต่เปลี่ยน implementation พยายามจะ solve ปัญหาโดยการที่พยายามจะ compose ยังไงก็ได้แล้วแต่เรา ทำการ decorating ทุก component 
##### 2.Adapter Pattern
    เราเปลี่ยนแปลงไปโดยที่ไม่สน behavior คือเปลี่ยน interface ที่เราอยากใช้ ให้เข้ากับ interface ของเรา
##### 3.Facade Pattern
    ตัว facal จะเป็นตัว higher level interface ที่เอาไว้ให้เราใช้พวกที่ต่ำกว่านี้ ที่ซับซ้อนมากๆ ได้ง่ายขึ้น 
##### 4.Proxy Pattern
    ตัว proxy จะเป็นตัวติดต่อกับ client แล้วค่อยส่งไปให้ real คือทำอะไรต้องผ่าน proxy ก่อน แต่ว่าทั้ง 2 อย่่างจะใช้ subject ร่วมกัน คือบาง common answer ทาง real ก็จะสามารถใช้ได้โดยตรง proxy เหมือนเป็น control access เปลี่ยน implementation แต่ interface ของ real กับ proxy เหมือนกัน
##### 5.Bridge Pattern
    ตัวอย่างเช่นการที่เรามี 2 hierarchy ที่เหมือนๆกัน คนละ interface กัน เรียกว่า bridge เพราะมันคือการ bridge ข้ามไปอีก interface นึง ค่อนข้างจะ flexible
