package egovframework.com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import egovframework.rte.fdl.cryptography.EgovEnvCryptoService;
import egovframework.rte.fdl.cryptography.EgovPasswordEncoder;
import egovframework.rte.fdl.cryptography.impl.EgovEnvCryptoServiceImpl;

public class EgovEnvCryptoAlgorithmCreateTest {
	
	
	 
	//계정암호화키 키
	public String algorithmKey = "egovframe";
 
	//계정암호화 알고리즘(MD5, SHA-1, SHA-256)
	public String algorithm = "SHA-256";
 
	//계정암호화키 블럭사이즈
	public int algorithmBlockSize = 1024;
 
	public static void main(String[] args) {
		
		EgovEnvCryptoAlgorithmCreateTest cryptoTest = new EgovEnvCryptoAlgorithmCreateTest();
 
		EgovPasswordEncoder egovPasswordEncoder = new EgovPasswordEncoder();
		egovPasswordEncoder.setAlgorithm(cryptoTest.algorithm);
 
		System.out.println("------------------------------------------------------");
		System.out.println("알고리즘(algorithm) : "+cryptoTest.algorithm);
		System.out.println("알고리즘 키(algorithmKey) : "+cryptoTest.algorithmKey);
		System.out.println("알고리즘 키 Hash(algorithmKeyHash) : "+egovPasswordEncoder.encryptPassword(cryptoTest.algorithmKey));
		System.out.println("알고리즘 블럭사이즈(algorithmBlockSize)  :"+cryptoTest.algorithmBlockSize);
		
		
		String passwd="egovuser";		

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:egovframework/com/test/context-crypto.xml"});
		
		EgovEnvCryptoService cryptoService = context.getBean(EgovEnvCryptoServiceImpl.class);
		
		System.out.println(passwd+"->["+cryptoService.encrypt(passwd)+"]");


		
 
	}


}
