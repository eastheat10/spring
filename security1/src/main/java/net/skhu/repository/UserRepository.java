package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserid(String userid);

}

// 리턴 타입이 User객체이므로 조회된 레코드가 2개 이상이라면 에러가 발생한다.
// user 테이블에서 userid필드에 unique index를 생성하는 것이 좋다.