package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Com essa classe DTO eu posso customizar a saída dos dados da API
public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getLongDescription();
	}
	
	//DTOs só necessitam de GETTERS

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
