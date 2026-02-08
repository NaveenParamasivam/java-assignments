# MongoDB Day 1 Assignment

## 📌 Dataset
Product JSON:
https://github.com/rvsp/database/blob/master/mongodb/product.json

---

## 📌 Database Setup

Database Name: assignment  
Collection Name: product  
Tool Used: MongoDB Atlas + mongosh

---

## 📌 Queries Performed

Queries are available in:
mongo_queries.md

---

## 📌 Output Screenshots

All query outputs are available inside:
output_screenshots/

---
# MongoDB Queries

## 1. Find all products
### Query
```mongodb
db.product.find({})
```

### Output
![Q1 Output](output_screenshots/1_1.png)
![Q1 Output](output_screenshots/1_2.png)
![Q1 Output](output_screenshots/1_3.png)
![Q1 Output](output_screenshots/1_4.png)
![Q1 Output](output_screenshots/1_5.png)
![Q1 Output](output_screenshots/1_6.png)
![Q1 Output](output_screenshots/1_7.png)
---

## 2. Price between 400 and 800
### Query

```js
db.product.find({
product_price: { $gte: 400, $lte: 800 }
})
```

### Output
![Q2 Output](output_screenshots/2_1.png)
![Q2 Output](output_screenshots/2_2.png)
---

## 3. Price not between 400 and 600
### Query
```js
db.product.find({
$or: [
{ product_price: { $lt: 400 } },
{ product_price: { $gt: 600 } }
]
})
```

### Output
![Q3 Output](output_screenshots/3_1.png)
![Q3 Output](output_screenshots/3_2.png)
![Q3 Output](output_screenshots/3_3.png)
![Q3 Output](output_screenshots/3_4.png)
![Q3 Output](output_screenshots/3_5.png)
![Q3 Output](output_screenshots/3_6.png)
![Q3 Output](output_screenshots/3_7.png)
---

## 4. First 4 products price > 500
### Query
```js
db.product.find({
product_price: { $gt: 500 }
}).limit(4)
```

### Output
![Q4 Output](output_screenshots/4.png)


---

## 5. Product name and material
### Query
```js
db.product.find(
{},
{ product_name: 1, product_material: 1, _id: 0 }
)
```

### Output
![Q5 Output](output_screenshots/5_1.png)
![Q5 Output](output_screenshots/5_2.png)
![Q5 Output](output_screenshots/5_3.png)
---

## 6. Product with id = 10
### Query
```js
db.product.find({
id: "10"
})
```

### Output
![Q6 Output](output_screenshots/6.png)
---

## 7. Only product name and material
### Query
```js
db.product.find(
{},
{ product_name: 1, product_material: 1, _id: 0 }
)
```

### Output
![Q7 Output](output_screenshots/7_1.png)
![Q7 Output](output_screenshots/7_2.png)
![Q7 Output](output_screenshots/7_3.png)
![Q7 Output](output_screenshots/7_4.png)
---

## 8. Material contains soft
### Query
```js
db.product.find({
product_material: { $regex: "soft", $options: "i" }
})
```

### Output
![Q8 Output](output_screenshots/8_1.png)
![Q8 Output](output_screenshots/8_2.png)
---

## 9. Color indigo and price 492
### Query
```js
db.product.find({
product_color: "indigo",
product_price: 492
})
```

### Output
![Q9 Output](output_screenshots/9.png)
---

## 10. Delete price 28
### Query
```js
db.product.deleteMany({
product_price: 28
})
```

### Output
![Q10 Output](output_screenshots/10.png)

---