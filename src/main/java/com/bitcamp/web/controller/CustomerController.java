package com.bitcamp.web.controller;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


/**
 * CustomerController
 */
@RestController // controller의 자식..controller역할+rest역할
@RequestMapping("/customers")
public class CustomerController {
    @Autowired CustomerDTO customer;
    @Autowired CustomerService customerService;	
    @Autowired Printer p;
    @Autowired PageProxy pxy;

    //회원가입
    @PostMapping("") //join쿼리는 insert니까 postmapping사용, insert(POSTMAPPING)는 id가 없다+클래스 전체 어노테이션으로 /customers/줌->비워둠
    public HashMap<String,Object> join(@RequestBody CustomerDTO param){ //hashmap이 json하고 호환됨..
        System.out.println("=====post mapping======");
        System.out.println(param.getCustomerId());
        System.out.println(param.getPassword());
        System.out.println(param.getCustomerName());

        HashMap<String,Object> map = new HashMap<>();
        map.put("result","success"); //메소드 시행성공하면 result 값을 success로 보낸다 

        customerService.addCustomer(param);

        return map;
    }

    //고객수 카운트
    @GetMapping("/count")
    public String count() {
        System.out.println("CustomerController() 경로로 들어옴");
        int count = customerService.countAll();
        
        //System.out.println("고객의 총인원: " + count);
        p.accept("람다가 출력한 고객의 총인원: " + count);
        return count + "";
    }

    //로그인
    @GetMapping("/{customerId}/{password}") //{}부분은 바뀐다는 의미. .view(js)에서 보내는 값 받아오기..
    public CustomerDTO login(@PathVariable("customerId")String id, 
                             @PathVariable("password")String pass) {
                            
      //  System.out.println("컨트롤러넘어온 pw:"+ pass);

        customer.setCustomerId(id); /// 힙에 있는 DTO instance에 저장
        customer.setPassword(pass);
      

       return customerService.login(customer);
    }

    //회원검색byId
    @GetMapping("{/customerId}") 
    public CustomerDTO getCustomer(@PathVariable String customerId){
       
    System.out.println("id 검색 진입"+customerId);

        return  customerService.findCustomerByCustomerId(customerId);
    }

    //all 회원 list
    @GetMapping("/page/{pageNum}")
    public  HashMap<String, Object> list(@PathVariable String pageNum){
       // List<CustomerDTO> list = new ArrayList<>(); //1차원, 길이만존재. 인스턴스. row.index로 위치찾음
        HashMap<String, Object> map = new HashMap<>(); //2차원, 길이와 넓이가 존재. 좌표로 위치찾음
        map.put("totalCount",customerService.countAll());        
        map.put("page_num",pageNum);
        map.put("page_size","5");
        map.put("block_size","5");
        pxy.execute(map);             

        map.put("list", customerService.findCustomers(pxy));
        map.put("pxy", pxy);

        return map;
    }

    //회원정보업데이트
    // public String update(@RequestBody CustomerDTO param) {

    @PutMapping("/{customerId}")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO param) {
        System.out.println("수정 할 객체: "+param.toString());
        int res = customerService.updateCustomer(param);
        System.out.println("====> "+res);
        if(res == 1){
            customer = customerService.findCustomerByCustomerId(param.getCustomerId());
            System.out.println("FIND");
        }else{
            System.out.println("컨트롤러 수정 실패");
        }
        return customer;
    }

    //회원삭제
    @DeleteMapping("/{customerId}")
    public HashMap<String,Object> deleteCustomer(@PathVariable String customerId) {
        HashMap<String, Object> map = new HashMap<>();
        customer.setCustomerId(customerId);
        customerService.deleteCustomer(customer);
        map.put("result","탈퇴성공");
        return map;
    }
  
}