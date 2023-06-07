package com.ninegroup.barbershop_scheduler.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninegroup.barbershop_scheduler.Entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}