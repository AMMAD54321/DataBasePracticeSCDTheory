package com.ReadingList;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ReadingListRepository extends JpaRepository<Book,Long>{
    List<Book> findByReader (String reader);
}
