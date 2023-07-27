package com.project.practice.controller;

import com.project.practice.model.Member;
import com.project.practice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/save")
    public void saveMember(@RequestBody Member member)
    {
        memberService.saveMember(member);
    }

    @GetMapping("/getAll")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @GetMapping("/get")
    public Member getMemberById(@RequestParam String Id){
        return memberService.getMemberById(Id);
    }

}
