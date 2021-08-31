package com.nathaliafcardoso.meeting.room.correct.repository;

import com.nathaliafcardoso.meeting.room.correct.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}