package com.acme.acmeflix.repository.crewmember;

import com.acme.acmeflix.model.screenplay.involved.CrewMember;
import com.acme.acmeflix.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CrewMemberImpl extends BaseRepositoryImpl<CrewMember> implements CrewMemberRepository {
    private static final AtomicLong idCounter = new AtomicLong(1);
    private static final Map<Long, CrewMember> crewMembers = new LinkedHashMap<>();

    @Override
    public AtomicLong getIdCounter() {
        return idCounter;
    }

    @Override
    public Class<CrewMember> getType() {
        return CrewMember.class;
    }

    @Override
    public Map<Long, CrewMember> getMap() {
        return crewMembers;
    }
}
