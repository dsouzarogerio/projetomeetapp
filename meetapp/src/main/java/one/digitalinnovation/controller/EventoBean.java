package one.digitalinnovation.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import one.digitalinnovation.model.Evento;

@Named
@SessionScoped
public class EventoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Evento evento;

	private List<Evento> eventos = new ArrayList<Evento>();

	public String adicionarEvento() {

		eventos.add(evento);
		System.out.println("Evento " + evento.getNome() + " cadastrado com sucesso!");
		System.out.println("Evento " + evento.getOrganizacao() + " cadastrado com sucesso!");
		System.out.println("Evento " + evento.getLocal() + " cadastrado com sucesso!");
		System.out.println("Evento " + evento.getData() + " cadastrado com sucesso!");
		System.out.println("Evento " + evento.getHorario() + " cadastrado com sucesso!");
		
		clear();
		return "";
	}
	public void clear() {
		this.evento = new Evento();
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

}
