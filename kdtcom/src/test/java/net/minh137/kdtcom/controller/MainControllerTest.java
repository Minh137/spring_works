package net.minh137.kdtcom.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import net.minh137.kdtcom.service.ClientIpAddress;
import net.minh137.kdtcom.service.FileUploadService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
   "file:src/main/webapp/WEB-INF/spring/root-context.xml",
   "file:src/main/webapp/WEB-INF/spring/servlet-context.xml"
})
public class MainControllerTest {
   
   private MockMvc mockMvc;
   
   @Mock
   private FileUploadService fileUploadService;
   
   @Mock
   private ClientIpAddress clientIpAddress;
   
   @InjectMocks
   private MainController mainController;
   
   @Before
   public void setUp() {
      MockitoAnnotations.initMocks(this);
      mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
   }

   @Test
   public void testRegisterPost() throws Exception {
       //Mocking ������ ��ü ����
      when(clientIpAddress.getClientIpAddress()).thenReturn("127.0.0.1");
      mockMvc.perform(post("/register")
         .param("userid", "testUser")
         .param("userpass", "testUser")
         .param("username", "testName")
         .param("useremail", "asdf@asdf.com")
         .param("usertel", "010-1234-0144")
         .param("postcode", "12345")
         .param("address", "��⵵ ��¼��")
         .param("address_detail", "��¼�� 304")
         .param("address_extra", "����")
         .param("userprofile", "�Ϳ�~~!"))
          .andExpect(status().isOk())  //���°� 200���� �������� ����
          .andExpect(view().name("kdtcom.index"))  //�� �̸� 
          .andExpect(model().attributeDoesNotExist("error"));  //���� �޽���
   }      
   
}