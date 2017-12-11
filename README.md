# adapter pattern.
Use for some specification Request.

## Note

    ตามหลักแล้วถ้าเราจะใช้ปลั๊กไฟแบบบ้านเราไปต่อต่างประเทศนั้น เราก็ต้องผ่าน
    Adapter ตัวนึงก่อนที่เข้ากับของเราได้ เพื่อไปใช้กับปลั๊กประเทศนั้นๆ
    เป็นการเปรียบเทียบกับ interface ของฝั่ง client request ไปที่ ITarget
    และต้องมี Adapter มาอีกต่อนึง โดย Adapter จะเรียกใช้ Adaptee เพื่อร้องขอ
    SpecificationRequest อีกทีหนึ่ง