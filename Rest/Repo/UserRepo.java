package com.firstlab.app.Rest.Repo;
import com.firstlab.app.Rest.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
