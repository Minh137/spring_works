package com.minh137.firebase.config;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Configuration
public class FirestoreConfig {
   
	@Bean
	public Firestore firestore() throws IOException {
		//JSON Ŭ�����н����� �ε�
		InputStream serviceAccount = getClass().getClassLoader()
		.getResourceAsStream("minh137-85248-firebase-adminsdk-jhtc0-3443bb2c70.json");
		
		//JSON ������ �������� ���� ��� ���� ó��
		if(serviceAccount == null) {
			throw new IOException("Firestore�� JSON������ ã�� �� �����ϴ�.");
		}
		
		//FirebaseApp �ʱ�ȭ Ȯ��
		if(FirebaseApp.getApps().isEmpty()) {
			FirebaseOptions options = new FirebaseOptions.Builder()
					  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
					  .build();

					FirebaseApp.initializeApp(options);
		}
		
		return FirestoreClient.getFirestore();
	}
	
}

