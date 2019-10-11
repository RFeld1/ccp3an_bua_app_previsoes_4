package br.usjt.ativ03previsaoDoTempo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ativ03previsaoDoTempo.model.Periodo;
import br.usjt.ativ03previsaoDoTempo.service.PeriodoService;

import java.util.List;


@Controller
public class PeriodoController {

    //a injeção de dependência ocorre aqui
	//O Spring se encarrega se instanciar a classe e disponibilizar essa instância	
	
	
	@Autowired
	private PeriodoService periodoService;
        

    @GetMapping("/previsao")
    public ModelAndView listarPrevisao() {
        //passe o nome da página ao construtor
        ModelAndView mv = new ModelAndView("lista_previsao");
        
        //para modelar o formulário
        mv.addObject(new Periodo());
        
        //Busque a coleção com o service
        List<Periodo> periodos = periodoService.listarTodos();

        //adicione a coleção ao objeto ModelAndView
        mv.addObject("periodos", periodos);

        //devolva o ModelAndView
        return mv;
    }
    
    @PostMapping("/previsao")
	public String salvar(Periodo periodo) {
		// salvando com o service
		periodoService.salvar(periodo);
		return "redirect:/previsao";
	}
    
}


