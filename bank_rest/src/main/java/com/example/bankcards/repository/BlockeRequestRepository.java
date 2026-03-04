package com.example.bankcards.repository;

import com.example.bankcards.entity.BlockRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockeRequestRepository extends JpaRepository<BlockRequest, Integer> {

}
