package com.acme.acmeflix.repository.crewmember;

import com.acme.acmeflix.model.screenplay.involved.CrewMember;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class CrewMemberImpl extends BaseRepositoryImpl<CrewMember> implements CrewMemberRepository {
    public CrewMemberImpl() {
        super(CrewMember.class, new HashSet<>());
    }
}
