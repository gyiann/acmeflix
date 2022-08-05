package com.acme.acmeflix.service.crewmember;

import com.acme.acmeflix.model.screenplay.involved.CrewMember;
import com.acme.acmeflix.repository.BaseRepository;
import com.acme.acmeflix.repository.crewmember.CrewMemberRepository;
import com.acme.acmeflix.service.BaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrewMemberServiceImpl extends BaseServiceImpl<CrewMember> implements CrewMemberService {

    private final CrewMemberRepository crewMemberRepository;

    @Override
    public BaseRepository<CrewMember, Long> getRepository() {
        return crewMemberRepository;
    }
}
