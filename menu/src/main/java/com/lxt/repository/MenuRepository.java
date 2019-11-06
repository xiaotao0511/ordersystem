package com.lxt.repository;

import com.lxt.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository {

    public List<Menu> findAll(int index, int limit);

    public int count();

    public Menu findById(String id);

    public void save(Menu menu);

    public void update(Menu menu);

    public void deleteById(String id);
}
