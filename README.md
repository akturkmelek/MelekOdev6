# MelekOdev6

Testler Tb 173 te çalıştırılmıştır. Selenium framework kütüphanesi kullanılarak

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








