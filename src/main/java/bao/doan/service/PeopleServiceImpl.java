package bao.doan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bao.doan.model.People;
import bao.doan.repository.PeopleRepository;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {

  @Autowired
  PeopleRepository peopleRepository;

  @Override
  public List<People> getAll() {
    return peopleRepository.findAll();
  }

}
