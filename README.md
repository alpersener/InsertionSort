Insertion Sort
==============
Insertion sort,dizi sorted ve unsorted kısıma ayrılır ilk başta örneğin 2 tanesini alıp sort yapar ardından 3 tanesini sort yapar böyle böyle array’in sonuna kadar gider.

![photo1](https://github.com/alpersener/InsertionSort/blob/master/photo1.png)

![photo2](https://github.com/alpersener/InsertionSort/blob/master/photo2.png)


İ değeri her zaman n-2 olmak zorundadır sebebi ise örneğin i değeri 4 oldu j değeri i+1 olduğu için 5 olacaktır 5 olması demek indexoutofBoundException atması demektir bundan dolayı i her zaman

i<arr.length-2 olması gerekmektedir.

Time Complexity
---------------

**Worst case⇒O(N^2)**’dir.Sebebi ise descending sorted olmasıdır

![photo3](https://github.com/alpersener/InsertionSort/blob/master/photo3.png)


**Best Case⇒O(N)**’dir.Sebebi ise array’in zaten sorted olması bundan kaynaklı loop sürekli break’e girer ve en sona kadar denediği için örneğin 5 eleman varsa 5 kere 1000 eleman varsa 1000 kere deneyecektir.Bundan dolayı O(N)’dir.

İnsertion Sort Neden Kullanılmalı?
==================================

**1)Adaptive (Uyarlanabilir)**: İnsertion Sort, giriş dizisinin bazı bölümleri zaten sıralı veya yakın sıralı ise, performansı artırabilir. Yani, eğer dizinin bir kısmı zaten sıralı ise, İnsertion Sort bu sıralı kısmı korur ve sadece karışık kısımları sıralar. Bu, algoritmanın sıralama işlemini daha hızlı yapmasını sağlar.

**2)Stable:**Örneğin, bir dizide aynı değere sahip iki öğe varsa ve bu diziyi İnsertion Sort ile sıralarsanız, bu iki öğenin sıralama sonrasındaki sırası giriş dizisindeki sırasıyla aynı kalır. Başka bir sıralama algoritması, özellikle karşılaştırma temelli olmayan bazı algoritmalar, aynı değere sahip öğelerin sırasını değiştirebilir, bu nedenle bu tür algoritmalar "stabil" olarak kabul edilmez.

Stabil sıralama, bazı uygulamalarda önemlidir, çünkü aynı değere sahip öğelerin orijinal sıralama sırası önemli bir bilgi taşıyorsa, bu bilgiyi korur. Bu özellik, verileri birden fazla kriterle sıralamak veya sıralamadan sonra başka işlemler yapmak için kullanışlı olabilir.

