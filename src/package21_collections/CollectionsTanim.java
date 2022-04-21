package package21_collections;

public class CollectionsTanim {

     /*
    Collections = nesnelerden olusan bir toplulugu bir arada tutan yapilardir
    class ve interface olanlari vardir
    obj gerekiyorsa class ladaki const lari kullanmaliyim
    interface lerdeki ler ise set lere kurallara uymasini söyler cati yaplar set list Que nasil olmali belirliyor

    1-Set (Küme) -- Set teki hersey uqinik tir farklidir. Farklilik önemli
    2- Queue (Sira) -- Bir collection üyesi bu sekilde tanimlandi ise siralama önemlidir
    3- Linked (Bagli) -- Bunlar birbirine bagli
    4- Tree (Dogal Sirali) --Nasil eklemniz önemli degil bu görüldügü zaman gelen elementleri gerekli yere koyar
    5- Hash () --Bir algoritmadir herkese benzersiz bir numara veririr.Bu kod la neyin nerede oldugu bulunur.

    Bazilari interface dir; genel olarak o gruptakilerin özelliklerini belirler
    Bazilari class tir; biz o classlari kullanip obj üretebiliriz
    coll üyeleri tasidiklari kelimelere göre özellik saglarlar

    LinkedHashSet ==>  Link birbirine bagli hash bulunmasi hizli lur set elementler farkli

    bir class iki farkli yerden inherit edilebilir

    Linked List Class
    --Ilk eleman her zaman head dir ve head de data yoktur, sadece adress vardir
    --Son eleman (tail) null i point eder.
    --Her elemanin icinde data ve address kismi olmak  üzere iki kisim vardir.
    --Tüm elemanlar pointer'lar address ler kullanilarak birbirine baglanir
    --Her eleman node olarak adlandirilir.
    --Pointer yapisindan dolayi bir elemana ulasmada yavastir
    HEM LIST HEMDE QUEUE interface lerin chil di dir iksinin de method u nuda kullanir


    SET (Interface) arana bulma hizli ise bu kullanilir küme mantigi ile calisir her elementi unique dir.
    Java elemntleri unique yapmak icin HASH ALgorutmasi kullanir

    HashSets  basamak sayisi+rakamlar toplami kendin yapabilirsin ama cakismalr olur
    Java ayni bicimdeki elemetleri belirli kaliplarla Hash kodu ile esliyor

    Hahing farkli büüyklükteki girdilerden sabit büyüklükte bir ciktiya donudturme surecine verieln isim
    bir ogrenci no dan ogrenci simi sorgulandiginda numarasi bulunup tum bilgilere ulasilabilir

    SET METhodlari

    1-- add() Set e eleman ekler
    2-- addAll(coll) istenilen collectiondaki tüm elentleri ekler
    3-- clear tüm elenlari siler
    4-- contains(eleman) intenen eleman sette varsa true yoksa false
    5-- contaniansAll(coll) istenn coll tumu set te var mi
    6-equals(set2) istenen set le tüm elemanlar ayni ise true
    7-- isEmpty sette hic elema yoksa true
    8-- remove(eleman) istenen eleman bulunursa siler ve true dondurur,bulmazsa false dondurur
    9-- removeAll(coll) coll nin tum elemanlarini bulursa siler ve true dondurur, bulmazsa false
    10- size set in elemn sayisni
    11-- retainAll(coll)  coll nin tüm elemanlarinin disindakitüm elelmalari siler silme islmei yapti ise true,yoksa false dondurur

     ****** QUEUE : interface dolayisiyla constructer i yoktur
     LInkedList ve PriorityQue kullanilir hangi cos u kullansak ona göre üretir
    En sona eklenir en bastan silenir ----> en önemki özelligi
    1--peek ilk elemni silmaeden döndürü
    2-- poll ilk elemani queue den siler ve bize return eder
    3-- offer eleman eklemek icin kullanilir
    remove ve poll ilk elemani siler ve return eder.
    ama collection da eleman yoksa remove methodu exception atar poll methodu exception atmaz null return eder

    ****DEQUE . IKI taraftan eklenir cikarilir FIFO VE LIFO
    LinkedList kullanilir. null kabul etmiyor





     */
}
