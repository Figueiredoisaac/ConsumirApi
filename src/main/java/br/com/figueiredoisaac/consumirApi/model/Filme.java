package br.com.figueiredoisaac.consumirApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "filmes")
public class Filme {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "movie_rank")
	private Integer rank;
	@Column(name = "movie_title")
	private String title;
	@Column(name = "movie_fullTitle")
	private String fullTitle;
	
	
	
	public Filme() {
	}
	
	public Filme(Integer rank, String title, String fullTitle) {
		this.rank = rank;
		this.title = title;
		this.fullTitle = fullTitle;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFullTitle() {
		return fullTitle;
	}
	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}
	@Override
	public String toString() {
		return "Filme [rank=" + rank + ", title=" + title + ", fullTitle=" + fullTitle + "]";
	}
	
	
}
