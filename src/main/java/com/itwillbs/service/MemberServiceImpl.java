package com.itwillbs.service;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.itwillbs.dao.MemberDAO;
import com.itwillbs.domain.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	
	//멤버변수 (부모 인터페이스 변수) 객체 생성 자동화 됨 => @Repository MemberDAOImpl 찾아감
	@Inject
	private MemberDAO memberDAO;
	
	@Override
	public void insertMember(MemberDTO memberDTO) {
		//날짜 설정
		memberDTO.setDate(new Timestamp(System.currentTimeMillis()));
		System.out.println("MemberServiceImpl insertMember()");
		// 메서드 호출
		memberDAO.insertMember(memberDTO);
	}

	@Override
	public MemberDTO userCheck(MemberDTO memberDTO) {
		System.out.println("MemberService userCheck()");
		return memberDAO.userCheck(memberDTO);
	}

	@Override
	public MemberDTO getMember(String id) {
		System.out.println("MemberService getMember()");
		return memberDAO.getMember(id);
	}

	@Override
	public void updateMember(MemberDTO memberDTO) {
		System.out.println("MemberService updateMember()");
		memberDAO.updateMember(memberDTO);
	}

	@Override
	public void deleteMember(MemberDTO memberDTO) {
		System.out.println("MemberService deleteMEmber()");
		memberDAO.deleteMember(memberDTO);
		
	}

	@Override
	public List<MemberDTO> getMemberList() {
		System.out.println("MemberService getMemberList()");
		return memberDAO.getMemberList();
	}

}
