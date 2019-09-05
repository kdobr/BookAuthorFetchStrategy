package telran.ashkelon2018.books.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode (of= {"isbn"})
@Entity

public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	String  isbn;
	String title;
	@ManyToMany// (fetch = FetchType.EAGER)
	
	Set<Author> authors;

}
