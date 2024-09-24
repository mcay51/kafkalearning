package tr.com.mcay.blogservice.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.mcay.blogservice.blog.model.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
