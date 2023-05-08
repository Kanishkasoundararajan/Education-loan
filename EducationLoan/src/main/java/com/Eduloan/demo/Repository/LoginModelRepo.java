package com.Eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Eduloan.demo.Model.LoginModel;

public interface LoginModelRepo extends JpaRepository<LoginModel,String>{

}
