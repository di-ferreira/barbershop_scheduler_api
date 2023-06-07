package com.ninegroup.barbershop_scheduler.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ninegroup.barbershop_scheduler.Entities.Schedule;
import com.ninegroup.barbershop_scheduler.Repositories.ScheduleRepository;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Schedule save(@RequestBody Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @GetMapping("{id}")
    public Schedule getById(@PathVariable Long id) {
        return scheduleRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }
}
