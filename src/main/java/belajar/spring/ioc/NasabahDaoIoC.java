package belajar.spring.ioc;

public class NasabahDaoIoC {
	//tidak ada inisialisasi, karena sudah dihandle orang lain
	private KoneksiDatabase koneksiDatabase;
	
	//contructor injection
	public NasabahDaoIoC(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
	}

	private void connect() {
		koneksiDatabase.connect();
		
	}
	
	


	private void disconnect() {
		
	}
	
	public void simpan() {
		connect();
		System.out.println("Menyimpan data");
		disconnect();
	}
	
	public void cariData() {
		
	}
	
}
