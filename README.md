# MelekOdev6

Testler Tb 173 te çalıştırılmıştır. 
Projede selenium framework kütüphanesi, apache maven, junit, java , web driver teknolojileri kullanılmıştır. 
Senaryolar test classları içerisinde yer almaktadır. 
Page sayfalarında ise @FindBy annotaionları kullanılarak ilgili locator elementleri ve methodlar bulunur.
Test classların içerisinde aşağıdaki şekilde @Tag, @DisplayName ve @Description lar yazılarak daha anlamlı hale getirilmiştir.

LoginTestClass (Login Senaryosu Testi)

1. Username ve password doğru bir şekilde girilir ve login başarılı bir şekilde gerçekleştiği görülür. -> login()
2. Password yanlış girilir ve "E-posta adresiniz, kullanıcı adınız veya şifreniz hatalı" texti kontrol edilir. -> loginFailed()
3. E-posta yanlış girilir ve "E-posta adresiniz, kullanıcı adınız veya şifreniz hatalı" texti kontrol edilir. -> loginFailed2()
4. Username ve pasword boş girilir ve "E-posta adresinizi veya kullanıcı adınızı girin." ve "Şifrenizi giriniz" texti kontrol edilir. -> loginFailed3()

mvn clean install -Dtest='LoginTestClass#login' şeklinde mvn komutuyla başarılı şekilde çalıştırabilirsiniz.


PostClassifiedTestClass (İlan Verme Senaryosu Testi) -> postClassifiedPage()
1. Login olduktan sonra Ücretsiz İlan Ver butonuna tıklanılır. İş makineleri & Sanayi ilanı verebilmek için bu kategori seçilir.
2. İlan kriterleri doldurulur.
3. Önizleme sayfasına tıklanır.
4. İlan Teklifleri sayfasına tıklanır.
5. Doping seçimi gerçekleştirilir.
6. Ödeme sayfasında kredi kartı bilgileri girilir ve sözleşmeye tıklanılıp ödeme yap butonuna tıklanılır.
7. Ödemenin başarılı bir şekilde tamamlandığı kontrol edilir.

Test fail edildiğinde screenshot alınır.

mvn clean install -Dtest='PostClassfiedTestClass#postClassifiedPage' şeklinde mvn komutuyla başarılı şekilde çalıştırabilirsiniz.


SearchClassifiedTestClass (Arama Sonuç Sayfası Testi) -> test1()

 1. Sahibinden.com anasayfa açılır
 2. Sol menüden 'otomobil' menüsüne tıklanır.
 3.'Bu Kategorideki Tüm İlanlar' yazısına tıklanır.
 4. Arama sonuçta ilanların geldiği kontrol edilir.
 5. Arama sonuçtaki ilk ilana tıklanır.
 6. İlan detayda 5. adımdaki veriler kontrol edilir.
 7. İlan detay sayfasın URL deki ilan no ile ilan detaydaki ilan no'nun aynı olduğu kontrol edilir.

mvn clean install -Dtest='SearchClassfiedTestClass#test1' şeklinde mvn komutuyla başarılı şekilde çalıştırabilirsiniz.








