package com.project.kweater.repos;

import com.project.kweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by igor on 7/3/18
 *
 * @author Yovkhomishch I.A.
 */
public interface MessageRepo extends CrudRepository<Message , Long> {

    List<Message> findByTag(String tag);
}
