package ru.kitaezov.taskmanager.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kitaezov.taskmanager.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
