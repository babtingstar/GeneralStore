package edu.store.kh.GeneralStore.service;

import edu.store.kh.GeneralStore.dto.Pizza;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

// 서비스 interface 는 어떤 자료형 / 어떤 매개변수를 이용해서 메서드 목록이 작성되어 있는지에 대한 목록
public interface PizzaService {

    // 피자 메뉴 모두 조회
    public List<Pizza> selectAll();

    // 피자 상세 조회
    public Pizza selectById(int id);

    // 피자 저장 - 자료형 void or int
    // void = 저장한 피자 메뉴 개수 확인 or 제대로 저장되었는지 확인 X
    // int = 저장할 피자 메뉴 다수 or 0 이하의 값으로 출력되면 제대로 저장되지 않았음을 확인
    public int insertPizza(int id, String name, int price, String description, MultipartFile imagePath);

    // 피자 수정 - 자료형 void or int
    // void = 수정한 피자 메뉴 개수 확인 or 제대로 수정되었는지 확인 X
    // int = 수정할 피자 메뉴 다수 or 0 이하의 값으로 출력되면 제대로 수정되지 않았음을 확인
    public int updatePizza(int id, String name, int price, String description, MultipartFile imagePath);

    // 피자 삭제 - 자료형 void or int
    // void = 삭제한 피자 메뉴 개수 확인 or 제대로 삭제되었는지 확인 X
    // int = 삭제할 피자 메뉴 다수 or 0 이하의 값으로 출력되면 제대로 삭제되지 않았음을 확인
    public int deletePizza(int id);
}
