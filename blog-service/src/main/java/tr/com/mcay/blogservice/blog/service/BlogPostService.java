package tr.com.mcay.blogservice.blog.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import tr.com.mcay.blogservice.blog.model.BlogPost;
import tr.com.mcay.blogservice.blog.repository.BlogPostRepository;

@Service
public class BlogPostService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final BlogPostRepository blogPostRepository;

    public BlogPostService(KafkaTemplate<String, String> kafkaTemplate, BlogPostRepository blogPostRepository) {
        this.kafkaTemplate = kafkaTemplate;
        this.blogPostRepository = blogPostRepository;
    }

    public String createBlogPost(BlogPost blogPost) {
        blogPostRepository.save(blogPost);  // Veritabanına kaydet
        kafkaTemplate.send("blog-topic", blogPost.getTitle() + ": " + blogPost.getContent());
        return "Blog post created and notification sent to Kafka: " + blogPost.getTitle();
    }
}
