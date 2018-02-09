package com.lcassiol.SimpleBackend.repository;

import com.lcassiol.SimpleBackend.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMessageRepository extends JpaRepository<Message, Long> {
}
