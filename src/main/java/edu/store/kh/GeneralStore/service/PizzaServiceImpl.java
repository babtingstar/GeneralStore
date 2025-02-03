package edu.store.kh.GeneralStore.service;

import edu.store.kh.GeneralStore.dto.Pizza;
import edu.store.kh.GeneralStore.mapper.PizzaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaMapper pizzaMapper;


    @Override
    public List<Pizza> selectAll() {
        // 피자 메뉴를 목록 형태로 가져오기
        return pizzaMapper.selectAll();
    }

    @Override
    public Pizza selectById(int id) {
        // 선택한 id 값으로 피자 메뉴 1가지를 선택해서 상세 조회
        return pizzaMapper.selectById(id);
    }

    @Override
    public int insertPizza(Pizza pizza) {
        // 피자 메뉴에 피자를 추가할 경우 이미지를 저장할 경로를설정하여 추가하
        return 0;
    }

    @Override
    public int updatePizza(Pizza pizza) {
        // 현재 시간 추가해서 이미지 저장 시 이름 겹치지 않도록 설정
        // 피자 메뉴에 피자를 추가할 경우 이미지 저장할 경로를 설정하여 추가
        // 기존에 저장된 이미지 삭제 또는 보존
        return 0;
    }

    @Override
    public int deletePizza(int id) {
        // 특정 아이디로 저장된 피자 메뉴를 삭제
        return pizzaMapper.deletePizza(id); // Mapper 에 저장된 delete sql 구문 사용
    }
}
