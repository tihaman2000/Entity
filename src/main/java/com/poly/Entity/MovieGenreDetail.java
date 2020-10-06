package com.poly.Entity;
// Generated Oct 6, 2020, 8:38:42 AM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MovieGenreDetail generated by hbm2java
 */
@Entity
@Table(name = "MovieGenreDetail", schema = "dbo", catalog = "MovieManagement")
public class MovieGenreDetail implements java.io.Serializable {

	private Integer movieGenreDetailId;
	private Integer movieId;
	private Integer genreId;

	public MovieGenreDetail() {
	}

	public MovieGenreDetail(Integer movieId, Integer genreId) {
		this.movieId = movieId;
		this.genreId = genreId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "movieGenreDetailId", unique = true, nullable = false)
	public Integer getMovieGenreDetailId() {
		return this.movieGenreDetailId;
	}

	public void setMovieGenreDetailId(Integer movieGenreDetailId) {
		this.movieGenreDetailId = movieGenreDetailId;
	}

	@Column(name = "movieId")
	public Integer getMovieId() {
		return this.movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	@Column(name = "genreId")
	public Integer getGenreId() {
		return this.genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

}