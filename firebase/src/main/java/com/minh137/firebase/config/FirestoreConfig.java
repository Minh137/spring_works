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
		//JSON 클래스패스에서 로드
		InputStream serviceAccount = getClass().getClassLoader()
		.getResourceAsStream("minh137-85248-firebase-adminsdk-jhtc0-3443bb2c70.json");
		
		//JSON 파일이 존재하지 않을 경우 오류 처리
		if(serviceAccount == null) {
			throw new IOException("Firestore에 JSON파일을 찾을 수 없습니다.");
		}
		
		//FirebaseApp 초기화 확인
		if(FirebaseApp.getApps().isEmpty()) {
			FirebaseOptions options = new FirebaseOptions.Builder()
					  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
					  .build();

					FirebaseApp.initializeApp(options);
		}
		
		return FirestoreClient.getFirestore();
	}
	
}

