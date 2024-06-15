package rw.ac.rca.OnlineShop.services.ServicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rw.ac.rca.OnlineShop.models.Student;
import rw.ac.rca.OnlineShop.repositories.IStudentRepository;
import rw.ac.rca.OnlineShop.services.IStudentService;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {
    private final IStudentRepository studentRepository;
    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }
}
