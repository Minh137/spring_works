package net.minh137.comunity.service;

public interface FileUpload {
	//Ȯ���� �б�
	String[] getAllowedExt();
	
	//Ȯ���� ����
	void setAllowedExt(String[] ext);
	
	//����ũ�����
	void setMaxSize(long maxSize);
	
	//����ũ�� ��������
	long getMaxSize();
	
	//��μ���
	void setAbsolutePath(String path);
	
	//��ΰ�������
	String getAbsolutePath();
	
	//Ȯ���ڰ�������
	String getFileExt(String filename);
	
}