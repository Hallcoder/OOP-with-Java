package rw.ac.rca.OnlineShop.services.ServicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rw.ac.rca.OnlineShop.models.Course;
import rw.ac.rca.OnlineShop.repositories.ICourseRepository;
import rw.ac.rca.OnlineShop.services.ICourseService;

@Service
@AllArgsConstructor
public class CourseService implements ICourseService {
    private final ICourseRepository courseRepository;
    @Override
    public Course create(Course course) {
        return courseRepository.save(course);
    }
}
