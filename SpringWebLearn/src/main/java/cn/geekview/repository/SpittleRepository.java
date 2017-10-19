package cn.geekview.repository;

import cn.geekview.entity.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(Long max, int count);
}
