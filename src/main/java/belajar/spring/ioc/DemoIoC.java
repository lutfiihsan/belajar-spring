package belajar.spring.ioc;

public class DemoIoC {
public static void main(String[] args) {
	KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
	koneksiDatabase.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	koneksiDatabase.setUsername("system");
	koneksiDatabase.setPassword("be-expert489");
	
	NasabahDaoIoC nd = new NasabahDaoIoC(koneksiDatabase);
	
	nd.simpan();
	
}
}
