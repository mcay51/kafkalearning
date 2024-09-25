# kafkalearning

## Mikroservis Projesi ile Kafka

Bu proje, **Blog Service** ve **Notification Service** adında iki mikroservis ile birlikte Kafka, Zookeeper, PostgreSQL ve Kafka Manager içermektedir. Mikroservisler, asenkron mesajlaşma için Kafka kullanarak birbirleriyle iletişim kurmaktadır.

## Proje Yapısı

- **blog-service**: Kafka konusuna mesaj gönderen mikroservis.
- **notification-service**: Kafka konusundan mesajları dinleyip işleyen mikroservis.
- **kafka**: Mesaj broker'ı.
- **zookeeper**: Kafka broker'larını yöneten hizmet.
- **postgresql**: Veri depolamak için kullanılan veritabanı.
- **kafka-manager**: Kafka'yı yönetmek için web tabanlı araç.

## Gereksinimler

- Docker
- Docker Compose

## Başlarken

### Depoyu Klonlama

```bash
git clone https://github.com/mcay51/kafkalearning.git
cd kafkalearning
```
### Servisleri Oluşturma ve Çalıştırma

1. Docker ve Docker Compose'un yüklü olduğundan emin olun.
2. `docker-compose.yml` dosyanızın bulunduğu dizine gidin.
3. Aşağıdaki komutu çalıştırarak servisleri oluşturun ve başlatın:
```bash
docker-compose up --build
```
### Servislere Erişim

- **Blog Servisi**: [http://localhost:8091](http://localhost:8091) adresinden erişilebilir.
- **Bildirim Servisi**: [http://localhost:8092](http://localhost:8092) adresinden erişilebilir.
- **Kafka Manager**: [http://localhost:9000](http://localhost:9000) adresinden erişilebilir.
- **PostgreSQL**: `localhost:5432` adresinden erişilebilir.

### Mesaj Tüketimi

blog-topic konusundaki mesajları tüketmek için aşağıdaki komutu kullanabilirsiniz:

```bash
/opt/kafka_2.13-2.8.1/bin/kafka-console-consumer.sh --topic blog-topic --from-beginning --bootstrap-server kafka:9092
```
Eğer bu komutu Docker dışından çalıştırıyorsanız, localhost:9092 yerine uygun Kafka sunucu adresini değiştirmeyi unutmayın.