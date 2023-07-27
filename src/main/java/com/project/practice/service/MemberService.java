package com.project.practice.service;

import com.project.practice.model.Member;
import com.project.practice.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepo memberRepository;

    public void saveMember( Member member){
        memberRepository.save(member);
    }

    public List<Member> getAllMembers(){
      return  memberRepository.findAll();
    }

    public Member getMemberById(String id){
        return memberRepository.getById(id);
    }
}
