package post.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import post.entity.Post;
import post.repository.PostRepository;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String form(Post post) {
		return "form";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(Post post) {
		post.setRegDate(new Date());
		
		return "redirect:/post/" + postRepository.save(post).getId();
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Post> postList = postRepository.findAll();
		model.addAttribute("postList", postList);
		
		return "blog";
	}
	
	@RequestMapping("/{id}")
	public String view(Model model, @PathVariable int id) {
		Post post = postRepository.findOne(id);
		model.addAttribute("post", post);
		return "post";
	}
}
