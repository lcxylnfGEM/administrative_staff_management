package com.zzu.staff.management.service;

import com.zzu.staff.management.entity.School;
import com.zzu.staff.management.entity.SchoolVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface SchoolService {
    List<School> queryAll();

    List<SchoolVo> queryAllVo(String sName, Integer sType);

    School queryById(long id);

    int insert(School school);

    int deleteById(long id);

    int update(School school);

    int importData(MultipartFile file,int schoolType) throws IOException;
}
