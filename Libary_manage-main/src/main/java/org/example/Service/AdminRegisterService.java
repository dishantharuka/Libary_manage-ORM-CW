package org.example.Service;

import org.example.Dto.AdminDto;

public interface AdminRegisterService extends SuperService{
    int saveAdmin(AdminDto adminDto);
}
