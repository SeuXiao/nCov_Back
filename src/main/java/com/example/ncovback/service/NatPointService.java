package com.example.ncovback.service;

import com.example.ncovback.entity.NatPoint;
import com.example.ncovback.mapper.NatPointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NatPointService {
    @Autowired
    private NatPointMapper natPointMapper;
    public List<NatPoint> getNatPointbycity(NatPoint natPoint) {
        return natPointMapper.getNatPointbycity(natPoint);
    }

    public Integer addTest(NatPoint natPoint) {
        return natPointMapper.addTest(natPoint);
    }

    public Integer editTest(NatPoint natPoint) {
        return natPointMapper.editTest(natPoint);
    }

    public Integer deleteTest(NatPoint natPoint) {
        return natPointMapper.deleteTest(natPoint);
    }

    public List<NatPoint> getTest() {
        return natPointMapper.getTest();
    }
}
