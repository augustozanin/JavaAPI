package br.edu.atitus.atitusound.dtos;

import java.util.List;
import java.util.UUID;

import br.edu.atitus.atitusound.entities.MusicEntity;

public class PlaylistDTO {
	private String name;
	private boolean public_share;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getPublic_share() {
		return public_share;
	}
	public void setPublic_share(boolean public_share) {
		this.public_share = public_share;
	}
	
}
