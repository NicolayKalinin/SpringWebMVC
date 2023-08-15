package ru.netology.controller;

import ru.netology.model.Post;
import ru.netology.service.PostService;

import java.util.List;

  @RestController
  @RequestMapping
  public class postController {
    private final PostService service;

    public postController(PostService service) {
      this.service = service;
    }

    @GetMapping
    public List<Post> all() {
      return service.all();
    }

    @GetMapping
    public Post getById(@PathVariable long id) {
      return service.getById(id);
    }

    @PostMapping
    public Post save(@RequestBody Post post) {
      return service.save(post);
    }

    @DeleteMapping
    public void removeById(long id) {
      service.removeById(id);
    }
  }