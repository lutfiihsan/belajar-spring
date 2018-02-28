package belajar.spring.ioc;

public class NasabahDaoTanpaIoC {
	private KoneksiDatabase koneksiDatabase;
	
	public NasabahDaoTanpaIoC() {
		koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		koneksiDatabase.setUsername("system");
		koneksiDatabase.setPassword("be-expert489");
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
