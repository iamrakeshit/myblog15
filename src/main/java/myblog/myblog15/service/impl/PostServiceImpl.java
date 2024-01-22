package myblog.myblog15.service.impl;

import myblog.myblog15.entity.Post;
import myblog.myblog15.payload.PostDto;
import myblog.myblog15.repository.PostRepository;
import myblog.myblog15.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository repository;

    public PostServiceImpl(PostRepository repository) {
        this.repository = repository;
    }

    @Override
    public PostDto createRegsitration(PostDto postDto) {
        Post post = new Post();
        post.setName(postDto.getName());
        post.setEmail(postDto.getEmail());
        post.setMobile(postDto.getMobile());
        Post save = repository.save(post);

        PostDto dto = new PostDto();
        dto.setId(save.getId());
        dto.setName(save.getName());
        dto.setEmail(save.getEmail());
        dto.setMobile(save.getMobile());
        return dto;
    }
}
