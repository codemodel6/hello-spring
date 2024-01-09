package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  // /hello를 접속하면 이 함수를 실행한다. getMapping은 get 메소드라고 생각한다.
  @GetMapping("hello")
  // 모델 뷰 컨트롤러의 모델이다
  public String hello(Model model) {
    model.addAttribute("data", "이게 Value야");
    // retrun문은 resources/templates/hello.html을 찾는다.
    return "hello";
  }

  // hello-mvc에 접속시 함수 실행
  @GetMapping("hello-mvc")
  // RequestParam은 url에서 변수를 가져온다. ex) hello-mvc/?name=hihi
  // 인자 required는 파람이 꼭 필요한지 설정 기본값 true
  public String helloMvc(@RequestParam("data") String data, Model model) {
    model.addAttribute("data", data);
    return "hello-mvc";
  }
}
