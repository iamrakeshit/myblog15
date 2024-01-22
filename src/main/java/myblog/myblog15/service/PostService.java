package myblog.myblog15.service;

import myblog.myblog15.payload.PostDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    PostDto createRegsitration(PostDto postDto);
}
