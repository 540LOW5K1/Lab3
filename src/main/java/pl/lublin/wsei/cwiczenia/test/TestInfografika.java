package pl.lublin.wsei.cwiczenia.test;

import pl.lublin.wsei.cwiczenia.Infografika;

public class TestInfografika {

    static String exItem = "<item>\n" +
            "\t\t\t<title><![CDATA[Infografika - Koniunktura gospodarcza w maju 2022 r.]]></title>\n" +
            "\t\t\t<pubDate><![CDATA[Fri, 27 May 2022 15:42:00 +0200]]></pubDate>\n" +
            "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-maju-2022-r-,38,71.html</link>\n" +
            "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-maju-2022-r-,38,71.html</guid>\n" +
            "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022.png\" type=\"image/png\" width=\"2362\" height=\"4548\">\n" +
            "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
            "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
            "\t\t\t</media:content>\n" +
            "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/71/1/infografika_koniunktura_gospodarcza_05_2022,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
            "\t\t</item>";

    public static void main(String[] args){
        Infografika infografika = new Infografika(exItem);

        System.out.println("Infografika:");
        System.out.println("Tytul: " + infografika.tytul);
        System.out.println("Adres strony: " + infografika.adresStrony);
        System.out.println("Adres grafiki: " + infografika.adresGrafiki);
        System.out.println("Adres miniaturki: " + infografika.adresMiniaturki);
        System.out.println("Rozmiar: " + infografika.szerokosc + "x" + infografika.wysokosc);
    }
}
