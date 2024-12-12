package com.minh137.firebase.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import com.minh137.firebase.dto.User;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.minh137.firebase.dto.User;

@Repository
public class UserDao {

	@Autowired
	private Firestore firestore;
	
	//����
	public void createUser(User user) throws ExecutionException, InterruptedException {
		CollectionReference users = firestore.collection("users");
		users.document(user.getId()).set(user).get();
	}
	
	//�б� by id
	public User getUser(String id) throws ExecutionException, InterruptedException {
		DocumentReference docRef = firestore.collection("users").document(id);
        DocumentSnapshot document = docRef.get().get();
        if(document.exists()) {
        	return document.toObject(User.class);
        }
        return null;
	}
	
	//��ü�б� List
	public List<User> getAllUsers() throws ExecutionException, InterruptedException {

		List<User> userList = new ArrayList<>();		
		ApiFuture<QuerySnapshot> query = firestore.collection("users").get();
		List<QueryDocumentSnapshot> documents = query.get().getDocuments();
		
		for (QueryDocumentSnapshot document : documents) {
	       userList.add(document.toObject(User.class));
		}
		
		return userList;
	}
	
	
	//����
	public void updateUser(User user) throws ExecutionException, InterruptedException {
		firestore.collection("users").document(user.getId()).set(user).get();
	}
	
	//����
	public void deleteUser(String id) throws ExecutionException, InterruptedException {
	   firestore.collection("users").document(id).delete().get();	
	}
}
