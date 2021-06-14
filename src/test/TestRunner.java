
package test;
import pendaftaran.Peserta;

public class TestRunner {

	public static void main(String[] args) {
		Peserta pesertaKursus = new Peserta();

		System.out.println(pesertaKursus.cekKelayakan(80, 60, 55));
		System.out.println(pesertaKursus.cekKelayakan(65, 55, 50));
		System.out.println(pesertaKursus.cekKelayakan(100, 30, 60));
		System.out.println(pesertaKursus.cekKelayakan(30, 100, 60));
		System.out.println(pesertaKursus.cekKelayakan(60, 30, 100));
		System.out.println(pesertaKursus.cekKelayakan(80, 60, 30));
		System.out.println(pesertaKursus.cekKelayakan(60, 80, 30));
		System.out.println(pesertaKursus.cekKelayakan(60, 60, 50));
		System.out.println(pesertaKursus.cekKelayakan(100, 30, 0));

		
	}
}
