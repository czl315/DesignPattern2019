package com.czl.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * czl
 * createTime:2019/11/14
 */
@RestController
public class MemoryController {

 private List<User> userList = new ArrayList<>();
 private List<Class<?>> classList = new ArrayList<>();

 /**
  * 演示堆内存溢出
  * VM Args: -Xmx32M -Xms32M
  * @return
  */
@GetMapping("/heap")
 public String heap(){
  int i = 0;
  while (true){
//   userList.add(new User(i++, UUID.randomUUID().toString()));
      userList.add(new User());
  }
 }

 /**
  * 演示非堆内存溢出（metaSpace溢出）
  * VM Args: -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
  * @return
  */
         @GetMapping("/nonheap")
 public String nonheap(){
  while (true){
   classList.addAll(Metaspace.createClasses());
  }
 }
}
