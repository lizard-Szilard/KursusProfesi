
package pendaftaran;

public class Peserta {
	public String cekKelayakan(int nilaiMatik, int nilaiFisika, int nilaiKimia){
		/*
		Sesorang layak mengikuti kursus apabila:
		1. Minimal memiliki nilai Matematika sebesar 65, dan minimal memiliki nilai Fisika sebesar 55, dan minimal memiliki nilai Kimia sebesar 50
		2. Atau , total nilai untuk Matematika, Fisika dan Kimia minimal sebesar 190
		3. Atau, total nilai untuk Matematika dan Fisika minimal sebesar 140
		*/
		int totalSemua, nilaiMatFisika;
		totalSemua = nilaiMatik + nilaiFisika + nilaiKimia;
		nilaiMatFisika = nilaiMatik + nilaiFisika;
		
		if(nilaiMatik == 65 && nilaiFisika == 55 && nilaiKimia == 50 || totalSemua == 190 || nilaiMatFisika == 140 ){
			return "layak ikut kursus";
		}else{
			return "tidak layak ikut kursus";
		}
		
	}
}
