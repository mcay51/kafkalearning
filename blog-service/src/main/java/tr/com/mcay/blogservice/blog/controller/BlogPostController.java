package tr.com.mcay.blogservice.blog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.mcay.blogservice.blog.model.BlogPost;
import tr.com.mcay.blogservice.blog.service.BlogPostService;

@RestController
@RequestMapping("/blogs")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @PostMapping
    public String createBlogPost(@RequestBody BlogPost blogPost) {
      return   blogPostService.createBlogPost(blogPost);  // Veritabanına kaydet
    }
}
