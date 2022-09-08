package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository<Member, Long(Entity PK)>
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    Optional<Member> findByName(String name);
    // SELECT m FROM Member m WHERE m.name = ?, query 자동 생성 - 정해진 규칙에 따라 method name 지정

    Optional<Member> findByNameAndId(String name, Long id);

    // 다른 CRUD(method)는 JpaRepository에서 제공
}
