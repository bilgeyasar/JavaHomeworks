
#### Projede şu hatayı alıyordum:

Unable to find required classes (javax.activation.DataHandler and javax.mail.internet.MimeMultipart). Attachment support is disabled.

#### Aynı hatayla karşılaşanlar için şu şekilde bir çözüm işinize yarayacaktır.
#### Belirtmek isterim ki activation.jar ve mail.jar olarak iki dosyayı indirip projemize dahil etmemiz gerekiyor.
#### Bazılarında yalnızca mail.jar yeterli olmuş olabilir fakat bende ikisi gerekli oldu.

#### activation.jar linki için [activation.jar](http://www.java2s.com/Code/JarDownload/activation/activation.jar.zip)

#### mail.jar linki için [mail.jar](http://www.java2s.com/Code/JarDownload/mail/mail.jar.zip)

#### Bunları import etmek için de:

- Proje üstüne gelip sağ tıklayın build path'i seçin.
- Configure Build Path tıklayın.
- Libraries'e tıklayın ve "Add External JARs" seçin.
- mail.jar ve activation.jar'ı ekleyin.
- Apply and ok'a tıklayın.
- Projenizi yeniden çalıştırdığınızda sorun çözülecektir.
