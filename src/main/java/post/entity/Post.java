package post.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(min=1, max=255)
	@Column(nullable=false)
	private String title;
	
	@Size(max=255)
	private String subTitle;
	
	@NotNull
	@Size(min=1, max=100000000)
	@Column(length= 100000000, nullable=false)
	private String content;
	
	private Date regDate;
}
