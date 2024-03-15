package org.example.Service;

import org.example.Dto.MemberDto;

public interface MemberDashboardServer extends SuperService{
    MemberDto getData(String username);

    void Update(MemberDto memberDto);

    int BookCount(String memberUsername);
}
