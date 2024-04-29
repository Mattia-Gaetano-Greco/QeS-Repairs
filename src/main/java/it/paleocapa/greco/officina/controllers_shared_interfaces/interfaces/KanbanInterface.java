package it.paleocapa.greco.officina.controllers_shared_interfaces.interfaces;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import it.paleocapa.greco.officina.model.Ordine;

public interface KanbanInterface {
    public String vistaKanbanGet(@RequestParam("pos_kanban") String pos_kanban, Model model);
    public String aggiungiOrdineGet(Model model);
    public RedirectView aggiungiOrdinePost(Model model, @ModelAttribute("ordine") Ordine ordine);
    public String modificaOrdineGet(Model model, @RequestParam("id_ordine") String id_ordine);
    public RedirectView eliminaOrdine(Model model, @RequestParam("id_ordine") String id_ordine);
}
